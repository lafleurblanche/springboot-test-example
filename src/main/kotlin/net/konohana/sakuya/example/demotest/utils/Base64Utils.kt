package net.konohana.sakuya.example.demotest.utils

import java.util.Base64

fun encodeBase64String(inputStr: String): String {
    return Base64
        .getEncoder()
        .encodeToString(inputStr.toByteArray())
}

fun decodeBase64String(b64String: String): String {
    return Base64
        .getDecoder()
        .decode(b64String.toByteArray())
        .toString(Charsets.UTF_8)
}
