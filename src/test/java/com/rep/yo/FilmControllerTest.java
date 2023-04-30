package com.rep.yo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import com.rep.yo.controllers.FilmController;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class FilmControllerTest {
    @Autowired
    private FilmController controller;

    @Autowired
    private MockMvc mockMvc;
    @Test
    public void AddTest() throws Exception {
        this.mockMvc.perform(get("/add?name=owo&age=0")).andDo(print()).andExpect(status().isOk());
    }
    @Test
    public void GetAllTest() throws Exception {
        this.mockMvc.perform(get("/get")).andDo(print()).andExpect(status().isOk());
    }

}