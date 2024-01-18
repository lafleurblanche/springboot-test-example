package net.konohana.sakuya.example.demotest.controller;

import java.util.function.Consumer;
import net.konohana.sakuya.example.demotest.utils.SampleJvmField;
import net.konohana.sakuya.example.demotest.utils.SampleUtilsKt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleValueController {
    Consumer<String> consumer = System.out::println;

    @GetMapping("/sample-value/java-string")
    public String getString() {
        consumer.accept("Call: getString");
        return SampleUtilsKt.getStringValue();
    }

    @GetMapping("/sample-value/java-int")
    public int getInt() {
        consumer.accept("Call: getInt");
        return SampleUtilsKt.getIntegerValue();
    }

    @GetMapping("/sample-value/jvm-field")
    public int getJvmField() {
        consumer.accept("Call: getJvmField");
        SampleJvmField sampleJvmField = new SampleJvmField();
        return sampleJvmField.foo;
    }

    @GetMapping("/sample-value/non-jvm-field")
    public int getNonJvmField() {
        consumer.accept("Call: getNonJvmField");
        SampleJvmField sampleJvmField = new SampleJvmField();
        return sampleJvmField.getBar();
    }
}
