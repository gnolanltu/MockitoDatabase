package edu.ltu.mockitodatabase;

import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.Assert;

import org.junit.Test;
import org.mockito.Mockito;


/**
 * Unit tests for the User Database class.
 */
public class DatabaseTest {
    private User joeSmith = new User("Joe", "Smith");
    private final int USER_ID = 1;

    @Test
    public void testMockUser() {
        //mock SQLHelper
        SQLHelper dbHelper = Mockito.mock(SQLHelper.class);
        //have mockito return joeSmith when calling dbHelper getUser
        Mockito.when(dbHelper.getUser(USER_ID)).thenReturn(joeSmith);

        //Assert joeSmith is returned by getUser
        Assert.assertEquals(dbHelper.getUser(USER_ID), joeSmith);
    }
}