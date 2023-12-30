package net.konohana.sakuya.example.demotest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SampleValueControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getString() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/sample-value/java-string"))
            .andExpect(status().isOk())
            .andExpect(content().string("hoge"));

    }

    @Test
    void getInt() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/sample-value/java-int"))
            .andExpect(status().isOk())
            .andExpect(content().string("100"));
    }

    @Test
    void getJvmField() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/sample-value/jvm-field"))
                .andExpect(status().isOk())
                .andExpect(content().string("150"));
    }

    @Test
    void getNonJvmField() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/sample-value/non-jvm-field"))
                .andExpect(status().isOk())
                .andExpect(content().string("200"));
    }
}
