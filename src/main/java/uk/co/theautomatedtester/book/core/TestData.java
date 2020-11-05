package uk.co.theautomatedtester.book.core;

import static uk.co.theautomatedtester.book.utils.PropertiesCache.getProperty;

public class TestData {

    public static class General {
        public static final String BASE_URL = getProperty("base.url");
    }

    public static class HomePage {
        public static final String HOME_PAGE_LINK_TEXT = getProperty("home.page.link.text");
    }

    public static class Chapter1Page {
        public static final String CHAPTER_1_PAGE_CHECKING_TEXT = getProperty("chapter1.page.checking.text"),
                CHAPTER_1_PAGE_HOME_PAGE_TEXT = getProperty("chapter1.page.home.page.text");
    }
}