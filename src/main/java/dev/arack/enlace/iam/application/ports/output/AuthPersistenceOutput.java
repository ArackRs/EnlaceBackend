package dev.arack.enlace.iam.application.ports.output;

import dev.arack.enlace.iam.domain.model.UserEntity;

public interface AuthPersistenceOutput {
    void register(UserEntity userEntity);
}
