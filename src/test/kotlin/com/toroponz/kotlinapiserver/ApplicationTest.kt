package com.toroponz.kotlinapiserver

import org.junit.Test
import org.junit.Assert.*

class ApplicationTest {
    @Test
    fun testIndex() {
        val expected = "Hello, world!"
        val response = Application().index()
        assertEquals(expected, response)
    }
}
