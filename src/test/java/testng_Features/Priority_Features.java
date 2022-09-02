package testng_Features;

import org.testng.annotations.Test;

public class Priority_Features {
@Test(priority = -22)
private void spider() {
System.out.println("spider");
}
@Test
private void bats() {
      System.out.println("bats");
}
@Test(priority = 5,invocationCount = 5,invocationTimeOut = 1000)
private void eagles() {
System.out.println("eagles");
}
@Test
private void pig() {
System.out.println("pig");
}






}
