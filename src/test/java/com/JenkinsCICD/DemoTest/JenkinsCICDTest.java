package com.JenkinsCICD.DemoTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsCICDTest {
	
	@Test(priority = 0)
	public void PracticeAutomation() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		String BrowserTitle = driver.getTitle();
		System.out.println(BrowserTitle);
		
		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);
		
		driver.quit();
		}
		
	@Test(priority = 1)
	public void DemoBlaze() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		String demoBrowserTitle = driver.getTitle();
		System.out.println(demoBrowserTitle);
		
		String demoBrowserURL = driver.getCurrentUrl();
		System.out.println(demoBrowserURL);
		
		driver.quit();
	}
		
	@Test(priority = 2)	
	public void LeetCode() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leetcode.com/");
		driver.manage().window().maximize();
		
		String altoroBrowserURL = driver.getCurrentUrl();
		System.out.println(altoroBrowserURL);
		
		String altoroBrowserTitle = driver.getTitle();
		System.out.println(altoroBrowserTitle);
		
		driver.quit();
		}
		
	@Test(priority = 3)
	public void Amazon() throws Exception {
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		String amazonBrowserURL = driver.getCurrentUrl();
		System.out.println(amazonBrowserURL);
		
		String amazonBrowserTitle = driver.getTitle();
		System.out.println(amazonBrowserTitle);
		
		driver.quit();
	}
	
	@Test(priority = 4)
	public void Flipkart() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		String flipBrowserURL = driver.getCurrentUrl();
		System.out.println(flipBrowserURL);
		
		String flipBrowserTitle = driver.getTitle();
		System.out.println(flipBrowserTitle);
		
		driver.quit();
		}
		
	@Test(priority = 5)
	public void Myntra() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		String myntraBrowserURL = driver.getCurrentUrl();
		System.out.println(myntraBrowserURL);
		
		String myntraBrowserTitle = driver.getTitle();
		System.out.println(myntraBrowserTitle);
		
		driver.quit();
		}
	
	@Test(priority = 6)
	public void Ajio() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		
		String ajioBrowserURL = driver.getCurrentUrl();
		System.out.println(ajioBrowserURL);
		
		String ajioBrowserTitle = driver.getTitle();
		System.out.println(ajioBrowserTitle);
		
		driver.quit(); 
		} 
	
	@Test(priority = 7)
	public void Linkedin() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/feed/");
		driver.manage().window().maximize();
		
		String LinkedinBrowserURL = driver.getCurrentUrl();
		System.out.println(LinkedinBrowserURL);
		
		String LinkedinBrowserTitle = driver.getTitle();
		System.out.println(LinkedinBrowserTitle);
		
		driver.quit();
		} 
	
	@Test(priority = 8)
	public void Instagram() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		String AllureBrowserURL = driver.getCurrentUrl();
		System.out.println(AllureBrowserURL);
		
		String AllureBrowserTitle = driver.getTitle();
		System.out.println(AllureBrowserTitle);
		
		driver.quit();
		}
	
	@Test(priority = 9)
	public void GitHub() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.manage().window().maximize();
		
		String GitBrowserURL = driver.getCurrentUrl();
		System.out.println(GitBrowserURL);
		
		String GitBrowserTitle = driver.getTitle();
		System.out.println(GitBrowserTitle);
		
		driver.quit();
		} 
	
	
	
	
}