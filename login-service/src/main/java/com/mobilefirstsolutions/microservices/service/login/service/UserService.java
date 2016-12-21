package com.mobilefirstsolutions.microservices.service.login.service;

import com.mobilefirstsolutions.microservices.service.login.model.User;

/**
 * Created by szvarga on 2016. 12. 19..
 */
public interface UserService {

    public void createUser(User user);


    User findUserByUsername(String username);
}
