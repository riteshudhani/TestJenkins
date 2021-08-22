package com.example.myapplication;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
//@Config(manifest=Config.NONE)
@RunWith(RobolectricTestRunner.class)
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
         String a = appContext.getPackageName();
        assertEquals(a,"asdf");
        assertEquals(4, 2 + 2);
    }
}