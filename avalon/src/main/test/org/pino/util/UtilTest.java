package org.pino.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

/**
 * @Author: Pino
 * @Description:
 * @Date: 下午9:11 18-5-28
 * @Modified:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class UtilTest {

    @Test
    public void testPageUtil() {
        PageUtil<Integer> pageUtil = new PageUtil<>(10, 1, 10, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        System.out.println(pageUtil.getPageSize());
        System.out.println(pageUtil.getCurrentPage());
        System.out.println(pageUtil.getPrePage());
        System.out.println(pageUtil.getNextPage());
        System.out.println(pageUtil.getTotalPage());
        System.out.println(pageUtil.getValues());
    }

}
