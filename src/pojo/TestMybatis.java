package pojo;



import java.io.IOException;

import java.io.InputStream;

import java.util.List;

 

import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSession;

import org.apache.ibatis.session.SqlSessionFactory;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;

 


import pojo.category;

 

public class TestMybatis {

 

    public static void main(String[] args) throws IOException {

        String resource = "mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session=sqlSessionFactory.openSession();

         

        List<category> cs = session.selectList("listCategory");

        for (category c : cs) {

            System.out.println(c);

            List<product> ps = c.getProducts();

            for (product p : ps) {

                System.out.println("\t"+p);

            }

        }

 

        session.commit();

        session.close();

         

    }

}

