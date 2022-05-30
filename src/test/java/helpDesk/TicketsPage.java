package helpDesk;

import core.BaseSeleniumPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketsPage extends BaseSeleniumPage {

    @FindBy(id = "search_query")
    private WebElement searchField;

    @FindBy(xpath = "//div[@class='tickettitle']")
    protected WebElement ticket;

    public TicketsPage() {
        PageFactory.initElements(driver, this);
    }

    public TicketPage findTicket(String str){
        //SEARCH FOR NEWLY CREATED TICKET
        searchField.sendKeys(str, Keys.ENTER);

        //CLICK ON SEARCH RESULT
        ticket.click();
        return new TicketPage();
    }
}
