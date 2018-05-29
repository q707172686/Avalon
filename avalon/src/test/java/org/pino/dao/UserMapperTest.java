package org.pino.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.pino.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: Pino
 * @Description:
 * @Date: 下午5:13 18-5-29
 * @Modified:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class UserMapperTest {

//    private static final Logger LOG = LoggerFactory.getLogger(UserMapperTest.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertUserTest() {
        User user = new User();
        user.setUkUsername("jack");
        user.setUkEmail("2287861912@qq.com");
        user.setHeader("adfasd");
        user.setPassword("123123");
        user.setTagIds("1-2");
        user.setSelfIntroduction("asdfs");
        userMapper.insertUser(user);
    }

    @Test
    public void checkUsername() {
        System.out.println(userMapper.checkUsername("aaa"));
    }

    @Test
    public void updatePassword(){
        userMapper.updatePassword("1","aaaaaa");
    }

    @Test
    public void update(){
        userMapper.updateSelfIntroduce("1","abcdefg");
    }
}
