package TestCases;

import org.testng.annotations.DataProvider;

import TestNGBasics.LearningReadExcel;

public class YatraTestCase {
	@DataProvider(name="TestData")
	public string[][] testData() {
		return LearningReadExcel.readExcelData("place");
	}

}
