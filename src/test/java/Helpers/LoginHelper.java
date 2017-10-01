package Helpers;

import Pages.LoginPage;
import Utils.User;
import Utils.UserFactory;

public class LoginHelper extends LoginPage {

public void login (User user){
   login (user.getName(),user.getPassword());

}

    public void loginValidUser (){
        User user = UserFactory.getValidUser();
        login (user.getName(),user.getPassword());
    }

    public void loginInvalidUser (){
        User user = UserFactory.getInvalidUser();
        login (user.getName(),user.getPassword());
    }
}
