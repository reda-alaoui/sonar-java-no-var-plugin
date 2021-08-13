package me.reda_alaoui.sonar_java_no_var_plugin;

import java.util.Collections;
import org.sonar.plugins.java.api.CheckRegistrar;
import org.sonar.plugins.java.api.JavaCheck;

/** @author Réda Housni Alaoui */
public class JavaNoVarRegistrar implements CheckRegistrar {
  public void register(RegistrarContext registrarContext) {
    Iterable<Class<? extends JavaCheck>> checkClasses =
        Collections.<Class<? extends JavaCheck>>singletonList(NoVarRule.class);
    registrarContext.registerClassesForRepository(
        JavaNoVarRepository.KEY, checkClasses, checkClasses);
  }
}
