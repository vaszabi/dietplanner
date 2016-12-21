package com.mobilefirstsolutions.microservices.service.login.service.impl;


import com.mobilefirstsolutions.microservices.service.login.service.UserService;
import com.mobilefirstsolutions.microservices.service.login.entity.UsersEntity;
import com.mobilefirstsolutions.microservices.service.login.model.User;
import com.mobilefirstsolutions.microservices.service.login.repository.*;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{


    @Override
    public User findUserByUsername(String username) {
        User user = null;
        //TODO kitolteni az adatokat a database bül
        UsersEntity entity = userRepository.findUserByUsername(username);
        if(entity!= null){
            user = mapEntityToDto(entity);
        }
        return user;
    }

    private User mapEntityToDto(UsersEntity entity) {
        User user = new User();
        user.setLastname(entity.getLastname());
        //...
        return user;
    }

    @Override
    public User getOneUser(Long id) {

        for (User user : list) {
            if (id.equals(user.getId())) {
                return user;
            }
        }
        return null;
    }

}
