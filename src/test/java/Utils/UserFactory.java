package Utils;

import java.util.ResourceBundle;


public class UserFactory {
    static ResourceBundle resource;
    static {
        resource = ResourceBundle.getBundle("user");
    }


    public static User getValidUser(){
       return new User(resource.getString("valid.name"),resource.getString("valid.password"));
    }

    public static User getInvalidUser(){
        return new User(resource.getString("invalid.name"),resource.getString("invalid.password"));
    }
}
