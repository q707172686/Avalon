package org.pino.service;

import org.pino.constant.UserStaticField;
import org.pino.dao.UserMapper;
import org.pino.dto.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Pino
 * @Description:
 * @Date: 下午8:51 18-6-4
 * @Modified:
 */
@Service
public class RegService {
    @Autowired
    private UserMapper userMapper;

    public BaseResult<String> checkUsername(String username) {
        Integer userNum = userMapper.checkUsername(username);
        String msg = userNum > 0 ? UserStaticField.SAME_NAME : UserStaticField.USEFUL_NAME;
        BaseResult<String> baseResult = new BaseResult<>(true, msg);
        return baseResult;
    }

}
