package com.mingjiang.beker;

import com.mingjiang.beker.testmybaties.User;
import com.mingjiang.beker.testmybaties.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;

/**
 * Created by Administrator on 2017/11/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class run {
    @Autowired
    private UserMapper userMapper;
    @Test
    @Rollback
    public void findByName() throws Exception {
        userMapper.update("AAA", 90);
//        User u = userMapper.findByName("AAA");
//        Assert.assertEquals(50, u.getAge().intValue());
    }
}
