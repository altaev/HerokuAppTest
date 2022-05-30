package helpDesk;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Struct;

public class TicketPage extends BaseSeleniumPage {
    @FindBy(xpath="//th[text()='Submitter E-Mail']/following::td[1]")
    private static WebElement mail;

    @FindBy(xpath="//h3")
    private static WebElement title;

    @FindBy(xpath="//td[@id='ticket-description']//p")
    private static WebElement body;
/*
* GET PAGE ELEMENTS
 */
    public TicketPage() {
        PageFactory.initElements(driver, this);
    }

    public static String getEmail(){
        return mail.getText();
    }

    public static String getTitle(){
        return title.getText();
    }

    public static String getBody(){
        return body.getText();
    }
}
