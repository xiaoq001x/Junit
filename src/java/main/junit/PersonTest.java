package main.junit;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Administrator on 2016/11/25.
 */
public class PersonTest {
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

    @Test(timeout = 200)
    public void testWalk() {
        person.walk();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTalk() {
        String message = person.talkTo("Jimy");
        assertNotNull(null);
    }
}
