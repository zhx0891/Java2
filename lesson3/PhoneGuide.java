package lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class PhoneGuide {
static ArrayList<PhoneUser> users = new ArrayList<>();
static HashMap<String, Set<String>>hm = new HashMap<>();
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


    searchUsers("Иванов");
    searchNumbers("Иванов");

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
   public static void searchUsers(String nameUser){
       for (int i = 0; i < users.size(); i++) {
           if (users.get(i).name.equals(nameUser)){
               users.get(i).userInfo();
           }
       }

   }

   public static void searchNumbers (String nameUser){
       for (int i = 0; i < users.size(); i++) {
           if()
           hm.put(users.get(i).name, users.get(i).number);
       }
       System.out.println(hm.get(nameUser));
   }

}
