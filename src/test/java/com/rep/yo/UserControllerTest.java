package com.rep.yo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import com.rep.yo.controllers.UserController;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {
    @Autowired
    private UserController controller;
    @Autowired
    private MockMvc mockMvc;

    @Test
    void AddTest() throws Exception {
        this.mockMvc.perform(get("/users/add?name=owo&age=0")).andDo(print()).andExpect(status().isOk());
    }
    @Test
    void GetAllTest() throws Exception {
        this.mockMvc.perform(get("/users/get")).andDo(print()).andExpect(status().isOk());
    }
    @Test
    void GetCurrentTest() throws Exception {
        this.mockMvc.perform(get("/users/get/0")).andDo(print()).andExpect(status().isOk());
    }
    @Test
    void DeleteTest() throws Exception {
        this.mockMvc.perform(get("/users/delete/0")).andDo(print()).andExpect(status().isOk());
    }
}
