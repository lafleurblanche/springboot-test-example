package net.konohana.sakuya.example.demotest.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SampleJavaUtils {
    @NotNull
    public String getJavaStringValue() {
        return "hogehoge";
    }

    @Nullable
    public String getJavaNullValue() {
        return null;
    }

    public String getJavaMaybeStringValue() {
        return null;
    }

    @Nullable
    public String getJavaNullableValue() {
        return "10";
    }
}
