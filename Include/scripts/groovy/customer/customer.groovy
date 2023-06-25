package customer
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.When
import cucumber.api.java.en.Then


class customer {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("User search with customer name (.*) and choose customer")
	def user_search_with_customer_name_step(String name) {
		WebUI.callTestCase(findTestCase('Test Cases/search/Search customer'), [ ('name') : name ], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User success choose customer")
	def user_success_choose_customer() {
		WebUI.callTestCase(findTestCase('Test Cases/search/Success get customer'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}