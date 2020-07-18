package io.github.mertturkmenoglu.testapi

data class RootResponse(val version: Float, val message: String, val endpoints: Map<String, String>)