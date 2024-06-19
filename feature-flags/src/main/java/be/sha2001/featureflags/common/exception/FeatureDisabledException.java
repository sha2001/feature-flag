package be.sha2001.featureflags.common.exception;

public class FeatureDisabledException extends Exception {
    public FeatureDisabledException(String s) {
        super(s);
    }
}
