import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class Get_TC_STATUS {
	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def beforeTestCase(TestCaseContext testCaseContext) {
	  GlobalVariable.TestCaseName = testCaseContext.getTestCaseId().substring(testCaseContext.getTestCaseId().toString().indexOf("/")+1)
	}
	
	@AfterTestCase
	def afterTestCase(TestCaseContext testCaseContext) {
	    try {
	        def tc_ids = testCaseContext.getTestCaseVariables()['testrail_tc_id'].split(",")
	        for (def n : (0 .. tc_ids.length - 1)) {
	            GlobalVariable.G_run_testrail_tc_id.add(tc_ids[n])
	            GlobalVariable.G_run_testrail_tc_status.add(testCaseContext.getTestCaseStatus())
//				if(testCaseContext.getTestCaseStatus() == "PASSED") {
//					WebUI.callTestCase(findTestCase('00. WorkPaper/CreateWorkSheet'), [:], FailureHandling.STOP_ON_FAILURE)					
//				}
	        }
	    } catch (NullPointerException ex) {
	    }
		//WebUI.delay(30)
	}

	/**
	 * Executes after every test suite ends.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@AfterTestSuite
	def afterTestSuite() {
	    println 'push results to testrail'
		//Mobile.callTestCase(findTestCase('00. WorkPaper/CreateWorkSheet'), [:], FailureHandling.STOP_ON_FAILURE)
		//Mobile.callTestCase(findTestCase('00 Regression adiraku 2.5.0/TestRail_Update_Run_With_Results'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}