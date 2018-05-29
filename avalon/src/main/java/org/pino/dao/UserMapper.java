package org.pino.dao;

import org.apache.ibatis.annotations.Param;
import org.pino.entity.User;

/**
 * @Author: Pino
 * @Description: 用户DAO接口
 * @Date: 下午2:40 18-5-29
 * @Modified:
 */
public interface UserMapper {

    /**
     * 查询用户名是否存在
     *
     * @param username
     * @return 查询到该名称的数量
     */
    Integer checkUsername(@Param("username") String username);

    /**
     * 插入用户
     *
     * @param user 用户实体类
     */
    void insertUser(User user);


}