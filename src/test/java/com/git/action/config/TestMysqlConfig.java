package com.git.action.config;

import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public class TestMysqlConfig {
    @Container private static final MySQLContainer MY_SQL_CONTAINER;

    static {
        MY_SQL_CONTAINER =
                new MySQLContainer("mysql:8")
                        .withDatabaseName("test")
                        .withUsername("test")
                        .withPassword("test");
        MY_SQL_CONTAINER.start();
    }
}
