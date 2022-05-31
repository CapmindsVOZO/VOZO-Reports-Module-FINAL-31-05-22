package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.Pom_Class;

public class ReportsRunner extends Base_class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pom_Class pom = new Pom_Class(driver);

	public static void main(String[] args) throws InterruptedException {

		// Driver Maximize and Url Launch

		// Driver Maximize and Url Launch

		geturl("https://ehr.vozo.xyz:444/");

		// Enter Username
		sendkeys(pom.getinstance().getUsername(), "tech1");

		// Enter Password
		sendkeys(pom.getinstance().getPassword(), "capminds@03");

		// Click Signin Button '
		Clickonelement(pom.getinstance().getSigninbtn());

		// Click On Month Option
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Clickonelement(pom.getReports().getClickReport());
		
////////BILLIG SUMMAARY ////////////////

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		//Clickonelement(pom.getReports().getClickReportmod());

		Thread.sleep(4000);

		// Clickonelement(pom.getReports().getbillsu());

		// cli mon

		Clickonelement(pom.getReports().getclimo());

		// cli mon

		Clickonelement(pom.getReports().getcliqu());

		// cli mon

		Clickonelement(pom.getReports().getcliyea());

		// cli mon

		Clickonelement(pom.getReports().getcliyea());

		//////// payment analysis/////////////

		// cli pay

		Thread.sleep(2000);
		Clickonelement(pom.getReports().getpayana());

		// cli pay

		Clickonelement(pom.getReports().getpayanasea());

		// cli pay

		sendkeys(pom.getReports().getpayanasea(), "a");

		// cli pay

		Clickonelement(pom.getReports().getselepa());

		// cli pay

		Selectone(pom.getReports().getseleoff(), "oemrvozo");

		// stat da

		sendkeys(pom.getReports().getstarda(), "05/09/2022");

		// stat da

		sendkeys(pom.getReports().getenda(), "05/20/2022");

		// sele pos

		Selectone(pom.getReports().getposdat(), "Date of Service");
		// cli upd

		Clickonelement(pom.getReports().getcliupp());

		// cli crea

		Clickonelement(pom.getReports().getclicre());

		// cli crea

		Clickonelement(pom.getReports().getclipatpay());

		// cli crea

		Clickonelement(pom.getReports().getclich());
		
////////PRODUCT PROCEDURE ////////////////

		Thread.sleep(4000);

		Clickonelement(pom.getReports().getproproc());

		// proce or
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getReports().getprocor());

		// code or
		Thread.sleep(2000);

		sendkeys(pom.getReports().getcptco(), "a");

		// sele code

		Clickonelement(pom.getReports().getselecpt());

		// code or
		Thread.sleep(2000);

		sendkeys(pom.getReports().getfromda(), "2022-05-10");

		// code or
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getReports().getselfromda());

		// code or
		Thread.sleep(2000);

		sendkeys(pom.getReports().getseltoda(), "2022-05-20");

		// code or
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getReports().getseltodats());
		// code or
		Thread.sleep(2000);

		Clickonelement(pom.getReports().getclupd());
		
		
//APPOINTMENT REPORT		
		
		Thread.sleep(4000);

		// click Appointment Rerport
		Clickonelement(pom.getReports().getClickAppointmentReport());

		// click CheckAll
		Clickonelement(pom.getReports().getClickCheckAll());

		// click UnCheckAll
		Clickonelement(pom.getReports().getClickUnCheckAll());

		// click CheckAll
		Clickonelement(pom.getReports().getClickCheckAll1());

		// click UnCheckAll
		Clickonelement(pom.getReports().getClickUnCheckAll1());

		// Search Patient Name
		sendkeys(pom.getReports().getSearchPatientName(), "Guna");

		Clickonelement(pom.getReports().getselectNmae());
		// click All Office
		Clickonelement(pom.getReports().getClickAllOffice());

		// Select Test Facility Phar
		Clickonelement(pom.getReports().getSelectoemr());

		// click From Date
		// Clickonelement(pom.getReports().getclickFromdate());

		// select date number 8
		// Clickonelement(pom.getReports().getselectdatenumber8());

		// click End Date
		// Clickonelement(pom.getReports().getclickEndDate());

		// select date number 15
		// Clickonelement(pom.getReports().getselectdate15());

		// click Update Button
		Clickonelement(pom.getReports().getclickupdatebutton());

		// select Radio Button
		Clickonelement(pom.getReports().getclickRadioButton());	    
		
	////////// REMAINDER REPORT ///////

			// code or
			Thread.sleep(5000);

			Clickonelement(pom.getReports().getremre());

			// code or
			Thread.sleep(2000);

			sendkeys(pom.getReports().getremresep(), "a");

			// from or
			Thread.sleep(2000);

			sendkeys(pom.getReports().getremrefrom(), "05/10/2022");

			// from or
			Thread.sleep(2000);

			sendkeys(pom.getReports().getremreselto(), "05/30/2022");

			// from or
			Thread.sleep(2000);

			// Clickonelement(pom.getReports().getremreselto());

			// from or
			Thread.sleep(2000);

			Clickonelement(pom.getReports().getremreday());

			// from or
			Thread.sleep(2000);

			Clickonelement(pom.getReports().getremreweek());

			// from or
			Thread.sleep(2000);

			Clickonelement(pom.getReports().getremremon());

			// from or
			Thread.sleep(2000);

			Clickonelement(pom.getReports().getremreye());

			// from or
			Thread.sleep(2000);

			Clickonelement(pom.getReports().getcliup());
			
	/////////// PATIENT REPORT////////////

			// clcik patient report
			Thread.sleep(5000);

			Clickonelement(pom.getReports().getClickpatientrep());

			// select from date

			sendkeys(pom.getReports().getfromcalenderpr(), "05/10/2022");

			// Clickonelement(pom.getReports().getclfromcalenderpr());

			// select to date

			sendkeys(pom.getReports().gettocalenderpr(), "05/20/2022");

			// Clickonelement(pom.getReports().gettocalenderpr());

			// Clickonelement(pom.getReports().getcltocalenderpr());
			// select age
			Thread.sleep(2000);

			sendkeys(pom.getReports().getseleage(), "20");

			// select sex
			Thread.sleep(2000);

			// sendkeys(pom.getReports().getselectsex(), "Male");

			Selectone(pom.getReports().getselectsex(), "Male");

			// select sex

			Thread.sleep(2000);

			// Clickonelement(pom.getReports().getselesex());

			// click race

			Thread.sleep(2000);

			Selectone(pom.getReports().getselerace(), "American Indian");

			// sendkeys(pom.getReports().getselerace(), "American Indian or Alaska
			// Native");

			// Clickonelement(pom.getReports().getselectrace());

			// click ethn
			Thread.sleep(2000);

			Selectone(pom.getReports().getselectethn(), "Hispanic or Latino");

			// sendkeys(pom.getReports().getselectethn(), "");

			// search medi

			sendkeys(pom.getReports().getsearchmedi(), "a");

			Clickonelement(pom.getReports().getselemedi());

			// search allergy

			sendkeys(pom.getReports().getsearchallergy(), "a");

			Clickonelement(pom.getReports().getselealler());

			// search problem

			sendkeys(pom.getReports().getsearchproblem(), "a");

			Clickonelement(pom.getReports().getselepro());

			// click search

			Clickonelement(pom.getReports().getclicksearch());


			
////TELE HEALTH REPORT

		Thread.sleep(4000);
		// click the Tele Health Report
		Clickonelement(pom.getReports().getclickTeleHealthReport());

		// click checkAll Radio button
		Clickonelement(pom.getReports().getclickCheckAll());

		// click checkAll Radio button
		Clickonelement(pom.getReports().getclickUnCheckAll());

		// click Occured Radio Button
		Clickonelement(pom.getReports().getclickOccuredRadioButton());

		// click Did notOccured Radio Button
		Clickonelement(pom.getReports().getclickDidnotOccuredRadioButton());

		// search the Patient Name
		// sendkeys(pom.getReports().getSearchThePatientName1(), "gunad");

		// Clickonelement(pom.getReports().getselectPatientname());

		// click Select office Option
		Clickonelement(pom.getReports().getClickOfficeOption());

		// click Select office Option
		Clickonelement(pom.getReports().getSelectclickTestFacilityPhar());

		// click Start date Option
		Clickonelement(pom.getReports().getclickStartDate());

		// Select Start date 16
		Clickonelement(pom.getReports().getSelectStartDate16());

		// click End date Option
		Clickonelement(pom.getReports().getclickEndDateq());

		// Select End date 31
		// Clickonelement(pom.getReports().getSelectStartDate31());

		// Click Update Filter Option
		// Clickonelement(pom.getReports().getclickUpdateFilterOption());

		// Click Update Export to file
		// Clickonelement(pom.getReports().getClickExportToFile());

		// Click Update Export to file
		// Clickonelement(pom.getReports().getClickLoadmore());

//Productivity Report

		// click the Tele Health Report
		Clickonelement(pom.getReports().getclickTeleHealthReport());
		
		Thread.sleep(6000);

		// Click Productivity Report
		Clickonelement(pom.getReports().getClickProductivityReport());

		// Click From Date
		Clickonelement(pom.getReports().getClickTheFromDate());

		// Select From Date 16
		Clickonelement(pom.getReports().getSelectTheFromDate16());

		// Click End Date
		Clickonelement(pom.getReports().getclickTheEndDate());

		// Select From Date 31
		Clickonelement(pom.getReports().getselectTheEndDate31());

		// Click The Provider option
		Clickonelement(pom.getReports().getClickProvider());

		// Select Provider
		Clickonelement(pom.getReports().getSelectProvider());

		// Click the Include Cancelled and NoShow Appointments
		Clickonelement(pom.getReports().getClickCheckBox());

		// click update button
		Clickonelement(pom.getReports().getClickUpdateButton());

		// click load more
		// Clickonelement(pom.getReports().getClickLoadMore());

//////////// Outgoing Prescription

		Thread.sleep(4000);
		// click Outgoing Prescription
		Clickonelement(pom.getReports().getClickOutgoingPrescription());

		// EnterPatientName
		Clickonelement(pom.getReports().getEnterPatientName());

		// SelectPatientName
		// Clickonelement(pom.getReports().getSelectPatientName());

		// EnterDescription
		sendkeys(pom.getReports().getEnterDescription(), "ZOCOR");

		// SelectDescription
		Clickonelement(pom.getReports().getSelectDescription());

		// EnterPharmacy
		sendkeys(pom.getReports().getEnterPharmacy(), "BJS WHOLESALE CLUB IN");

		// SlectPharmacy
		Clickonelement(pom.getReports().getSlectPharmacy());

		// ClickStartDate
		Clickonelement(pom.getReports().getClickStartDate());

		// EnterPharmacy
		Clickonelement(pom.getReports().getEnterPharmacy());

		// SlectPharmacy
		Clickonelement(pom.getReports().getSlectPharmacy());

		// ClickStartDate
		// Clickonelement(pom.getReports().getClickStartDate());

		// SelectStartDate
		// Clickonelement(pom.getReports().getSelectStartDate());
//
//		Clickonelement(pom.getReports().getEnterPharmacy());
//
//		// EnterPharmacy
//		Clickonelement(pom.getReports().getEnterPharmacy());
//
//		// SlectPharmacy
//		Clickonelement(pom.getReports().getSlectPharmacy());
//
//		// ClickStartDate
//		Clickonelement(pom.getReports().getClickStartDate());
//
//		// SelectStartDate
//		Clickonelement(pom.getReports().getSelectStartDate());
//
//		// EnterPharmacy
//		Clickonelement(pom.getReports().getEnterPharmacy());
//
//		// SlectPharmacy
//		Clickonelement(pom.getReports().getSlectPharmacy());
//
//		// ClickStartDate
//		Clickonelement(pom.getReports().getClickStartDate());
//
//		// SelectStartDate
//		Clickonelement(pom.getReports().getSelectStartDate());
//
//		// ClickEndtDate
//		Clickonelement(pom.getReports().getClickEndtDate());
//
//		// SelectEndtDate
//		Clickonelement(pom.getReports().getSelectEndtDate());

		// ClickFilter
		// Clickonelement(pom.getReports().getClickFilter());

//User Report
		Thread.sleep(4000);
		// click User Report
		Clickonelement(pom.getReports().getClickUserreport());

		// Enter Search Username
		sendkeys(pom.getReports().getEnterSearchUsername(), "TESTER");
		Thread.sleep(2000);
		Clickonelement(pom.getReports().getSelectSearchUsername());

		// click Inactive
		// Clickonelement(pom.getReports().getclickInactiveRadioButton());

		// click Search Button
		Clickonelement(pom.getReports().getclickSearchButton());

		// click Staff Button
		Clickonelement(pom.getReports().getclickStaffButton());

		// Enter Search Username
		sendkeys(pom.getReports().getEnterUserName(), "guna");

		// click Inactive
		Clickonelement(pom.getReports().getClickInactive());

		// click Search Button
		Clickonelement(pom.getReports().getclickSearchButton1());

////////////////// Invoice
		
		Thread.sleep(6000);

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement element2 = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Invoices']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element2);
		// click Invoices
		// Clickonelement(pom.getReports().getClickInvoices());

		// getEnterPatientName1
		sendkeys(pom.getReports().getEnterPatientName1(), "Ravi");
		// Clickonelement(pom.getReports().getEnterPatientName1());

		// SelectPatientName1
		Clickonelement(pom.getReports().getSelectPatientName1());

		// Click Invoices Status
		Clickonelement(pom.getReports().getClickInvoicesStatus());

		// EnterPharmacy
		Clickonelement(pom.getReports().getselectPaid());

		// Enter Invoiceid
		sendkeys(pom.getReports().getEnterInvoiceid(), "vozoinv#8");
		// Clickonelement(pom.getReports().getEnterInvoiceid());

		// selectInvoiceId
		Clickonelement(pom.getReports().getselectInvoiceId());

		// ClickStartDate
		sendkeys(pom.getReports().getEnterStartdate(), "2022-05-10");

		// SelectEndtDate
		sendkeys(pom.getReports().getEnterEnddate(), "2022-06-13");

		// clickSearch
		Clickonelement(pom.getReports().getclickSearch());

	}

}
