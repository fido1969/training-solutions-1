package week02d05;

import java.util.ArrayList;
import java.util.List;

public class Languages {
    public static void main(String[] args) {
        List<String> lista  = new ArrayList<>();


        lista.add("Java");
        lista.add("Python");
        lista.add("JavaScript");


        for (String alma : lista) {
            if (alma.length() > 5) {
    System.out.println(alma);
}
        }




    }



}
