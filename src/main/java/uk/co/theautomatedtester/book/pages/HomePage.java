package uk.co.theautomatedtester.book.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;

@Getter
public class HomePage {
    private SelenideElement chapter1Link = $(byAttribute("href", "/chapter1"));
}
