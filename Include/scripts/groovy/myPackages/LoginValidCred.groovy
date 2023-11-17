package myPackages
import cucumber.api.PendingException
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import cucumber.api.java.en.And

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys



public class LoginValidCred {

	@Given("User akses web dan ingin login")
	public void User_akses_web_dan_ingin_login() {
		println " I inside in Given"
		'Open browser'
		WebUI.openBrowser('')

		'Memuat layar jadi fullscreen'
		WebUI.maximizeWindow()

		'Menuju URL'
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
	}

	@When("User input username dan password yang valid")
	public void User_input_username_dan_password_yang_valid() {
		println " I inside in When"
		'Menunggu element button login tampil'
		WebUI.waitForElementPresent(findTestObject('Halaman_Login/button_login'), 0)

		'Memastikan element textbox username tampil'
		WebUI.verifyElementPresent(findTestObject('Halaman_Login/textbox_username'), 0)

		'Memastikan element textbox password tampil'
		WebUI.verifyElementPresent(findTestObject('Halaman_Login/textbox_password'), 0)

		'Memastikan element button login tampil'
		WebUI.verifyElementPresent(findTestObject('Halaman_Login/button_login'), 0)

		'Input username'
		WebUI.setText(findTestObject('Halaman_Login/textbox_username'), 'Admin')

		'Input password'
		WebUI.setText(findTestObject('Halaman_Login/textbox_password'), 'admin123')
	}

	@And("Klik button login")
	public void Klik_button_login() {
		println " I inside in And"
		'Klik button Login'
		WebUI.click(findTestObject('Halaman_Login/button_login'))
	}

	@Then("User berhasil login")
	public void User_berhasil_login() {
		println " I inside in Then"
		'Menunggu menu dashboard bagian samping tampil'
		WebUI.waitForElementPresent(findTestObject('Halaman_Dashboard/label_sideMenuDashboard'), 0)

		'Memastikan menu dashboard samping tampil'
		WebUI.verifyElementPresent(findTestObject('Halaman_Dashboard/label_sideMenuDashboard'), 0)

		'Tutup browser'
		WebUI.closeBrowser()
	}
}