package package1;

import org.testng.annotations.Test;

public class HelloWorld {

	@Test
	public void displayMessage() {
		
		System.out.println("Hellooooooooo World !!!!!!");
		String firstName=System.getenv("FIRSTNAME");
		String secondName=System.getenv("SURNAME");
		System.out.println(">>>>>>>>>>>>" + firstName + "  " + secondName + "<<<<<<<<<<<<<<<<<<<");
		
		
		String osName=System.getProperty("os.name");
		String browser=System.getenv("BROWSER");
		
		if(osName.toUpperCase().contains("WINDOWS")) {
			
			System.out.println("*************I am running on WINDOWS **************");
		}
		else if(osName.toUpperCase().contains("LINUX")) {
			
			System.out.println("*************I am running on LINUX **************");
		}
		
		
		if(browser.toUpperCase().contains("CHROME")) {
			
			System.out.println("*************I am running on CHROME **************");
		}
		else if(osName.toUpperCase().contains("FIREFOX")) {
			
			System.out.println("*************I am running on FIREFOX **************");
		}		
		
	}
}
