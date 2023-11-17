package myPackages
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.*
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import cucumber.api.PendingException

import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys as Keys

import org.junit.runner.RunWith
import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import cucumber.runtime.Glue


class DirectToCURAHospital {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User buka browser")
	def User_buka_browser() {
		//				WebUI.openBrowser("")
		println "Ini given"
		WebUI.openBrowser("")
		'Memuat layar jadi fullscreen'
		WebUI.maximizeWindow()
	}

	@When("User input url website CURA Hospital")
	def User_input_url_website_CURA_Hospital() {
		WebUI.navigateToUrl("https://katalon-demo-cura.herokuapp.com/")
		println "Ini when"
	}

	@Then("User akan ditampilkan halaman CURA Hospital")
	def User_akan_ditampilkan_halaman_CURA_Hospital() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/herokuapp/label_CURAHospital'), 0, FailureHandling.STOP_ON_FAILURE)
		println "Ini then"
	}

	@And("User akan ditampilkan button make appointment di halaman beranda")
	def User_akan_ditampilkan_button_make_appointment_di_halaman_beranda(){
		WebUI.verifyElementPresent(findTestObject('Object Repository/herokuapp/button_makeAppointment'), 0, FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser()
		println "Ini and"
	}
}