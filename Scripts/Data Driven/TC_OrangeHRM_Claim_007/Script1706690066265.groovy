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

WebUI.click(findTestObject('Object Repository/OrangeHRMPages/OrangeHRM_Claim_OR/a_Claim'))

WebUI.click(findTestObject('Object Repository/OrangeHRMPages/OrangeHRM_Claim_OR/a_Submit Claim'))

WebUI.click(findTestObject('Object Repository/OrangeHRMPages/OrangeHRM_Claim_OR/event_Select'))

def index = 1

while (true) {
    TestObject testObject = findTestObject('Object Repository/OrangeHRMPages/OrangeHRM_Claim_OR/div_Event', [('index') : index])

    if (testObject == null) {
        break
    }
    
    String divString = WebUI.getText(testObject)

    System.out.println(divString)

    if (divString.equals(event)) {
        WebUI.click(testObject)

        break
    }
    
    index++
}

WebUI.click(findTestObject('OrangeHRMPages/OrangeHRM_Claim_OR/currency_Select'))

index = 1

while (true) {
    TestObject testObject = findTestObject('Object Repository/OrangeHRMPages/OrangeHRM_Claim_OR/div_Currency', [('index') : index])

    if (testObject == null) {
        break
    }
    
    if (WebUI.getText(testObject).equals(currency)) {
        WebUI.click(testObject)

        break
    }
    
    index++
}

WebUI.setText(findTestObject('Object Repository/OrangeHRMPages/OrangeHRM_Claim_OR/textarea_Remarks_oxd-textarea oxd-textarea-_237541'), 
    remark)

WebUI.click(findTestObject('Object Repository/OrangeHRMPages/OrangeHRM_Claim_OR/button_Create'))

WebUI.waitForPageLoad(20)

WebUI.waitForElementPresent(findTestObject('Object Repository/OrangeHRMPages/OrangeHRM_Claim_OR/event_value'), 20)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/OrangeHRMPages/OrangeHRM_Claim_OR/event_value'), 'value', 
    event, 5)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/OrangeHRMPages/OrangeHRM_Claim_OR/currency_value'), 
    'value', currency, 5)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/OrangeHRMPages/OrangeHRM_Claim_OR/remark_value'), 'value', 
    remark, 5)

WebUI.verifyElementAttributeValue(findTestObject('OrangeHRMPages/OrangeHRM_Claim_OR/status_value'), 'value', 'Initiated', 
    5)

WebUI.click(findTestObject('Object Repository/OrangeHRMPages/OrangeHRM_Claim_OR/button_Submit'))

WebUI.waitForPageLoad(20)

WebUI.waitForElementPresent(findTestObject('Object Repository/OrangeHRMPages/OrangeHRM_Claim_OR/status_value'), 20)

WebUI.delay(4)

WebUI.verifyElementAttributeValue(findTestObject('OrangeHRMPages/OrangeHRM_Claim_OR/submited_staus_value'), 'value', 'Submitted', 
    5)

