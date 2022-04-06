package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.UterJoinTodayPage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;


public class JoinToday implements Task {

    private String strFirtsName;
    private String strLastName;
    private String strEmail;
    private String strMoth;
    private String strDay;
    private String strYear;
    private String strPassword;
    private String strRepassword;

    public JoinToday(String strFirtsName, String strLastName, String strEmail, String strMoth,
                     String strDay, String strYear, String strPassword, String strRepassword) {
        this.strFirtsName = strFirtsName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMoth = strMoth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strPassword = strPassword;
        this.strRepassword = strRepassword;
    }

    public static JoinToday onThePage(String strFirtsName, String strLastName, String strEmail, String strMoth,
                                      String strDay, String strYear, String strPassword, String strRepassword) {
        return Tasks.instrumented(JoinToday.class,strFirtsName,strLastName,strEmail,strMoth,strDay,
                                                    strYear,strPassword,strRepassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UterJoinTodayPage.JOINTODAY_BUTOON),
                Enter.theValue(strFirtsName).into(UterJoinTodayPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(UterJoinTodayPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UterJoinTodayPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMoth).from(UterJoinTodayPage.SELECT_MOTH),
                SelectFromOptions.byVisibleText(strDay).from(UterJoinTodayPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(UterJoinTodayPage.SELECT_YEAR),
                Click.on(UterJoinTodayPage.NEXT_LOCATION_BUTTON),
                Click.on(UterJoinTodayPage.NEXT_DEVICES),
                Click.on(UterJoinTodayPage.NEX_LAST_STEP),
                Enter.theValue(strPassword).into(UterJoinTodayPage.INPUT_PASSWORD),
                Enter.theValue(strRepassword).into(UterJoinTodayPage.INPUT_REPASSWORD),
                JavaScriptClick.on(UterJoinTodayPage.CHECK_STAY_INFORMED),
                JavaScriptClick.on(UterJoinTodayPage.CHECK_READ_ACCEPT),
                JavaScriptClick.on(UterJoinTodayPage.CHECK_PRIVACY_SEGURITY),
                Click.on(UterJoinTodayPage.COMPLETE_SETUP_BUTTON)
                );
    }
}
