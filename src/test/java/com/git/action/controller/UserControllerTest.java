package com.git.action.controller;

import com.git.action.config.TestBaseConfig;
import com.git.action.config.TestMysqlConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class UserControllerTest extends TestBaseConfig {
    @Test
    void test() throws Exception {
        params.add("name","name");
        params.add("email","email");

        mockMvc
                .perform(get("/test").params(params))
                .andExpect(status().isOk());
    }
}