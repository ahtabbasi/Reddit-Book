package com.abbasi.redditbook

import org.junit.Ignore
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses

@Ignore("Let's ignore it")
@RunWith(Suite::class)
@SuiteClasses(ExampleInstrumentedTest::class)
class TestSuit



// ./gradlew pixel2api29DebugAndroidTest -Pandroid.experimental.androidTest.useUnifiedTestPlatform=true -Pandroid.testoptions.manageddevices.emulator.gpu=swiftshader_indirect