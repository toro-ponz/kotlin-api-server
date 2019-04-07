package com.toroponz.kotlinapiserver.controller

import org.junit.Assert
import org.junit.Test

class HealthControllerUnitTest {
    @Test
    fun testCheck() {
        val expected = 1
        val response = HealthController().check()
        Assert.assertEquals(expected, response)
    }
}
