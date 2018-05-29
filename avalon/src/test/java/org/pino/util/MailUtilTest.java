package org.pino.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: Pino
 * @Description:
 * @Date: 下午4:34 18-5-29
 * @Modified:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class MailUtilTest {

    @Autowired
    private MailUtil mailUtil;

    @Test
    public void sendEmail(){
        mailUtil.send("327491805@qq.com","Test","Test");
    }
}
