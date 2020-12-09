package lesson3;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Иванов", "Соколов", "Михайлов", "Степанов", "\n" +
                "Павлов", "Лебедев", "Козлов", "Степанов", "Михайлов", "Новиков", "Кузнецов", "Попов", "Алексеев", "Иванов", "Соколов", "Михайлов", "Степанов", "\n" +
                "Павлов", "Лебедев", "Козлов", "Степанов", "Михайлов", "Новиков", "Кузнецов", "Попов", "Алексеев"));
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
        List<String> list2 = new ArrayList(set);

        for (String val : list2) {
        counterOfDuplicat(list, val);
        }
    }
    public static void counterOfDuplicat(List e, String val){
        int count =0;
        Iterator<String> iter = e.iterator();
            while (iter.hasNext()) {
            String str= iter.next();
            if (str.equals(val)) {
                count++;
                iter.remove();
            }

    }
        System.out.println(val +" количество  дубликатов: "+ count);

}

}

