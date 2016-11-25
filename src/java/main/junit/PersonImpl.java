package main.junit;

/**
 * Created by Administrator on 2016/11/25.
 */
public class PersonImpl implements Person {
    private int age;
    private String name;

    public PersonImpl(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String talkTo(String message) {
        throw new IllegalArgumentException();
    }

    @Override
    public void walk() {


    }
}
