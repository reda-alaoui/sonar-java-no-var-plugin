package me.redaalaoui.sonar_java_no_var_plugin;

import org.sonar.api.Plugin;

/** @author Réda Housni Alaoui */
public class JavaNoVarPlugin implements Plugin {

  public void define(Context context) {
    context.addExtension(JavaNoVarRulesDefinition.class);
    context.addExtension(JavaNoVarRegistrar.class);
  }
}
