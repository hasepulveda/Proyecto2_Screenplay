package com.demoguru99.automation.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class enterThe implements Task {

    private Target optionField;

    public enterThe(Target optionField){
        this.optionField = optionField;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(optionField));


    }

    public static enterThe option(Target optionField) {
        return instrumented(enterThe.class, optionField);
    }
}
