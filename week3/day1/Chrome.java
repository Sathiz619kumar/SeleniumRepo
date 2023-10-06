package week3.day1;

public class Chrome extends Browser {
	
	public void openIncognito() {
		System.out.println("openIncognito");
	

	}

	public void clearCache() {
		System.out.println("clearCache");

	}
	
	public static void main(String[] args) {
		
		Chrome dd = new Chrome();
		dd.openIncognito();
		dd.openURL();
		System.out.println(browserName);
		System.out.println(browserVersion);
		dd.openIncognito();
		dd.openURL();
		
	}

}
