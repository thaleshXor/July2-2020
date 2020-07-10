package package1;

import org.testng.annotations.Test;

public class HelloWorld {
	String browser="";
	@Test
	public void displayMessage() {
		
		System.out.println("Hellooooooooo World !!!!!!");

		String osName=System.getProperty("os.name");
		//String browser=System.getenv("BROWSER");
		
		if(osName.toUpperCase().contains("WINDOWS")) {
			
			System.out.println("*************I am running on WINDOWS **************");
			browser=System.getenv("BROWSER");
		}
		else if(osName.toUpperCase().contains("LINUX")) {
			
			System.out.println("*************I am running on LINUX **************");
			browser=System.getenv("BROWSER");
		}
		
		
		if(browser.toUpperCase().contains("CHROME")) {
			
			System.out.println("*************I am running on CHROME **************");
		}
		else if(browser.toUpperCase().contains("FIREFOX")) {
			
			System.out.println("*************I am running on FIREFOX **************");
		}		
		
	}
}
