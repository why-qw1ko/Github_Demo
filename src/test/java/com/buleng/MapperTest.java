package com.buleng;

import com.buleng.domain.User;
import com.buleng.mapper.MenuMapper;
import com.buleng.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootTest
public class MapperTest {
    @Autowired
    private UserMapper usermapper;

    //爆红需要在MenuMapper加上@Repository注解
    @Autowired
    private MenuMapper menuMapper;
    @Test
    public void testSelectPermsByUserId(){
        List<String> list = menuMapper.selectPermsByUserId(1L);
        System.out.println(list);
    }

    @Test
    public void TestBCryptPasswordEncoder(){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("1234");
        System.out.println(encode);
        System.out.println(passwordEncoder.matches(
                "1234",
                "$2a$10$FIvnHc4oHtRZAwheKGlOmuya4MyISt73cahSUUwONa/.uCPBYviAK"));
        System.out.println(passwordEncoder.matches(
                "1234",
                "$2a$10$npv5JSeFR6/wLz8BBMmSBOMb8byg2eyfK4/vvoBk3RKtTLBhIhcpy"));
    }

    @Test
    public void testUserMapper(){
        List<User> users = usermapper.selectList(null);
        System.out.println(users);
    }
}
