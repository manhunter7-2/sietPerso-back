package com.ws.back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.back.beans.UserBean;
import com.ws.back.entities.UserEntity;
import com.ws.back.mappers.UserMapper;
import com.ws.back.repositories.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserBean getAllBeans(){
        List<UserBean> ubean;
        try{
            List<UserEntity> entities = userRepository.findAll();
            ubean = UserMapper.INSTANCE.entitiesToBeans(entities);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        return ubean;

        ///#TODO use resultTestBean to make the custom bean
    }

}
