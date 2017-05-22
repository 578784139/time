package cn.bdqn.test;

import cn.bdqn.entity.Tbuser;
import cn.bdqn.mapper.Tbusermapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by AW on 2017/5/18.
 */
public class UserTest {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private Tbusermapper tbusermapper;
    @Before
    public void before(){
        try {
            this.sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.sqlSession=this.sqlSessionFactory.openSession();
        this.tbusermapper=this.sqlSession.getMapper(Tbusermapper.class);

    }
    @After
    public void after(){
        this.sqlSession.commit();
        this.sqlSession.close();
    }
    @Test
    public void testlogin(){
       System.out.print(this.tbusermapper.login(new Tbuser("Ezio","715725")));
    }
    @Test
    public void testadd(){
        String datestr="1995-05-13 09:57:37";
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        try {
            date=format.parse(datestr);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd");
        Date date1=new Date();
        try {
            date1 = format1.parse("2017-05-13");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.tbusermapper.add(new Tbuser(0,"AS","715725","01","ae",date,date1,new Date()));
    }
}



