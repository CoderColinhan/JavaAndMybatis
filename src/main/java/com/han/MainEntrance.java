package com.han;

import com.han.dao.BlogMapper;
import com.han.domain.Blog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MainEntrance {
    public static void main(String[] args) throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        try {

            BlogMapper mapper = session.getMapper(BlogMapper.class);

            Blog blog = new Blog();
            blog.setId(1);

            Blog res = mapper.selectBlog(blog);

            System.out.println(res.getTitle());
        } finally {
            session.close();
        }
    }
}
