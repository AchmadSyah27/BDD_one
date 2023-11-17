import com.kms.katalon.core.annotation.Keyword as Keyword
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
import cucumber.api.java.gl.Logo as Logo
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.Alert as Alert
import org.openqa.selenium.OutputType as OutputType
import org.openqa.selenium.TakesScreenshot as TakesScreenshot
import org.openqa.selenium.WebDriver as WebDriver
import java.nio.file.Files as Files
import java.nio.file.Paths as Paths
import org.apache.commons.io.FileUtils as FileUtils
import java.io.File as File
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.*
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidBatteryInfo as AndroidBatteryInfo
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.io.BufferedReader as BufferedReader
import java.io.FileReader as FileReader
import java.io.IOException as IOException
import java.util.Arrays as Arrays
import javax.imageio.ImageIO as ImageIO
import java.awt.AWTException as AWTException
import java.awt.Point as Point
import java.awt.Rectangle as Rectangle
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.image.BufferedImage as BufferedImage
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.sun.org.apache.xalan.internal.xslt.Process as Process
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import io.appium.java_client.AppiumDriver as AppiumDriver
import java.net.URL as URL
import org.json.JSONObject as JSONObject
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import java.util.NoSuchElementException as NoSuchElementException
import java.util.concurrent.TimeUnit as TimeUnit
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import java.util.*
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

'Melakukan proses buka browser'
WebUI.openBrowser('')

'Menuju ke halaman web momobil'
WebUI.navigateToUrl(urlWeb)

'Ijinkan Web untuk mengetahui lokasi user'
not_run: CustomKeywords.'mobileWeb.mobileWebKeyword.StartSessionAppiumDefault'(GlobalVariable.AppiumPath)

'Melakukan proses screenshoot pada halaman awal momobil web'
WebUI.takeScreenshot(RunConfiguration.getReportFolder() + '/screenshoot pada halaman awal momobil web.png', FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'mobileWeb.mobileWebKeyword.AcceptGeolocation'(GlobalVariable.DeviceNameCaps)

not_run: CustomKeywords.'mobileWeb.mobileWebKeyword.CloseTranslateGoogleInfoBar'(GlobalVariable.DeviceNameCaps)

'Ijinkan Web untuk mengetahui lokasi user'
not_run: WebUI.click(findTestObject('testMoservice/Mobile/label_MasukDaftar'))

not_run: WebUI.waitForElementVisible(findTestObject('testMoservice/Mobile/label_daftar'), 0)

not_run: WebUI.click(findTestObject('testMoservice/Mobile/label_daftar'))

WebUI.waitForElementVisible(findTestObject('testMoservice/Website/textbox_nama'), 0)

WebUI.setText(findTestObject('testMoservice/Website/textbox_nama'), 'andrian soedjadi')

not_run: Mobile.hideKeyboard()

WebUI.setText(findTestObject('testMoservice/Website/textbox_noHP'), '085880007581888')

not_run: Mobile.hideKeyboard()

WebUI.setText(findTestObject('testMoservice/Website/textbox_passwordBaru'), passBaru)

not_run: Mobile.hideKeyboard()

WebUI.click(findTestObject('testMoservice/Website/checkbox_SnK'))

WebUI.scrollToElement(findTestObject('testMoservice/Website/button_setuju'), 0)

WebUI.click(findTestObject('testMoservice/Website/button_setuju'))

//WebUI.takeScreenshotAsCheckpoint(RunConfiguration.getReportFolder() + '/screenshoot pada halaman register moservice.png', [])
'Melakukan proses screenshoot pada halaman register moservice'
WebUI.takeScreenshot(RunConfiguration.getReportFolder() + '/screenshoot pada halaman register moservice.png')

WebUI.click(findTestObject('testMoservice/Website/button_Daftar'))

WebUI.delay(3)

WebDriver driver = DriverFactory.getWebDriver()

String alertText = driver.switchTo().alert().getText()

println('vicky test alert Text: ' + alertText)

//WebUI.switchToDefaultContent()
WebUI.takeScreenshot(RunConfiguration.getReportFolder() + '/vicky test.png')

