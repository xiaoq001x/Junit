package main.junit;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Administrator on 2016/11/25.
 */
public class ComplexFunctionTest {
    private Person person;

    @Before
    public void buildPerson() {
        person = new PersonImpl(3, "Willard");
    }

    @Test
    public void testGetAge() {
        int age = person.getAge();
        assertEquals(3, age);
    }
}
