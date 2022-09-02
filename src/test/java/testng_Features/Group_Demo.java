package testng_Features;

import org.testng.annotations.Test;

public class Group_Demo {
@Test(groups = "sports")
private void cricket() {
System.out.println("cricket");
}
@Test(groups = "sports")
private void football() {
System.out.println("football");
}
@Test(groups = "sports")
private void hockey() {
System.out.println("hockey");
}
@Test(groups = "subjects")
private void history() {
System.out.println("history");
}
@Test(groups = "subjects")
private void social() {
System.out.println("social");
}
@Test(groups = "news")
private void news() {
System.out.println("news");
}




}
