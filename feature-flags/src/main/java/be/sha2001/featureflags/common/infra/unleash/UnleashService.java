package be.sha2001.featureflags.common.infra.unleash;

import be.sha2001.featureflags.common.exception.FeatureDisabledException;
import io.getunleash.Unleash;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UnleashService {

    private final Unleash unleash;

    public void isFeatureEnabled(String featureName) throws FeatureDisabledException {
        if (!unleash.isEnabled(featureName)) {
            throw new FeatureDisabledException("Feature " + featureName + " is disabled");
        }

    }

}
