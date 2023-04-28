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

'Open the apps'
Mobile.startApplication(GlobalVariable.apk, false)

'Tap login on welcome sreen\r\n'
Mobile.tap(findTestObject('Login_Repository/login_or_register_Button'), 0)

Mobile.setText(findTestObject('Login_Repository/Email_input (1)'), 'derryjhon@example.com', 0)

'Tap login on login page'
Mobile.tap(findTestObject('Login_Repository/LogIn_Button'), 0)

'Verify password notification error'
Mobile.verifyElementText(findTestObject('Login_Repository/Verify_error_password_notification'), 'Please enter a password.')

'Verify password requirement notification error'
Mobile.verifyElementText(findTestObject('Login_Repository/Verify_error_password_requirement_notif'), 'Password must be at least 8 characters, and contain both letters and numbers.')

'Delay 3s'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Take screenshot'
Mobile.takeScreenshot('capture\\login_only_inputting_email.png', FailureHandling.STOP_ON_FAILURE)

'Close tha apps'
Mobile.closeApplication()

