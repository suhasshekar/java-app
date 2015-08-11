package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        App object = new App();
		int c = object.sum(4, 5);
		assertTrue( c == 9);
    }
	
	public void testApp2()
	{
		App object = new App();
		int c = object.sum(3, 3);
		assertTrue(c == 6);
	}
	
	public void testApp3()
	{
		App object = new App();
		int c = object.sum(2, 5);
		assertFalse(c == 6);
	}
}
