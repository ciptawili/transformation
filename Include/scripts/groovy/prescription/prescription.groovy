package prescription
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
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



class prescription {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("User choose existing data prescription")
	def User_choose_existing_data_prescription() {
		WebUI.callTestCase(findTestCase('Test Cases/prescription/Choose resep'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User success add item from prescription")
	def User_success_add_item_from_prescription() {
		WebUI.callTestCase(findTestCase('Test Cases/prescription/Success add item prescription'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User add new regular prescription and choosing prescription")
	def User_add_new_regular_prescription_and_choosing_prescription() {
		WebUI.callTestCase(findTestCase('Test Cases/prescription/Add new regular prescription'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User search prescription (.*)")
	def user_search_prescription(String keyword) {
		WebUI.callTestCase(findTestCase('Test Cases/prescription/Search prescription'), [ ('keyword') : keyword ], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User open page prescription")
	def user_open_page_prescription() {
		WebUI.callTestCase(findTestCase('Test Cases/prescription/Open page prescription'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}