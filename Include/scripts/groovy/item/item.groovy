package item
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



class item {

	@When("User search item (.*) and choose the item")
	def user_search_item_and_choose_the_item(String name) {
		WebUI.callTestCase(findTestCase('Test Cases/search/Search and Choose Item'), [ ('name') : name ], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User search item with keyword (.*)")
	def user_search_item_with_keyword(String name) {
		WebUI.callTestCase(findTestCase('Test Cases/search/Search item'), [ ('name') : name ], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User success add item to checkout")
	def user_success_add_item_to_checout_step() {
		WebUI.callTestCase(findTestCase('Test Cases/item/Success Add Item'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("User can't see item list")
	def user_cant_see_item_list() {
		WebUI.callTestCase(findTestCase('Test Cases/search/Search item not found'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}