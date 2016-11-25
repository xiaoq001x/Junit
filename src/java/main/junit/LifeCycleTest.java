package main.junit;

import org.junit.*;

/**
 * Created by Administrator on 2016/11/25.
 */
public class LifeCycleTest
{

    public LifeCycleTest()
    {
        super();
        System.out.println("<<Person Constructor>>");
    }

    @BeforeClass
    public static void beforeClassM()
    {
        System.out.println("<<Before Class>>");
    }


    @Before
    public void beforeM()
    {
        System.out.println("<<Before>>");
    }


    @AfterClass
    public static void afterClassM()
    {
        System.out.println("<<After Class>>");
    }


    @After
    public void after()
    {
        System.out.println("<<After>>");
    }

    @Test
    public void testMethod1()
    {
        System.out.println("Test Method 1.");
    }

    @Test
    public void testMethod2()
    {
        System.out.println("Test Method 2.");
    }
}
