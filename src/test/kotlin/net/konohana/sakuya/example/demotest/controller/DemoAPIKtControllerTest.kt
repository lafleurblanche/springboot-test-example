package net.konohana.sakuya.example.demotest.controller

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@ExtendWith(SpringExtension::class)
@WebMvcTest(controllers = [DemoAPIKtController::class])
class DemoAPIKtControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun index() {
        mockMvc.perform(get("/demo-api/kt"))
            .andExpect(status().isOk)
            .andExpect(content().json(mapOf("res" to "DemoAPIKt").toString()))
    }
}
