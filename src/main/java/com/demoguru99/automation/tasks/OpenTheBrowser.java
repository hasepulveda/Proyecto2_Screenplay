package com.demoguru99.automation.tasks;

import com.demoguru99.automation.userinterface.HomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Task {

    private PageObject page;

    public OpenTheBrowser(PageObject page){
        this.page=page;
    }

    @Override
    @Step("{0} opens the browser on Home Page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
    }

    public static OpenTheBrowser on(PageObject page) {
        return instrumented(OpenTheBrowser.class, page);
    }
}
