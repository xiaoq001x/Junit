package main.junit;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Administrator on 2016/11/25.
 */
public class SimpleFunctionTest {
    private Person person;

    @Before
    public void buildPerson() {
        person = new PersonImpl(3, "Willard");
    }

    @Test(timeout = 200)
    public void testWalk() {
        person.walk();
    }
}
