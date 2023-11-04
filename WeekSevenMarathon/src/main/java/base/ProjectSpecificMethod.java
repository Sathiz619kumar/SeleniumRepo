package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	
	public static ChromeDriver driver;
	
	@BeforeMethod
	public void preCdn() throws InterruptedException {
		// 1. Launch the application https://www.justickets.in/
		// 2. Search for movies showing in your city by entering the city name (e.g
		// chennai,Bengaluru) in the search bar.(pass from Excel)
		// 3. Click the "Search" button.
		// 4. From the list of movies displayed, select a movie that you want to watch.
		// 5. On the movie details page, verify that the movie's title and showtimes are
		// visible.
		// 6. Select a showtime for the chosen movie and Confrim (Terms and Conditions)
		// 7. Choose the number of seats(2)
		// 8. Click the confirm button
		// 9. Review the booking details, including the movie,seats and total cost.
		// 10. Choose a payment method (e.g., credit card, debit card, net banking).
		// 11. Enter the payment details with invalid data(pass from Excel)
		// 12. Verify that the ENTER VALID CARD NUMBER button is disabled

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		driver = new ChromeDriver(ch);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.justickets.in/");
		driver.manage().window().maximize();


	}

	public void postCdn() {
//driver.close();
	}
}
