package testCase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.searchPage;

public class BookTicketChennai extends ProjectSpecificMethod {
	@Test
	public void bookTicket() throws InterruptedException {
		new searchPage().clickSearchCity().enterSearchCity().selectSearchCity().selectAnyMovie().selectMovieTime().acceptTandC().selectMovieSeat().confirmSeatSelection().SelectPaymentMethod().enterCardNumDetails().enterCardExpiryDetails().enterCVVDetails().enterNameDetails().enterMailDetails().enterPNumDetails();
	}
	

}
