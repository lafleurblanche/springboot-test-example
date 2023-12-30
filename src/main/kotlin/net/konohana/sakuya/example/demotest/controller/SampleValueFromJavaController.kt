package net.konohana.sakuya.example.demotest.controller

import net.konohana.sakuya.example.demotest.utils.SampleJavaUtils
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleValueFromJavaController {
    @GetMapping("/sample-value/from-java-string")
    fun getStringFromJava(): String {
        return SampleJavaUtils().javaStringValue
    }

    @GetMapping("/sample-value/from-java-null")
    fun getNullFromJava(): String? {
        return SampleJavaUtils().javaNullValue ?: "Null Value"
    }

    @GetMapping("/sample-value/from-java-nullable")
    fun getNullableFromJava(): String? {
        return SampleJavaUtils().javaNullableValue ?: "Null Value"
    }

    @GetMapping("/sample-value/from-java-maybe")
    fun getMaybeStringFromJava(): String {
        val res = SampleJavaUtils().javaMaybeStringValue ?: "Null Value"
        println(res)
        return res
    }
}
