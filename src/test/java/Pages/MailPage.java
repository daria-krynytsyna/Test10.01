package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MailPage extends BasePage {

	@FindBy(xpath="//span[@class='user_name']")
	private WebElement textUserName;

	@FindBy(xpath="//a[contains(.,'Создать письмо')]")
	private WebElement BtnCreateMail;

	@FindBy(xpath="//span[contains(.,'Tet')]")
	private WebElement email;


	public String getTextUserName (){
	return textUserName.getText();
	}

	public void createMail (){
	    BtnCreateMail.click();
    }

    public boolean checkInputMails(String subject) {
	    boolean containSubject = false;


           containSubject = email.getText().contains(subject);


        return containSubject;
    }
}


