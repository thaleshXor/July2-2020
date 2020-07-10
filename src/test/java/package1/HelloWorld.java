package package1;

import org.testng.annotations.Test;

public class HelloWorld {
	
	@Test
	public void displayMessage() {
		
		System.out.println("Hellooooooooo World !!!!!!");

		String osName=System.getProperty("osName");
		String browser=System.getProperty("browser");
		
		System.out.println("Fetched vakues are - osName: " + osName + " browser name : " + browser);
		
		if(osName.toUpperCase().equalsIgnoreCase("WINDOWS")) {
			
			System.out.println("*************I am running on WINDOWS **************");
		
		}
		else if(osName.toUpperCase().equalsIgnoreCase("LINUX")) {
			
			System.out.println("*************I am running on LINUX **************");

		}
	
        if(browser.toUpperCase().equalsIgnoreCase("chrome")) {
			
			System.out.println("*************I am running on CHROME **************");
		}
        else if(browser.toUpperCase().equalsIgnoreCase("firefox")) {
			
			System.out.println("*************I am running on FIREFOX **************");
		}

		
	}
}
