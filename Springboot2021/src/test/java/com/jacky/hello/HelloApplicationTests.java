package com.jacky.hello;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
        int count = jdbcTemplate.queryForObject("select count(*) from book",Integer.class);
        System.out.println("count is "+count);
        System.out.println(dataSource.getClass());
    }

    @Test
    @DisplayName("testAssert")
    void test() {
        assertAll("Math",
                ()-> assertEquals(2,1+1),
                ()-> assertTrue(1>1)
        );
    }

}
