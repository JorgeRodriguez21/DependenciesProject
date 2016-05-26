package com.udacity.gradle.builditbigger;

/**
 * Created by Jorge on 25/05/16.
 */

import android.test.AndroidTestCase;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

public class UnitTest extends AndroidTestCase {

    @Test
    public void testSum() throws Throwable {
        Assert.assertTrue(1 + 2 == 3);
    }

    @Test
    public void testCallBack() throws Throwable {
        final CountDownLatch signal = new CountDownLatch(1);
        new EndpointsTask (new EndpointsTask.AsyncResponse() {
            @Override
            public void processFinish(String output) {
                Assert.assertTrue(output != null && output.length() > 0);
                signal.countDown();
            }
        }).execute(getContext());
        signal.await();
    }


}
