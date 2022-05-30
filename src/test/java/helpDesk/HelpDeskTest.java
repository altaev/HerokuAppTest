package helpDesk;

import core.BaseSeleniumTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static helpers.StringModifier.getUniqueString;
import static helpers.TestValues.*;
/*
*   MAIN TEST CLASS
 */
public class HelpDeskTest extends BaseSeleniumTest {
    @Test
    public void checkTicket(){
        String title = getUniqueString(TEST_TITLE);
/*
* CREATE CHAIN OF ACTIONS ON DIFFERENT PAGES:
* 1. CREATE NEW TICKET
* 2. AUTH WITH LOGIN FORM
* 3. SEARCH FOR NEW TICKET:
* 3.1. CLICK TO TICKET ON SEARCH RESULT
* 4. VERIFY TICKET FIELDS
 */
        TicketPage ticketPage = new MainPage().createTicket(title, TEST_BODY, TEST_EMAIL)
                .openLoginPage()
                .auth(TEST_LOGIN, TEST_PASSWORD)
                .findTicket(title);
        //4.
        Assert.assertTrue(TicketPage.getTitle().contains(title));
        Assert.assertEquals(TicketPage.getBody(), TEST_BODY);
        Assert.assertEquals(TicketPage.getEmail(), TEST_EMAIL);
    }
}
