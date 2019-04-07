package com.toroponz.kotlinapiserver.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {

    @RequestMapping("/health")
    fun check(): Int{
        return 1
    }
}
