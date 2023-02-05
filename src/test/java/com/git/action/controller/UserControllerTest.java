package com.git.action.controller;

import com.git.action.config.TestBaseConfig;
import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;

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