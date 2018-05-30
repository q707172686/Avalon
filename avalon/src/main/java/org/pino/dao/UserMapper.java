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
     * @param username 用户输入的用户名
     * @return 查询到该名称的数量
     */
    Integer checkUsername(@Param("username") String username);

    /**
     * 插入用户
     *
     * @param user 用户实体类
     */
    void insertUser(User user);

    /**
     * 更新用户密码，同时更新gmtModified的时间
     *
     * @param pkUid    用户ID
     * @param password 用户密码
     * @return 返回更新的条数
     */
    Integer updatePassword(@Param("pkUid") String pkUid, @Param("password") String password);

    /**
     * 更新用户的自我介绍，同时更新gmtModified的时间
     *
     * @param pkUid         用户ID
     * @param selfIntroduce 用户自我介绍
     * @return 返回更新的条数
     */
    Integer updateSelfIntroduce(@Param("pkUid") String pkUid, @Param("selfIntroduce") String selfIntroduce);

    /**
     * 更新用户头像的方法
     *
     * @param pkUid  用户主键
     * @param header 用户头像名称
     * @return 返回更新的条数
     */
    Integer updateUserHeader(@Param("pkUid") String pkUid, @Param("header") String header);
}