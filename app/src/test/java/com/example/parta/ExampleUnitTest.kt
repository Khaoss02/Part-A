package com.example.parta

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun suma_correcta() {
        assert(2 + 2 == 4)
    }

    @Test
    fun texto_contiene_letra() {
        val texto = "Andrei"
        assert(texto.contains("A"))
    }
}