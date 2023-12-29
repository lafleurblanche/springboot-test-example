package net.konohana.sakuya.example.demotest.controller;

import net.konohana.sakuya.example.demotest.utils.SampleUtilsKt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleValueController {
    @GetMapping("/sample-value/java-string")
    public String getString() {
        return SampleUtilsKt.getStringValue();
    }

    @GetMapping("/sample-value/java-int")
    public int getInt() {
        return SampleUtilsKt.getIntegerValue();
    }
}
