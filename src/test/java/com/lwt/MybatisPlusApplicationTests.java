package com.lwt;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lwt.dao.UserDao;
import com.lwt.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {

        User user=new User();
        user.setName("王五");
        user.setAge(18);
        user.setSex("女");

        int insert = userDao.insert(user);
        System.out.println(insert);

        List<User> users = userDao.selectList(null);
        System.out.println(users);

    }

    @Test
    void findAll(){

        User user=new User();
        List<User> users = user.selectAll();
        System.out.println(users);

    }

    @Test
    void add() {

        User user=new User();
        user.setName("老王");
        user.setAge(18);
        user.setSex("男");

        int insert = userDao.insert(user);
        System.out.println(insert);
        

    }

    @Test
    void delete() {

        int i = userDao.deleteById(6);
        System.out.println(i);


    }

    @Test
    void update11() {

        User user= userDao.selectById(7);
        user.setName("海绵宝宝");
        user.setAge(18);
        user.setSex("男");

        int insert = userDao.updateById(user);
        System.out.println(insert);

        User selectById = user.selectById(7);
        System.out.println("selectById = " + selectById);

    }


}
