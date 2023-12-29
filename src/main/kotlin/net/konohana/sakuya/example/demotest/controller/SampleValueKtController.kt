package net.konohana.sakuya.example.demotest.controller

import net.konohana.sakuya.example.demotest.utils.sampleValueInt
import net.konohana.sakuya.example.demotest.utils.sampleValueString
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleValueKtController {
    @GetMapping("/sample-value/string")
    fun getString(): String {
        return sampleValueString()
    }

    @GetMapping("/sample-value/int")
    fun getInteger(): Int {
        return sampleValueInt()
    }
}
