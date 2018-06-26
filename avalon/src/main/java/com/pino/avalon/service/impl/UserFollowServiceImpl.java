package com.pino.avalon.service.impl;

import com.pino.avalon.dao.UserFollowMapper;
import com.pino.avalon.model.UserFollow;
import com.pino.avalon.service.UserFollowService;
import com.pino.avalon.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Pino on 2018/06/26.
 */
@Service
@Transactional
public class UserFollowServiceImpl extends AbstractService<UserFollow> implements UserFollowService {
    @Resource
    private UserFollowMapper userFollowMapper;

}
