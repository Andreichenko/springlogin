package de.alexfrei.spring.security.login.servcie;

import de.alexfrei.spring.security.login.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword("4234234234");

        return user;
    }
}
