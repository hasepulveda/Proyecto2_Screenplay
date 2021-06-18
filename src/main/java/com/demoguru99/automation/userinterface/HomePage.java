package com.demoguru99.automation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.guru99.com/test/newtours/index.php")
public class HomePage extends PageObject {
    public static final Target REGISTER = Target.the("Option the register").locatedBy("//a[text()= \"REGISTER\"]");
}
