package uk.co.theautomatedtester.book;

import org.testng.annotations.Test;
import uk.co.theautomatedtester.book.core.DriverBase;
import uk.co.theautomatedtester.book.pages.Chapter1Page;
import uk.co.theautomatedtester.book.pages.HomePage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.testng.Assert.assertEquals;
import static uk.co.theautomatedtester.book.core.TestData.Chapter1Page.CHAPTER_1_PAGE_CHECKING_TEXT;
import static uk.co.theautomatedtester.book.core.TestData.Chapter1Page.CHAPTER_1_PAGE_HOME_PAGE_TEXT;
import static uk.co.theautomatedtester.book.core.TestData.General.BASE_URL;
import static uk.co.theautomatedtester.book.core.TestData.HomePage.HOME_PAGE_LINK_TEXT;

public class CheckTextOnThePageAndReturnToHomePageTest extends DriverBase {

    @Test(description = "Open http://book.theautomatedtester.co.uk/, click \"Chapter1\" and check text \"Assert that this text is on the page\" on the page. " +
            "Click on the \"Home Page\" link check that it is redirected")
    public void checkTextOnThePageAndReturnToHomePageTest() {
        HomePage homePage = new HomePage();
        Chapter1Page chapter1Page = new Chapter1Page();
        open(BASE_URL);
        assertEquals(BASE_URL, url());
        homePage.getChapter1Link().shouldBe(visible, exactTextCaseSensitive(HOME_PAGE_LINK_TEXT)).click();
        chapter1Page.getCheckingText().shouldHave(exactTextCaseSensitive(CHAPTER_1_PAGE_CHECKING_TEXT));
        chapter1Page.getHomePageLink().shouldHave(textCaseSensitive(CHAPTER_1_PAGE_HOME_PAGE_TEXT)).click();
        assertEquals(BASE_URL, url());
    }
}
