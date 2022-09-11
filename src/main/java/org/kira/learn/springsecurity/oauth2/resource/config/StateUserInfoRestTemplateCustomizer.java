package org.kira.learn.springsecurity.oauth2.resource.config;

import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.filter.state.StateKeyGenerator;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeAccessTokenProvider;
import org.springframework.security.oauth2.common.util.RandomValueStringGenerator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * Description
 * -
 * -
 *
 * @author Bovin
 * @version v1.0
 * @since 2021-01-25 16:04
 **/
@Component
public class StateUserInfoRestTemplateCustomizer implements UserInfoRestTemplateCustomizer {
    @Override
    public void customize(OAuth2RestTemplate template) {
        AuthorizationCodeAccessTokenProvider accessTokenProvider = new AuthorizationCodeAccessTokenProvider();
        accessTokenProvider.setStateKeyGenerator(new StateKeyGenerator() {
            private RandomValueStringGenerator generator = new RandomValueStringGenerator(36);

            @Override
            public String generateKey(OAuth2ProtectedResourceDetails resource) {
                final RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
                if (requestAttributes != null) {
                    return requestAttributes.getSessionId();
                } else {
                    return generator.generate();
                }
            }
        });
        template.setAccessTokenProvider(accessTokenProvider);
    }
}
