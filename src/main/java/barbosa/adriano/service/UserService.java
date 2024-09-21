package barbosa.adriano.service;

import barbosa.adriano.entity.UserEntity;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {

    public UserEntity createUser(UserEntity userEntity) {
        UserEntity.persist(userEntity);
        return userEntity;
    }
}
