package Tests;

import Pages.CreatePage;
import Pages.MailPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailTest extends BaseTest {
    @Test(priority = 0)
    public void testEmail() throws Exception {

        app.login.loginValidUser();
        String userName = app.mail.getTextUserName();
        Assert.assertEquals(userName, "Daria", "Incorrect");

    }

    /*@Test(priority = 1)
    public void testCreateEmail() throws Exception {
        app.mail.createMail();
        app.create.sendMail("daria.krynytsyna@i.ua", "Tet", "This is test e-mail");
        Assert.assertTrue(app.mail.checkInputMails("Tet"));

    }*/
}
