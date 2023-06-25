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

WebUI.waitForElementVisible(findTestObject('Page pos/text_payment_amount'), 0)

WebUI.waitForElementVisible(findTestObject('Page pos/button_payment_method_detail'), 0)

WebUI.click(findTestObject('Page pos/button_payment_method_detail'))

WebUI.waitForElementVisible(findTestObject('Page pos/Page modal_payment/field_payment_method'), 0)

WebUI.waitForElementVisible(findTestObject('Page pos/Page modal_payment/field_payment_term'), 0)

WebUI.waitForElementVisible(findTestObject('Page pos/Page modal_payment/text_total_payment_amount'), 0)

switch (this.payment) {
    case 'Cash':
        WebUI.click(findTestObject('Page pos/Page modal_payment/field_payment_method'))

        WebUI.waitForElementVisible(findTestObject('Page pos/Page modal_payment/select_payment_cash'), 0)

        WebUI.click(findTestObject('Page pos/Page modal_payment/select_payment_cash'))

        WebUI.waitForPageLoad(2)

        WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

        break
    case 'Debit':
        WebUI.click(findTestObject('Page pos/Page modal_payment/field_payment_method'))

        WebUI.waitForElementVisible(findTestObject('Page pos/Page modal_payment/select_payment_debit'), 0)

        WebUI.click(findTestObject('Page pos/Page modal_payment/select_payment_debit'))

        WebUI.waitForElementVisible(findTestObject('Page pos/Page modal_payment/select_edc'), 0)

        WebUI.click(findTestObject('Page pos/Page modal_payment/select_edc'))

        WebUI.waitForElementVisible(findTestObject('Page pos/Page modal_payment/select_edc_mandiri'), 0)

        WebUI.click(findTestObject('Page pos/Page modal_payment/select_edc_mandiri'))

        WebUI.waitForPageLoad(2)

        WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

        break
    case 'Kredit':
        WebUI.click(findTestObject('Page pos/Page modal_payment/field_payment_method'))

        WebUI.waitForElementVisible(findTestObject('Page pos/Page modal_payment/select_payment_kredit'), 0)

        WebUI.click(findTestObject('Page pos/Page modal_payment/select_payment_kredit'))

        WebUI.waitForElementVisible(findTestObject('Page pos/Page modal_payment/field_payment_term'), 0)

        WebUI.click(findTestObject('Page pos/Page modal_payment/field_payment_term'))

        WebUI.waitForElementVisible(findTestObject('Page pos/Page modal_payment/select_payment_term_14'), 0)

        WebUI.click(findTestObject('Page pos/Page modal_payment/select_payment_term_14'))

        WebUI.delay(2)

        WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

        break
    default:
        println('masuk sini')

        break
}

WebUI.waitForElementVisible(findTestObject('Page pos/button_save_transaction'), 0)

WebUI.click(findTestObject('Page pos/button_save_transaction'))

WebUI.waitForPageLoad(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

