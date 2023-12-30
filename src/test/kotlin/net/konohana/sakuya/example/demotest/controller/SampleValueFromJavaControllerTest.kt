package net.konohana.sakuya.example.demotest.controller

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@ExtendWith(SpringExtension::class)
@WebMvcTest(controllers = [SampleValueFromJavaController::class])
class SampleValueFromJavaControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun getStringFromJava() {
        mockMvc.perform(MockMvcRequestBuilders.get("/sample-value/from-java-string"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("hogehoge"))
    }

    @Test
    fun getNullFromJava() {
        mockMvc.perform(MockMvcRequestBuilders.get("/sample-value/from-java-null"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("Null Value"))
    }

    @Test
    fun getNullableFromJava() {
        mockMvc.perform(MockMvcRequestBuilders.get("/sample-value/from-java-nullable"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("10"))
    }

    @Test
    fun getMaybeStringFromJava() {
        mockMvc.perform(MockMvcRequestBuilders.get("/sample-value/from-java-maybe"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("Null Value"))
    }
}
