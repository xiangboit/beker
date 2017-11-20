package com.mingjiang.beker;

import com.mingjiang.beker.domain.Users;
import com.mingjiang.beker.domain.UsersRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/11/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTest {
    @Autowired
    private UsersRepository usersRepository;
    @Test
    public void test() throws Exception {
        // 创建10条记录
        usersRepository.save(new Users("AAA", 10));
        usersRepository.save(new Users("BBB", 20));
        usersRepository.save(new Users("CCC", 30));
        usersRepository.save(new Users("DDD", 40));
        usersRepository.save(new Users("EEE", 50));
        usersRepository.save(new Users("FFF", 60));
        usersRepository.save(new Users("GGG", 70));
        usersRepository.save(new Users("HHH", 80));
        usersRepository.save(new Users("III", 90));
        usersRepository.save(new Users("JJJ", 100));
        // 测试findAll, 查询所有记录
        Assert.assertEquals(10,usersRepository.findByAge(10).getAge().longValue());
        System.out.println("校验成功，数量为"+":"+usersRepository.findByAge(10).getAge().longValue());
        Assert.assertEquals(10, usersRepository.findAll().size());
        // 测试findByName, 查询姓名为FFF的User
        Assert.assertEquals(60, usersRepository.findByName("FFF").getAge().longValue());
        // 测试findUser, 查询姓名为FFF的User
        Assert.assertEquals(60, usersRepository.findUser("FFF").getAge().longValue());
        // 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
        Assert.assertEquals("FFF", usersRepository.findByNameAndAge("FFF", 60).getName());
        // 测试删除姓名为AAA的User
        usersRepository.delete(usersRepository.findByName("AAA"));
        // 测试findAll, 查询所有记录, 验证上面的删除是否成功
        Assert.assertEquals(9, usersRepository.findAll().size());
    }
}