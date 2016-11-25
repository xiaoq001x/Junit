package main.junit;

import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Created by Administrator on 2016/11/25.
 */
@RunWith(Theories.class)
public class TheoriesTest4 {

    @Theory
    public void testMethod(@ParametersSuppliedBy(NameSupplier.class) String name, @ParametersSuppliedBy(AgeSupplier.class) int age) {
        System.out.println(String.format("%s's age is %s", name, age));
    }
}
