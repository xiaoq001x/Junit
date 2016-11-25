package main.junit;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * Created by Administrator on 2016/11/25.
 */
@RunWith(Categories.class)
@Suite.SuiteClasses(PersonTest1.class)
public class CategoryTest {

}
