package myKeyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver

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

import internal.GlobalVariable

public class myTestKeyword {
	@Keyword
	def testPrint(String inputUser, int loopTimes) {

		println(inputUser)
		println('akan looping '+ loopTimes + ' kali')

		for(int i = 1; i<=loopTimes; i++ ){
			println(inputUser + i)
		}
		String kembalikan = inputUser + ' Sudah dikembalikan'

		return kembalikan
	}

	@Keyword
	def selectDate(int cekTgl) {
		def tglBook = WebUI.verifyElementPresent(findTestObject('Object Repository/testMoservice/Website/Page_tanggalService/label_tglBisaBooking'), 0);
		def tglBlockBook = WebUI.verifyElementPresent(findTestObject('Object Repository/testMoservice/Website/Page_tanggalService/label_tglTidakBisaBooking'), 0);

		//cek dan select date yang bisa di booking bengkelnya
		for(tglBook=20; tglBook<=cekTgl; tglBook++) {
			WebUI.click(findTestObject('Object Repository/testMoservice/Website/Page_tanggalService/label_pilihTanggalBookingPertama'));
		}

	}

	@Keyword
	def splitText(String mobilUser, String separator, int index) {
		String[] mobilUserSplit = mobilUser.split(separator);
		String result = mobilUserSplit[index];
		return result
	}

	@Keyword
	def String LowerText(String mobilUser) {
		String [] hasilSplitTest = mobilUser.split(" ");
		String kataPertama = hasilSplitTest.toString().toLowerCase();
		String kataKedua = hasilSplitTest.toString().toUpperCase();
		String SplitPertama = hasilSplitTest[0].toLowerCase();
		String SplitKedua = hasilSplitTest[1].toUpperCase();
		String SplitKetiga = hasilSplitTest[2].toString().capitalize();
		String KapitalAwal = hasilSplitTest[0].substring(0,1).toUpperCase()+hasilSplitTest[0]+"";
		String KapitalAkhir = hasilSplitTest[0].substring(0,4).capitalize()+hasilSplitTest[0].substring(hasilSplitTest[0].length()-1).toUpperCase()+"";
		String result = "${kataPertama}\n"+"${kataKedua}\n"+"${SplitPertama}\n"+"${SplitKedua}\n" +"${SplitKetiga}\n"+"${KapitalAwal}\n"+"${"${KapitalAkhir}"}"+" ";
	//		String result2 = "${KapitalAwal}\n"+"${KapitalAkhir}\n"+" "
	return result
	return result2
}
}
