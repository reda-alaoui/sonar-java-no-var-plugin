package me.redaalaoui.sonar_java_no_var_plugin;

import java.util.Collections;
import java.util.List;
import org.sonar.check.Rule;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.tree.Tree;
import org.sonar.plugins.java.api.tree.VariableTree;

/** @author Réda Housni Alaoui */
@Rule(key = "NoVar")
public class NoVarRule extends IssuableSubscriptionVisitor {

  @Override
  public List<Tree.Kind> nodesToVisit() {
    return Collections.singletonList(Tree.Kind.VARIABLE);
  }

  @Override
  public void visitNode(Tree tree) {
    VariableTree variable = (VariableTree) tree;
    if (!variable.type().is(Tree.Kind.VAR_TYPE)) {
      return;
    }
    reportIssue(
        variable.simpleName(),
        "Instead of using \"var\", declare the variable with an explicit type.");
  }
}
