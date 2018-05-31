package com.coc.jpa;

import com.coc.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Name:UserJpa
 * Description:
 * Author:yangxiaocui
 * Time: 2018/5/30 16:51
 */

public interface UserJpa extends JpaRepository<UserEntity,Long>,JpaSpecificationExecutor<UserEntity>,Serializable{
}
