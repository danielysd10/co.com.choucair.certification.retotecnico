package co.com.choucair.certification.retotecnico.questions;

import co.com.choucair.certification.retotecnico.userinterface.FormUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {

        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);

    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String welcome = Text.of(FormUserPage.CAPTCHA_UTEST).viewedBy(actor).toString();
        if(welcome != null)
        {
            return true;
        }
        else {
            return false;
        }
    }

}
