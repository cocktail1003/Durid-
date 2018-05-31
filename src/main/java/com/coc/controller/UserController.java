package com.coc.controller;

import com.coc.entity.UserEntity;
import com.coc.jpa.UserJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Name:UserController
 * Description:
 * Author:yangxiaocui
 * Time: 2018/5/30 16:34
 */
@RestController

public class UserController {
    @Autowired
    private UserJpa userJpa;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<UserEntity> getUser() {
        return userJpa.findAll();
    }

    @RequestMapping(value = "/post", method = RequestMethod.GET)
    public List<UserEntity> addUser(UserEntity userEntity) {
        userJpa.saveAndFlush(userEntity);
        return userJpa.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public List<UserEntity> delUser(Long id) {
        userJpa.deleteById(id);
        return userJpa.findAll();
    }


}
