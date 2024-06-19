package be.sha2001.featureflags.common.annotations;

/** creat a custom annotation to check if a feature is enabled or not */
public @interface IsFeatureEnabled {
    String value();
}
