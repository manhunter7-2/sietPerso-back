package com.ws.back.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ws.back.beans.UserBean;
import com.ws.back.entities.UserEntity;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserBean entityToBean(UserEntity userEntity);
    List<UserBean> entitiesToBeans(List<UserEntity> userEntities);
}
