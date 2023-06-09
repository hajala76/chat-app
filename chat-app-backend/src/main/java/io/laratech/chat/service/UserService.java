package io.laratech.chat.service;

import java.util.List;

import io.laratech.chat.exceptions.UserAlreadyExistException;
import io.laratech.chat.exceptions.UserNotFoundException;
import io.laratech.chat.model.User;

public interface UserService {
    List<User> getall() throws UserNotFoundException;

    User addUser(User user) throws UserAlreadyExistException;

    User getUserByUserName(String username)  throws UserNotFoundException;
}
