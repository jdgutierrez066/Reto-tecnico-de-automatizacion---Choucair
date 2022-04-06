package co.com.choucair.certification.proyectobase.model;

public class UtestData {
    private String strFirtsName;
    private String strLastName;
    private String strEmail;
    private String strMoth;
    private String strDay;
    private String strYear;
    private String strPassword;
    private String strRepassword;
    private String question;

    public UtestData(String strFirtsName, String strLastName, String strEmail, String strMoth,
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

    public String getStrFirtsName() {
        return strFirtsName;
    }

    public void setStrFirtsName(String strFirtsName) {
        this.strFirtsName = strFirtsName;
    }

    public String getStrLastName() {
        return strLastName;
    }

    public void setStrLastName(String strLastName) {
        this.strLastName = strLastName;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public String getStrMoth() {
        return strMoth;
    }

    public void setStrMoth(String strMoth) {
        this.strMoth = strMoth;
    }

    public String getStrDay() {
        return strDay;
    }

    public void setStrDay(String strDay) {
        this.strDay = strDay;
    }

    public String getStrYear() {
        return strYear;
    }

    public void setStrYear(String strYear) {
        this.strYear = strYear;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String getStrRepassword() {
        return strRepassword;
    }

    public void setStrRepassword(String strRepassword) {
        this.strRepassword = strRepassword;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
