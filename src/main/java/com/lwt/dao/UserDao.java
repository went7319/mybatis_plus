package com.lwt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwt.domain.User;
import org.apache.ibatis.annotations.Mapper;

/*
* 继承mybatis-plus框架的各种sql语句
*
* */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
