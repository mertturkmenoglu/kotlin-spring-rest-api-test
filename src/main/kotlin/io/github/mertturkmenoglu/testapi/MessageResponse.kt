package io.github.mertturkmenoglu.testapi

data class MessageResponse(
        val message: String,
        val statusCode: Int,
        val time: Long
)