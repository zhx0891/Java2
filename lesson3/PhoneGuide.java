package lesson3;

import java.util.ArrayList;


public class PhoneGuide {
static ArrayList<PhoneUser> users = new ArrayList<>();
    public static void main(String[] args) {
        users.add(new PhoneUser("Иванов", "12374") );
        users.add(new PhoneUser("Петров", "54321") );
        users.add(new PhoneUser("Сидоров", "16789") );
        users.add(new PhoneUser("Рябко", "123456") );
        users.add(new PhoneUser("Акопян", "1234") );
        users.add(new PhoneUser("Селиванов", "54321") );
        users.add(new PhoneUser("Сидоров", "16789") );
        users.add(new PhoneUser("Андриенко", "123456") );
        users.add(new PhoneUser("Иванов", "1234") );
        users.add(new PhoneUser("Петров", "54321") );
        users.add(new PhoneUser("Сидоров", "16789") );
        users.add(new PhoneUser("Иванов", "123456") );


    searchUser("Иванов");

    }




    public static class PhoneUser {
        String name, number;

        public PhoneUser(String name, String number) {
            this.name =name;
            this.number = number;
        }
        void userInfo(){
            System.out.println(this.name+" "+this.number);
        }


    }
   public static void searchUser(String nameUser){
       for (int i = 0; i < users.size(); i++) {
           if (users.get(i).name.equals(nameUser)){
               users.get(i).userInfo();
           }
       }

   }

}
