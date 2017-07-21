package org.qait.coach.coach1;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCoachCheckOut {

	CoachGiftCard coachGCObj;
	ExcelFile efObj;
	Driver driverobj;
	CoachCheckOut coachCheckOutObject;
	int sleepTime = 5000;
	WebDriver driver;
	String GiftcardTitle = "SEND STYLE";
	String giftCardDescription = "The luxury of choice is a wonderful gift.";
	String giftCard = "GIFT CARDS";
	String thankYou = "THANK YOU FOR YOUR ORDER.";
	int cursor = 1;

	@BeforeTest
	void setup() {
		driverobj = new Driver();
		efObj = new ExcelFile();
	}

	@Test(priority = 0)
	void testLaunchApplication() {
		driver = driverobj.LaunchApplication();
		coachGCObj = new CoachGiftCard(driver);
		coachCheckOutObject = new CoachCheckOut(driver);
	}

	@Test(priority = 1)
	void testClickOnSaleButton() {
		coachCheckOutObject.clickOnSaleButton();
	}

	@Test(priority = 2)
	void testClickOnCrossSign() {
		coachCheckOutObject.clickOnCloseButton();
	}

	@Test(priority = 3)
	void TestClickOnSelectedBoot() {
		coachCheckOutObject.clickOnSelectedBoot();
	}

	@Test(priority = 4)
	void TestClickOnSizeButton() throws InterruptedException {
		coachCheckOutObject.clickOnSizeButton();
	}

	@Test(priority = 5)
	void TestSetSizeOfBoot() {
		coachCheckOutObject.setSizeOfBoot();
	}

	@Test(priority = 6)
	void TestClickOnAddToBag() throws InterruptedException {
		coachCheckOutObject.clickOnAddToBag();
	}

	@Test(priority = 7)
	void testClickOnBagButton() throws InterruptedException {
		coachCheckOutObject.clickOnBagButton();
	}

	@Test(priority = 8)
	void testClickOnCheckButton() {
		coachCheckOutObject.clickOnCheckOut();
	}

	@Test(priority = 9)
	void testSetFirstName() {
		coachCheckOutObject.setFirstName();
	}

	@Test(priority = 10)
	void testSetLastName() {
		coachCheckOutObject.setLastName();
	}

	@Test(priority = 11)
	void testSetAdress() {
		coachCheckOutObject.setAdress();
	}

	@Test(priority = 12)
	void testSetZipCode() {
		coachCheckOutObject.setZipCode();
	}

	@Test(priority = 13)
	void testSetPhoneNumber() {
		coachCheckOutObject.setPhoneNumber();
	}

	@Test(priority = 14)
	void testClickOnContinue() throws InterruptedException {
		coachCheckOutObject.clickOnContinue();
	}

	@Test(priority = 15)
	void testsetCardNumber() {
		coachCheckOutObject.setCardNumber(efObj.getCreditCardNumber(cursor));
	}
	
	@Test(priority = 16)
	void testSetMonth() {
		coachCheckOutObject.setMonth();
	}

	@Test(priority = 17)
	void testSetYear() {
		coachCheckOutObject.setYear();
	}

	@Test(priority = 18)
	void testSetSecurityCode() {
		coachCheckOutObject.setSecurityCode(efObj.getCreditCardSecurityNumber(cursor));
	}
	
	@Test(priority = 19)
	void testSetEmailAddress() {
		coachCheckOutObject.setEmailAddress();
	}

	@Test(priority = 20)
	void testSetConfirmEmailAddress() {
		coachCheckOutObject.setConfirmEmailAddress();
	}

	@Test(priority = 21)
	void testClickOnPaymentContinue() throws InterruptedException {
		coachCheckOutObject.clickOnContinue();
	}

	@Test(priority = 22)
	void testSetSecurityCodes() {
		coachCheckOutObject.setSecurityCode(efObj.getCreditCardSecurityNumber(cursor));
	}
	
	@Test(priority = 23)
	void testClickOnPaymentContinues() throws InterruptedException {
		coachCheckOutObject.clickOnContinue();
	}

	@Test(priority = 24)
	void testClickOnPlaceOrder() {
		coachCheckOutObject.clickOnPlaceOrder();
		assertEquals("check your order is placed", thankYou, coachCheckOutObject.getThankYouText());
	}
}
