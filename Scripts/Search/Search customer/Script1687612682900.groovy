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

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebElement

WebUI.waitForElementVisible(findTestObject('Page pos/icon_search_customer'), 0)

WebUI.click(findTestObject('Page pos/icon_search_customer'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page pos/Page modal_customer/input_search_customer'))

WebUI.setText(findTestObject('Page pos/Page modal_customer/input_search_customer'), this.name)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page pos/Page modal_customer/list_customer'), 0)

List<WebElement> elements = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Page pos/Page modal_customer/list_customer'), 10)
WebElement randomElement = elements.get(new Random().nextInt(elements.size()))
randomElement.click()

