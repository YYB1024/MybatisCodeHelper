package com.testMapper;

import com.alibaba.fastjson.JSON;
import com.domain.UserAccountRelate;
import com.mapper.UserAccountRelateMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author yangyanbin
 * @since 20240607
 **/
public class UserAccountRelateMapperTest {
    private static UserAccountRelateMapper mapper;

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(UserAccountRelateMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/UserAccountRelateMapperTestConfiguration.xml"));
        //you can use builder.openSession(false) to not commit to database
        mapper = builder.getConfiguration().getMapper(UserAccountRelateMapper.class, builder.openSession(true));

    }

    @Test
    public void testSelectByBindNoCrc() {
        mapper.selectByBindNoCrc(1039361722L);
    }

    @Test
    public void testSelectByPrimaryKey() {
        UserAccountRelate accountRelate = mapper.selectByPrimaryKey(2L);

        System.out.println("accountRelate = " + JSON.toJSONString(accountRelate));
    }
}
