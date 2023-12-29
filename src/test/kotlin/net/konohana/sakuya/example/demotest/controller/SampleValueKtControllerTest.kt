package net.konohana.sakuya.example.demotest.controller

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@ExtendWith(SpringExtension::class)
@WebMvcTest(controllers = [SampleValueKtController::class])
class SampleValueKtControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun getString() {
        mockMvc.perform(MockMvcRequestBuilders.get("/sample-value/string"))
            .andExpect(status().isOk)
            .andExpect(content().string("hoge"))
    }

    @Test
    fun getInteger() {
        mockMvc.perform(MockMvcRequestBuilders.get("/sample-value/int"))
            .andExpect(status().isOk)
            .andExpect(content().string("100"))
    }
}
