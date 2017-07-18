package Appium;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeMethod;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;

public class NewTestAndroid {
	private AppiumDriver driver;

  @Test
  public void f() {
	  WebElement element = null;
		//获取1
		  element=driver.findElementById("com.android.calculator2:id/digit1");
		  element.click();
		  //获取+
		  driver.findElementById("com.android.calculator2:id/plus").click();
		  //获取2
		  driver.findElementById("com.android.calculator2:id/digit2").click();
		  //获取=
		  driver.findElementById("com.android.calculator2:id/equal").click();
		  //获取结果
		  String result = driver.findElementByClassName("android.widget.EditText").getText();
		  System.out.println("The result is" + result);
  }//testing GitHub输出结果
  @BeforeMethod
  public void calc() throws Exception {
	  	final DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "BY3AME158B006896");//虚拟机的设备名
		capabilities.setCapability("platformVersion", "4.4.2");//版本
		capabilities.setCapability("platformName", "Android");//测试平台
		capabilities.setCapability("appPackage", "com.android.calculator2");//包名
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");//打开APP的activity
		//driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);//Appium地址

		System.out.println("App is launched!");//设置输出，判断安装运行APP是否成功
	}
//  public void beforeMethod() {
//  }

  @AfterMethod
  public void afterMethod() {
  }

}
