package by.anton.core.lambda;

import java.util.Map;

public class People {
    private String lastName;
    private String firstName;

    public People(Map.Entry<String, String> lName){
        lastName=lName.getKey();
        firstName=lName.getValue();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
