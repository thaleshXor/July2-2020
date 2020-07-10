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
			browser=System.getenv("BROWSER");
		}
		else if(osName.toUpperCase().equalsIgnoreCase("LINUX")) {
			
			System.out.println("*************I am running on LINUX **************");

			System.out.println("***************************Temp : BrowserName : " + browser);

		}
	
        if(browser.toUpperCase().contains("CHROME")) {
			
			System.out.println("*************I am running on CHROME **************");
		}
        else if(browser.toUpperCase().contains("FIREFOX")) {
			
			System.out.println("*************I am running on FIREFOX **************");
		}

		
	}
}
