package uk.co.theautomatedtester.book.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

@Getter
public class Chapter1Page {
    private SelenideElement checkingText = $(byId("divontheleft")),
            homePageLink = $(byAttribute("href", "/"));
}
