package de.alexfrei.spring.security.login.servcie;


import de.alexfrei.spring.security.login.entity.User;

public interface UserService {


    User getUser(String login);   // login
}
