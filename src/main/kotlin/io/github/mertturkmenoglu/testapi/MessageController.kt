package io.github.mertturkmenoglu.testapi

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class MessageController {

    data class Message(val message: String)

    @PostMapping("/message")
    fun messageResponse(@RequestBody message: Message): ResponseEntity<MessageResponse> {
        if (message.message.isBlank()) {
            val res = MessageResponse(
                    message = "Invalid message",
                    statusCode = 400,
                    time = Calendar.getInstance().timeInMillis
            )

            return ResponseEntity(res, HttpStatus.BAD_REQUEST)
        }

        val res = MessageResponse(
                message = message.message,
                statusCode = 200,
                time = Calendar.getInstance().timeInMillis
        )

        return ResponseEntity(res, HttpStatus.OK)
    }

}