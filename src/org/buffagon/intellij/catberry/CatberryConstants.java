package org.buffagon.intellij.catberry;

import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Prokofiev Alex
 */
public final class CatberryConstants {
  public static final String DEFAULT_COMPONENT_JS = "index.js";
  public static final String DEFAULT_TEMPLATE_PREFIX = "template.";
  public static final String DEFAULT_TEMPLATE_ENGINE = "handlebars";
  public static final String CAT_COMPONENT_JSON = "cat-component.json";
  public static final String CATBERRY_COMPONENTS = "catberry_components";
  public static final String CATBERRY_STORES = "catberry_stores";
  public static final Set<String> SPECIAL_COMPONENT_NAMES = new HashSet<String>();
  public static final String TEMPLATE_PASCAL_NAME = "__pascalName__";
  public static final String TEMPLATE_NAME = "__name__";
  public static final String CATBERRY_COMPONENT_TAG_PREFIX = "cat-";


  static {
    SPECIAL_COMPONENT_NAMES.addAll(Arrays.asList("document", "head"));
  }

  public static final NotificationGroup CATBERRY_NOTIFICATION_GROUP =
      new NotificationGroup("My notification group", NotificationDisplayType.BALLOON, true);
}
