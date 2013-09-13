package com.zx.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zx.model.User;

public class Run {
   public static void main(String[] args) {
      String resource = "com/zx/model/mybatis-config.xml";
      SqlSession session = null;
      try {
         InputStream inputStream = Resources.getResourceAsStream(resource);
         SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
               .build(inputStream);
         session = sqlSessionFactory.openSession();
         UserMapper mapper = session.getMapper(UserMapper.class);
         // User user = mapper.findUserById(1L);
         // User user = session.selectOne("com.zx.dao.UserMapper.findUserById",
         // 1L);
         List<User> userList = mapper.findAll();
         for (User user : userList) {
            System.out.println(user.toString());
         }
      } catch (IOException exception) {
         exception.printStackTrace();
      } finally {
         if (session != null) {
            session.close();
         }
      }
   }
}