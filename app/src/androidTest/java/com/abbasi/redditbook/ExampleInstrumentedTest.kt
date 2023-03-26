package com.abbasi.redditbook

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.abbasi.redditbook", appContext.packageName)
        println("Sample UI Test")
    }

    @Test
    @SmokeTest
    fun smokeTest1() {
        assertEquals(2 + 2, 4)
        println("Smoke Test1: Sample UI Test")
    }

    @Test
    @SmokeTest
    fun smokeTest2() {
        assertEquals(2 + 3, 5)
        println("Smoke Test2: Sample UI Test")
    }
}