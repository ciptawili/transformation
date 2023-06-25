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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.waitForElementVisible(findTestObject('Page pos/form_input_search_item'), 0)

WebUI.click(findTestObject('Page pos/form_input_search_item'))

WebUI.setText(findTestObject('Page pos/form_input_search_item'), this.name)

WebUI.click(findTestObject('Page pos/icon_search_item'))

List<WebElement> elements = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Page pos/Page modal_item/button_add_item_list'), 
    10)

WebElement randomElement = elements.get(new Random().nextInt(elements.size()))

randomElement.click()

WebUI.waitForElementClickable(findTestObject('Page pos/input_qty'), 0)

WebUI.doubleClick(findTestObject('Page pos/input_qty'))

WebUI.setText(findTestObject('Page pos/input_qty'), '3')

GlobalVariable.subTotalItemPrice = WebUI.getAttribute(findTestObject('Page pos/subtotal_item_price'), 'value')
GlobalVariable.nameItem = ("NR ")+WebUI.getAttribute(findTestObject('Object Repository/Page pos/form_input_search_item'), 'value')

WebUI.click(findTestObject('Page pos/button_add_item_to_list'))

