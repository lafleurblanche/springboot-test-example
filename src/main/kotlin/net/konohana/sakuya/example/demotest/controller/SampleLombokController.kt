package net.konohana.sakuya.example.demotest.controller

import net.konohana.sakuya.example.demotest.models.SampleModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleLombokController {
    @GetMapping("/sample-lombok")
    fun sampleLombok(): String {
        val lombokObj = SampleModel()
        lombokObj.name = "test"
        val s: String = lombokObj.name
        lombokObj.age = 12
        val v = lombokObj.human
        lombokObj.human = !v
        println(lombokObj)
        return s
    }
}
