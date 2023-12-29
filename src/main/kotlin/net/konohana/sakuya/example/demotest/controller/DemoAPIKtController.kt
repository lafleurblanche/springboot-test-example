package net.konohana.sakuya.example.demotest.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoAPIKtController {
    @GetMapping("/demo-api/kt")
    fun index(): Map<String, String> {
        return mapOf("res" to "DemoAPIKt")
    }
}
