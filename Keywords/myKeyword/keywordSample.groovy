package myKeyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

import org.openqa.selenium.Alert
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.WebDriver as WebDriver
import java.nio.file.Files
import java.nio.file.Paths
import org.apache.commons.io.FileUtils
import java.io.File

import internal.GlobalVariable
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData


import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException
import java.util.Arrays
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import org.openqa.selenium.*
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import java.net.URL as URL
import org.json.JSONObject as JSONObject
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import java.util.NoSuchElementException as NoSuchElementException
import java.util.concurrent.TimeUnit as TimeUnit
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import java.util.NoSuchElementException as NoSuchElementException
import java.util.*


@Keyword
def captureScreenshotFromAlert(String deviceNameCaps) {

	DesiredCapabilities caps = new DesiredCapabilities()

	caps.setCapability('device', GlobalVariable.DeviceNameCaps)
	caps.setCapability('udid', GlobalVariable.udid)
	caps.setCapability('platform', 'ANDROID')
	caps.setCapability('browser', 'CHROME')


	AppiumDriver driver = new AndroidDriver(new URL('http://127.0.0.1:4723/wd/hub'), caps)

	driver.context('NATIVE_APP')

	'Melakukan proses menunggu sampai web momobil ter-load'
	WebUI.delay(5)

	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE)
	File alertScreenshot = new File(WebUI.takeScreenshot(RunConfiguration.getReportFolder() + '/screenshoot alert.png', FailureHandling.STOP_ON_FAILURE))
	String reportPath = alertScreenshot.getAbsolutePath()
	FileUtils.copyFile(screenshotFile, alertScreenshot)

	return reportPath
}

@Keyword
def AddImageToReport(TestCase testcase, String imagePath) {
	KeywordLogger log = new KeywordLogger()
	log.logImage()
}




//@Keyword
//def screenShot (String deviceNameCaps) {
//
//DesiredCapabilities caps = new DesiredCapabilities()
//
//	caps.setCapability('device', GlobalVariable.DeviceNameCaps)
//	caps.setCapability('udid', GlobalVariable.udid)
//	caps.setCapability('platform', 'ANDROID')
//	caps.setCapability('browser', 'CHROME')
//
//
//	AppiumDriver driver = new AndroidDriver(new URL('http://127.0.0.1:4723/wd/hub'), caps)
//
//	driver.context('NATIVE_APP')
//
//	'Melakukan proses menunggu sampai web momobil ter-load'
//	WebUI.delay(5)
//
//	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE)
//	FileUtils.copyFile(screenshotFile, new File('screenshoot alert.png')
//}
