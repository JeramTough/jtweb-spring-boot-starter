package com.jeramtough.ele;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
public class Editform2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver",
            "/opt/google/chrome/chrome");

    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;



    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void editform2() {
    // Test name: edit_form_2
    // Step # | name | target | value
    // 1 | open | http://106.39.147.114:8085/seeyon/collaboration/collaboration.do?method=newColl&from=templateNewColl&templateId=16262459157460 | 
    driver.get("http://106.39.147.114:8085/seeyon/collaboration/collaboration.do?method=newColl&from=templateNewColl&templateId=16262459157460");
    // 2 | click | id=subject | 
    driver.findElement(By.id("subject")).click();
    // 3 | type | id=subject | 9月份工时录入单(韦洁慧 2020-09-27 16:34)
    driver.findElement(By.id("subject")).sendKeys("9月份工时录入单(韦洁慧 2020-09-27 16:34)");
    // 4 | selectFrame | index=0 | 
    driver.switchTo().frame(0);
    // 5 | click | css=tr:nth-child(4) > td:nth-child(5) | 
    driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(5)")).click();
    // 6 | click | id=field0004_format | 
    driver.findElement(By.id("field0004_format")).click();
    // 7 | type | id=field0004 | 2020-09-27
    driver.findElement(By.id("field0004")).sendKeys("2020-09-27");
    // 8 | click | id=field0022_format | 
    driver.findElement(By.id("field0022_format")).click();
    // 9 | type | id=field0022 | 2020-09-27 18:00
    driver.findElement(By.id("field0022")).sendKeys("2020-09-27 18:00");
    // 10 | click | id=field0023_format | 
    driver.findElement(By.id("field0023_format")).click();
    // 11 | type | id=field0023 | 2020-09-27 18:00
    driver.findElement(By.id("field0023")).sendKeys("2020-09-27 18:00");
    // 12 | selectFrame | relative=parent | 
    driver.switchTo().defaultContent();
    // 13 | click | css=.common_toolbar_box | 
    driver.findElement(By.cssSelector(".common_toolbar_box")).click();
    // 14 | click | id=sendId_span | 
    //driver.findElement(By.id("sendId_span")).click();
    // 15 | runScript | alert("aaa"); | 
    js.executeScript("alert(\"aaa\");");
  }
}
