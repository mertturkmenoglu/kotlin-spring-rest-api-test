package io.github.mertturkmenoglu.testapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RootController {

    @GetMapping("/")
    fun rootResponse(): RootResponse {
        return RootResponse(
                version = 1.0F,
                message = "Spring RESTful API Test",
                endpoints = mapOf(
                        "greeting" to "/greeting?{name}"
                )
        )
    }

}