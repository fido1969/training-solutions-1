package week08d02;

import java.util.*;

public class Lottery {

    public static int randomNumber(int interval) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(interval);
        return randomNumber;
    }

   public static List<Integer> getNumbers(int interval, int numberOfInteger) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numberOfInteger; i++) {
            int s = randomNumber(interval)+1;
        if (!(list.contains(s))){list.add(s);}else{numberOfInteger++;}

        }
       Collections.sort(list);
        return list;
    }











    }






