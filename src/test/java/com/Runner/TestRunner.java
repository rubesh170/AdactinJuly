package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Cucumber.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\com\\feature",
		glue = "com.stepdefinition", 
		dryRun = false, 
		monochrome = false)

public class TestRunner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		//System.out.println("inside setup");
		driver = Base_Class.getBrowser("edge");

	}

	@AfterClass
	public static void tearDown() {
	//	driver = Base_Class.close();

	}

}
