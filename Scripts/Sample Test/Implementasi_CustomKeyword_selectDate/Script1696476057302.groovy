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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev.moservice.id/')

WebUI.verifyElementPresent(findTestObject('testMoservice/Website/button_masukDaftar'), 0)

WebUI.click(findTestObject('testMoservice/Website/button_masukDaftar'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('testMoservice/Website/textbox_noHP_web'), '085880007581')

WebUI.sendKeys(findTestObject('testMoservice/Website/textbox_kataSandi_web'), 'Qwerty999!')

WebUI.click(findTestObject('testMoservice/Website/button_Masuk'))

WebUI.verifyElementPresent(findTestObject('testMoservice/Website/button_menuSpooringBalancing'), 0)

WebUI.click(findTestObject('testMoservice/Website/button_menuSpooringBalancing'))

WebUI.verifyElementPresent(findTestObject('testMoservice/Website/button_bengkel1'), 0)

WebUI.click(findTestObject('testMoservice/Website/button_bengkel1'))

WebUI.verifyElementPresent(findTestObject('testMoservice/Website/button_sayaInginService'), 0)

WebUI.click(findTestObject('testMoservice/Website/button_sayaInginService'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('testMoservice/Website/dropdown_pilihDataMobil'), 0)

WebUI.click(findTestObject('testMoservice/Website/dropdown_pilihDataMobil'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('testMoservice/Website/dropdownlist_dataMobil1'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('testMoservice/Website/button_Lanjut'), 0)

WebUI.click(findTestObject('testMoservice/Website/button_Lanjut'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('testMoservice/Website/textbox_tanggalService'), 0)

WebUI.click(findTestObject('testMoservice/Website/textbox_tanggalService'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'myKeyword.myTestKeyword.selectDate'(21)

