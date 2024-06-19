package be.sha2001.featureflags.common.aspect;

import be.sha2001.featureflags.common.annotations.IsFeatureEnabled;
import be.sha2001.featureflags.common.infra.unleash.UnleashService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
@RequiredArgsConstructor
public class IsFeatureEnabledAspect {

    private final UnleashService unleashService;

    @Around("@annotation(isFeatureEnabled)")
    public Object logGdprEvent(ProceedingJoinPoint joinPoint, IsFeatureEnabled isFeatureEnabled) throws Throwable {
        log.info("Checking if feature {} is enabled: ", isFeatureEnabled.value());
        unleashService.isFeatureEnabled(isFeatureEnabled.value());
        return joinPoint.proceed();
    }
}
