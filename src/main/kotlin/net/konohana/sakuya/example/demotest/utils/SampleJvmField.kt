package net.konohana.sakuya.example.demotest.utils

class SampleJvmField {
    @JvmField
    val foo = 150

    val bar = 200

    @JvmField
    var quex: Int = 0

    fun setQuexValue(value: Int) {
        quex = value
    }

    fun getQuexVelue(): Int {
        return quex
    }
}
