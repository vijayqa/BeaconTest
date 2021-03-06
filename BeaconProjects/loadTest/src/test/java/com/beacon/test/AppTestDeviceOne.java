package com.beacon.test;
import static org.testng.Assert.expectThrows;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.*;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.ios.IOSDriver;
import io.qameta.allure.Epic;
import ru.yandex.qatools.allure.model.SeverityLevel;
//import io.qameta.allure.junit4.DisplayName;
import ru.yandex.qatools.allure.annotations.*;
//@Listeners(com.test.CustomReport.class)
 //@Listeners({ITestListener.class})
 @Epic("Load Testing")

//@Test(invocationCount = 2)
public class AppTestDeviceOne {
  private IOSDriver driver=null;
 // private AppiumDriverLocalService service;
  static int n=0;
  @BeforeSuite(alwaysRun=true)
 // @Parameters({"wda"})
  public void setUp() throws MalformedURLException, InterruptedException {
	 // service = new AppiumServiceBuilder().usingPort(Integer.valueOf(4723)).build();
	 // service.start();
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("browserName", "iOS");
    desiredCapabilities.setCapability("deviceName", "iPhone");
    desiredCapabilities.setCapability("platformName", "iOS");
    desiredCapabilities.setCapability("platformVersion", "11.4");
    desiredCapabilities.setCapability("automationName", "XCUITest");
   // desiredCapabilities.setCapability("udid", "fcfb9ab25dbf05bd06e51194ae9aa2a82ec5b2da");
   desiredCapabilities.setCapability("udid", "5bebcfa8e9b85198945951f55c6225ad44bda458");
   // desiredCapabilities.setCapability("udid", "3dac19a7cdb3dc26b3607450c6f97a5a1dfeda77" );
    desiredCapabilities.setCapability("app", "/Users/basavaraj/Desktop/Beacon.ipa");
    desiredCapabilities.setCapability("xcodeOrgId", "G56QYJ7ZRJ");
    desiredCapabilities.setCapability("xcodeSigningId", "iPhone Developer");
    desiredCapabilities.setCapability("noReset", true);
    desiredCapabilities.setCapability("wdaLaunchTimeout",240000);
    desiredCapabilities.setCapability("wdaConnectionTimeout",240000);
    desiredCapabilities.setCapability("usePrebuiltWDA",true);
    //desiredCapabilities.setCapability("wdaLocalPort", 6000);
    //desiredCapabilities.setCapability("newCommandTimeout", 50560);
   // desiredCapabilities.setCapability("printPageSourceOnFindFailure", true);
     // desiredCapabilities.setCapability("showIOSLog", true);
   //desiredCapabilities.setCapability("launchTimeout", 1290000);
   // desiredCapabilities.setCapability("updatedWDABundleId","com.facebook.wda.lib");

  // desiredCapabilities.setCapability("webDriverAgentUrl", WDAServer.SERVER_URL);

  //  chromeOptions.addArguments("--ignore-certifcate-errors");
    URL remoteUrl = new URL("http://0.0.0.0:4723/wd/hub");
    driver = new IOSDriver(remoteUrl, desiredCapabilities);
    driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
   // Thread.sleep(5000);
    
  }

  /*	@Test(priority = 4, invocationCount = 2)
  	@Severity(SeverityLevel.BLOCKER)
	  @Stories("Region Selection")
	  @Description("Region Selection")
  	 public void region_Selection(){
  		try {
	  MobileElement SelectRegion = (MobileElement) driver.findElementByAccessibilityId("Regions");
	  SelectRegion.click();
	  String Regions = randomRegions();
	  MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId(Regions);
	  el3.click();
	  logToReport("Clicked on region " +Regions);
	  if(driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"Select\"]").size()!=0) {
		  String Message = "Region selection failed";
		  saveScreenshotPNG(driver);
		  Assert.fail(Message);
	  }
  	}
  	
  	catch(Exception e) {
		 saveScreenshotPNG(driver);
			e.printStackTrace();
			String Message = "Region selection failed";
			  driver.launchApp();
			  driver.resetApp(); 
			  Assert.fail(Message, e);
		}
  	}*/
	  @Test(priority = 5, invocationCount = 50)
	  @Severity(SeverityLevel.CRITICAL)
	  @Stories("Add Incident Report")
	  @Description("Add Incident Report")
	   public void add_Incident_Report() throws InterruptedException {
	 	 try {
	
	 MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Add");
	  el1.click();
	// MobileElement ScrollView = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Beacon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeOther");
	// String parentID = ScrollView.getId();
	 MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Select Priority Level");
	  el4.click();
	  MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Priority Level 2");
    /* JavascriptExecutor js1 = (JavascriptExecutor) driver;
     HashMap<String, String> scrollObject1 = new HashMap<String, String>();
    scrollObject1.put("element", parentID);
     scrollObject1.put("direction", "down");
     scrollObject1.put("name", "Priority Level 2");
     js1.executeScript("mobile: scroll", scrollObject1);*/
	  el5.click();
	  MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Done");
	  el6.click();
	  Thread.sleep(1000);
	  MobileElement ell2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Beacon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
	 String Regions = randomRegions();
	  ell2.sendKeys(Regions);
	  logToReport("Location searched is "+Regions);
	 Thread.sleep(2000);
	  MobileElement ell3 = (MobileElement) driver.findElementByAccessibilityId("1");
	  //driver.hideKeyboard();
	  ell3.click();
	  ell3.click();
	  
	  MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("iconMaintenance");
	  el7.click();
	  logToReport("Clicked on Maintainance");
	  Thread.sleep(1000);
	  MobileElement AerialCoax = (MobileElement) driver.findElementByAccessibilityId("Aerial coax construction composite (Coax Only)");
	  AerialCoax.click();
	  /*Dimension dimension = driver.manage().window().getSize();
	  PointOption p = new PointOption();
	   System.out.println(dimension);
	       int s = (int) (dimension.getHeight() * 0.8);
	       System.out.println(s);
	       int end = (int) (dimension.getHeight() * 0.1);
	       System.out.println(end);
	       int x = (int) (dimension.getWidth()*.5);
	       System.out.println(x);
	  t1.press(115, 650).waitAction(ofSeconds(1)).moveTo(115, 350).release().perform();
	 t1.press(point(x,s)).moveTo(x, end).waitAction(2000).release().perform();
	      new TouchAction(driver).press(point(x, s)).
         moveTo(point(x, end)).release().perform();
	      Thread.sleep(3000);*/
	       JavascriptExecutor js = (JavascriptExecutor) driver;
	       HashMap<String, String> scrollObject = new HashMap<String, String>();
	       scrollObject.put("direction", "down");
	       scrollObject.put("name", "ADD TO CART");
	       js.executeScript("mobile: scroll", scrollObject);
	  MobileElement AddToCart = (MobileElement) driver.findElementByAccessibilityId("ADD TO CART");
	  AddToCart.click();
	  MobileElement el19 = (MobileElement) driver.findElementByAccessibilityId("SAVE CART");
	  el19.click();
	  logToReport("Clicked on SAVE CART");
	//  Thread.sleep(1000);
	  MobileElement AddPhoto = (MobileElement) driver.findElementByAccessibilityId("addPhoto");
	  AddPhoto.click();
	  logToReport("Clicked on Add Photo");
	  MobileElement TakePhoto = (MobileElement) driver.findElementByAccessibilityId("Take Photo or Video");
	  TakePhoto.click();
	 // MobileElement TakePhoto = (MobileElement) driver.findElementByAccessibilityId("Photo Library");
	 // TakePhoto.click();
	 // MobileElement SelectPhoto = (MobileElement) driver.findElementByXPath("MobileElement TakePhoto = (MobileElement) driver.findElementByAccessibilityId(\"Photo Library\");");
	// SelectPhoto.click();
	// MobileElement Add = (MobileElement) driver.findElementByAccessibilityId("ADD");
	//  Add.click();
	  // Thread.sleep(2000);
	 MobileElement PhotoCapture = (MobileElement) driver.findElementByAccessibilityId("PhotoCapture");
	 PhotoCapture.click();
	Thread.sleep(4000);
	logToReport("Clicked on PhotoCapture");
	 MobileElement UsePhoto = (MobileElement) driver.findElementByAccessibilityId("Use Photo");
	  UsePhoto.click();
	  Thread.sleep(1000);
	  logToReport("Clicked on Use Photo");
	/*  JavascriptExecutor js2 = (JavascriptExecutor) driver;
      HashMap<String, String> scrollObject2 = new HashMap<String, String>();
     // scrollObject2.put("element", parentID);
      scrollObject2.put("direction", "up");
      scrollObject2.put("name", "SUBMIT");
      js2.executeScript("mobile: scroll", scrollObject2);*/
     MobileElement submit = (MobileElement) driver.findElementByAccessibilityId("SUBMIT");
     Thread.sleep(1000);
	 submit.click();
	 logToReport("Clicked on SUBMIT");
	 MobileElement Close = (MobileElement) driver.findElementByAccessibilityId("Close");
	  Close.click();
	  System.out.println("Report created successfully");
	/*  MobileElement cancel = (MobileElement) driver.findElementByAccessibilityId("Cancel");
	  cancel.click();
	 MobileElement yes = (MobileElement) driver.findElementByAccessibilityId("Yes");
	  yes.click();*/
	  Thread.sleep(3000);
	 }
	 catch(Exception e) {
		// saveScreenshotPNG(driver);
			String Message = "Unable to create report";
			  driver.resetApp(); 
			  e.printStackTrace();
			 // driver.closeApp();
			// driver.launchApp(); 
			  Assert.fail(Message, e);
		}
  }
	  
  public String randomRegions() {
	  final String[] regions = {"Atlanta", "Beltway", "Bigsouth", "California","Chicago","Florida","Freedom","Heartland","Houston","Keystone","Mountainwest","Oregon","Seattle","West"};
	  Random random = new Random();
	  int index = random.nextInt(regions.length);
	  //System.out.println("Region Type selected is "+ regions[index]);
	  return regions[index];
	  }
  
  @Attachment(value = "Page screenshot", type = "image/png")
  private byte[] saveScreenshotPNG(IOSDriver driver) {
      return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
  }
  @Step("{0}") 
  public void logToReport(String message) {
      System.out.println(message);
  }
  
  /*
  @Test(priority = 3, invocationCount = 2)
  @Description("User Profile Selection")
  @Stories("User Profile Selection")
  @Severity(SeverityLevel.MINOR)
  public void user_profile_selection_Device1() throws InterruptedException
  {
	  try {
	  MobileElement menu = (MobileElement) driver.findElementByAccessibilityId("3dotmenu");
	  menu.click();
	  MobileElement UserProfiles = (MobileElement) driver.findElementByAccessibilityId("User Profiles");
	  UserProfiles.click();
	//  scrollKeys(driver, new String[]{"Construction"});
 // public void scrollKeys(IOSdriver driver, String[] list) {
   //   System.out.println("Starting the process");
      //for (int i = 1; i <=list.length; i++) {
    	  MobileElement profile = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Beacon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypePicker/XCUIElementTypePickerWheel");
          profile.sendKeys(randomUserProfiles());
         // saveScreenshotPNG(driver);
          MobileElement Done = (MobileElement) driver.findElementByAccessibilityId("Done");
    	  Done.click();
    //  }
   //   System.out.println("Ending Process");
 // }
	 }
	  catch(Exception e) {
		  saveScreenshotPNG(driver);
			e.printStackTrace();
			String Message = "Unable to select the profile";
			driver.closeApp();
			  driver.launchApp();
			  Assert.fail(Message, e);
		}
  }
  
  public String randomUserProfiles() {
	  final String[] userProfiles = {"Default", "Fiber Technician", "Coaxial Technician", "Construction"};
	  Random random = new Random();
	  int index = random.nextInt(userProfiles.length);
	  System.out.println("Profile Type selected is "+ userProfiles[index]);
	  return userProfiles[index];
	  }
  
  @Test(priority = 2, invocationCount = 2)
  @Description("Layer Filter")
  @Stories("Layer Filter")
  @Severity(SeverityLevel.MINOR)
  public void layer_Filter_Device1() throws InterruptedException
  {
	  try {
	  MobileElement menu = (MobileElement) driver.findElementByAccessibilityId("3dotmenu");
	  menu.click();
	  MobileElement  Layers = (MobileElement) driver.findElementByAccessibilityId("Layers");
	  Layers.click();
	  MobileElement DisasterIncidentLayer = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeSwitch[@name=\"Disaster Incident\"])[1]");
	  DisasterIncidentLayer.click();
	  MobileElement Save = (MobileElement) driver.findElementByName("Save");
	  Save.click();
	  MobileElement  Yes = (MobileElement) driver.findElementByAccessibilityId("YES");
	  Yes.click();
  }
	  catch(Exception e) {
		  saveScreenshotPNG(driver);
			e.printStackTrace();
			String Message = "Unable to Apply Layer Filter";
			driver.closeApp();
			  driver.launchApp();
			  Assert.fail(Message, e);
		}
  }
  
  
  @Test(priority = 1, invocationCount = 2)
  @Stories("Search feature")
  @Severity(SeverityLevel.NORMAL)
  @Description("Search feature")
  public void search_Feature_Device1() throws InterruptedException
  {
	  try {
	  MobileElement OpenSearch = (MobileElement) driver.findElementByAccessibilityId("SearchButton");
	  OpenSearch.click();
	  MobileElement  AddressSearch = (MobileElement) driver.findElementByAccessibilityId("Address Search");
	  AddressSearch.click();
	  MobileElement TypeSearch = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Beacon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSearchField");
	  TypeSearch.sendKeys(randomString(1));
	  Thread.sleep(1000);
	  driver.getKeyboard();
	  driver.hideKeyboard("OK");
	  driver.hideKeyboard("DONE");
	  MobileElement  SearchButton = (MobileElement) driver.findElementByAccessibilityId("Search");
	  SearchButton.click();
	  WebDriverWait wait = new WebDriverWait(driver, 15);
	  wait.until(ExpectedConditions.elementToBeClickable(By.name("SearchButton")));
	  }
	  catch(Exception e) {
		  saveScreenshotPNG(driver);
			e.printStackTrace();
			String Message = "Unable to search the given place";
			driver.closeApp();
			  driver.launchApp();
			  Assert.fail(Message, e);
		}
	  
  }
  static final String AB = "abcdefghijklmnopqrstuvwxyz";
	 static SecureRandom rnd = new SecureRandom();

	  String randomString( int len ){
	     StringBuilder sb = new StringBuilder( len );
	     for( int i = 0; i < len; i++ ) 
	       sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
	     return sb.toString();
	  }  
@Test(priority = 0, invocationCount = 3)
//@Title("Select Map Type")
@Description("Select Map Type")
@Stories("Select Random Map Type")
@Severity(SeverityLevel.CRITICAL)
public void select_Map_Type_Device1()
{
	try{
	MobileElement map = (MobileElement) driver.findElementByAccessibilityId("map");
    map.click();
    MobileElement SelectMapType = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Beacon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypePicker/XCUIElementTypePickerWheel");
    SelectMapType.sendKeys(randomMapType());
    //saveScreenshotPNG(driver);
    MobileElement Done = (MobileElement) driver.findElementByAccessibilityId("Done");
    Done.click();
    
}

catch(Exception e) {
	  saveScreenshotPNG(driver);
		e.printStackTrace();
		String Message = "Unable to select the map type";
		driver.closeApp();
		  driver.launchApp();
		  Assert.fail(Message, e);
	}
}



public String randomMapType() {
final String[] SelectMap = {"Street", "Topographic", "Imagery", "Imagery Hybrid"};
Random random = new Random();
int index = random.nextInt(SelectMap.length);
System.out.println("Map Type selected is "+ SelectMap[index]);
return SelectMap[index];
}

@Attachment(value = "{0}", type = "text/plain")
private static String saveTextLog(String message) {
    return message;
}
 
@Attachment(value = "{0}", type = "text/html")
public static String attachHtml(String html) {
    return html;
}
 */

  @AfterSuite(alwaysRun=true)
  public void tearDown() {
	  if(driver!=null)
   driver.quit();
	//  if(service!=null)
	//	  service.stop();
  }
}
