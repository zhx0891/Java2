package lesson3;

import java.util.*;

public class Main {


    public static void main(String[] args) {
//        HashMap<String, String> hm = new HashMap<>();
//
//        hm.put("Russia", "Moscow");
//        hm.put("France", "Paris");
//        hm.put("Germany", "Berlin");
//        hm.put("Norway", "Oslo");
//
//        for (Map.Entry<String, String> o : hm.entrySet()) {
//            System.out.println(o.getKey() + ": " + o.getValue());
//        }
//        hm.put("Germany", "Berlin2");
//        System.out.println("New Germany Entry: " + hm.get("Germany"));
//        List<String> list = new ArrayList<>();
//        Iterator<String> iter = list.iterator();
//    }

        List<String> list = new ArrayList<>(Arrays.asList("Иванов", "Соколов", "Михайлов", "Степанов", "\n" +
                "Павлов", "Лебедев", "Козлов", "Степанов", "Михайлов", "Новиков","Кузнецов","Попов", "Алексеев", "Иванов", "Соколов", "Михайлов", "Степанов", "\n" +
                "Павлов", "Лебедев", "Козлов", "Степанов", "Михайлов", "Новиков","Кузнецов","Попов", "Алексеев"));
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
        List<String> list2 = new ArrayList<>(Collection set);
        counterOfDuplicat(list);


    }
    public static void counterOfDuplicat(List e){
//        Iterator<String> iter = e.iterator();
//        int counter =0;
        for (int i = 0; i < e.size(); i++) {
            System.out.println(e.get(i));

        }

//            while (iter.hasNext()) {
//            String str= iter.next();
//            if (str.equals(val) {
//                counter++;
//                iter.remove();
//        }

    }

}

