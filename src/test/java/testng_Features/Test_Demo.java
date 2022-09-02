package testng_Features;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_Demo {
@Test
private void demo1() {
System.out.println("Hero");
}
@BeforeClass
private void method2() {
        System.out.println("first print");
}
}
