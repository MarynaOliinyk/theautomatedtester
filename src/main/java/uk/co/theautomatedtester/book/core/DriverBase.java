package uk.co.theautomatedtester.book.core;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class DriverBase {

    @BeforeClass(description = "Drivers initialization")
    public void setUp() {
        Configuration.reportsFolder = "test-result/reports";
        Configuration.startMaximized = true;
    }

    @BeforeClass(description = "Close browser")
    public static void logout() {
        closeWebDriver();
    }
}
