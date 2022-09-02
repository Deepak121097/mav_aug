package testng_Features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Features {

	@Test
	private void studies() {
System.out.println("studies");
	}
	
	@Ignore
	@Test
	private void sports() {
System.out.println("sports");
	}
	@Test
	private void gen_Knowledge() {
System.out.println("GK");
	}
	@Test(enabled = false)
	private void insta() {
System.out.println("insta");
	}
	@Test
	private void watsapp() {
System.out.println("watsapp");
	}
	
	
	
}
