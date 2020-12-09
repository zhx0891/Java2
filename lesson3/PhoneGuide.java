package lesson3;

import java.util.ArrayList;

public class PhoneGuide {

    public static void main(String[] args) {
        ArrayList<PhoneUser> users = new ArrayList<>();
        users.add(new PhoneUser("Иванов", "1234") );
    }




    public static class PhoneUser {
        String name, number;

        public PhoneUser(String name, String number) {
            this.name =name;
            this.number = number;
        }


    }

}
