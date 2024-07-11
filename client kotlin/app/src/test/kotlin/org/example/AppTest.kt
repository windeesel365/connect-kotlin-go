package org.example

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlinx.coroutines.runBlocking

class AppTest {
    @Test
    fun testRunClient() = runBlocking {
        
        runClient()
        
        assertTrue(true)
    }
}
