package package1;

import org.testng.annotations.Test;

public class HelloWorld {

	@Test
	public void displayMessage() {
		
		System.out.println("Hellooooooooo World !!!!!!");
		String firstName=System.getenv("FIRSTNAME");
		String secondName=System.getenv("LASTNAME");
		System.out.println(">>>>>>>>>>>>" + firstName + "  " + secondName + "<<<<<<<<<<<<<<<<<<<");
	}
}
