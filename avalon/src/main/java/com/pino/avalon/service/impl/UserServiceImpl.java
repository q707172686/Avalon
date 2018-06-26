package com.pino.avalon.service.impl;

import com.pino.avalon.dao.UserMapper;
import com.pino.avalon.model.User;
import com.pino.avalon.service.UserService;
import com.pino.avalon.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Pino on 2018/06/26.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
