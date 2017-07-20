package org.qait.coach.coach1;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

class TestCoachGiftCard {
	CoachGiftCard coachGCObj;
	Driver driverobj;
	WebDriver driver;

	String GiftcardTitle = "SEND STYLE";
	String giftCardDescription = "The luxury of choice is a wonderful gift.";
	String giftCard = "GIFT CARDS";
	String thankYou = "THANK YOU FOR YOUR ORDER.";

	@BeforeTest
	void setup() {
		driverobj = new Driver();

	}

	@Test(priority = 0)
	void testLaunchApplication() {
		driver = driverobj.LaunchApplication();
		coachGCObj = new CoachGiftCard(driver);
	}

	@Test(priority = 1)
	void testClickOnGiftCards() {
		coachGCObj.clickOnGiftCards();
	}

	@Test(priority = 2)
	void testClickOnCloseButton() {
		coachGCObj.clickOnCloseButton();
	}

	@Test(priority = 3)
	void testVerifyGiftCardPage() throws InterruptedException {
		coachGCObj.scrollIntoView();
		assertEquals("check GiftcardTitle", GiftcardTitle, coachGCObj.getGiftCardTitle());
		assertEquals("check giftCardDescription", giftCardDescription, coachGCObj.getGiftCardDescription());
		assertEquals("check giftCardText", giftCard, coachGCObj.getGiftCardText());
	}

	@Test(priority = 4)
	void TestGiftCards() throws InterruptedException {
		coachGCObj.giftCardDetails();
	}

}
