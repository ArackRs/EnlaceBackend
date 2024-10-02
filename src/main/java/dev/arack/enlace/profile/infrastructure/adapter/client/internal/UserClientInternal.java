package dev.arack.enlace.profile.infrastructure.adapter.client.internal;

import dev.arack.enlace.iam.application.dto.response.UserResponse;
import dev.arack.enlace.iam.application.internal.facade.AuthenticationFacade;
import dev.arack.enlace.profile.application.port.output.client.UserClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserClientInternal implements UserClient {

    private final AuthenticationFacade authenticationFacade;

    @Override
    public UserResponse getCurrentUser() {
        return UserResponse.of(authenticationFacade.getCurrentUser());
    }
}
