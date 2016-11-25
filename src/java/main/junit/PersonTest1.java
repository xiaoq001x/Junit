package main.junit;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Administrator on 2016/11/25.
 */
public class PersonTest1 {
    private Person person;

    @Before
    public void buildPerson() {
        person = new PersonImpl(3, "Willard");
    }
    @Category(AttributeFun.class)
    @Test
    public void testGetAge()
    {
        int age = person.getAge();
        assertEquals(3, age);
    }

    @Category(AttributeFun.class)
    @Test
    public void testGetName()
    {
        String name = person.getName();
        assertEquals("Willard", name);
    }

    @Category(BehaviorFun.class)
    @Test(expected=IllegalArgumentException.class)
    public void testTalk()
    {
        String message = person.talkTo("Jimy");
        assertNotNull(message);
    }

    @Category(BehaviorFun.class)
    @Test(timeout=200)
    public void testWalk()
    {
        person.walk();
    }
}
