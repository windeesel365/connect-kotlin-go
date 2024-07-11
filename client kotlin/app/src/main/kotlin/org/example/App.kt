package org.example

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import kotlinx.coroutines.*

suspend fun runClient() {
    val client = HttpClient {
        install(JsonFeature) {
            serializer = KotlinxSerializer()
        }
    }

    try {
        val response: HttpResponse = client.get("http://localhost:8080/greet")
        val responseBody: String = response.readText()
        println("Response from Go backend: $responseBody")
    } finally {
        client.close()
    }
}

fun main() = runBlocking {
    runClient()
}
