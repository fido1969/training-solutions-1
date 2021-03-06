package week06d02;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.List;

import static week06d02.Category.*;

public class Store {

    private List<Product> productList = new ArrayList<>();

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public int getProductByCategoryName(Category category) {
        int count = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCategory().toString().equals(category.toString())) {
                count++;
            }
        }

        return count;
    }

// Senior csoport feladata

    public int getProductFrozen() {
        int count = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCategory().toString().equals(FROZEN.toString())) {
                count++;
            }
        }

        return count;
    }
    public int getProductDaity() {
        int count = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCategory().toString().equals(DAIRY.toString())) {
                count++;
            }
        }

        return count;
    }

    public int getProductBakedgoods() {
        int count = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCategory() ==  BAKEDGOODS) {
                count++;
            }
        }

        return count;
    }
    public int getProductOther() {
        int count = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCategory().toString().equals(OTHER.toString())) {
                count++;
            }
        }

        return count;
    }


public List<String> getProductsByCategory(){
        List<String> list = new ArrayList<>();
        list.add("Bakedgoods - " + getProductBakedgoods() + " ps(s)");
        list.add("Frozen - " + getProductFrozen() + " ps(s)");
        list.add("Other - " + getProductOther()+ " ps(s)");
        list.add("Daity - " + getProductDaity()+ " ps(s)");
        return list;}



        //Senior csoport második megoldása
    public List<CategoryCounter> getProductsByCategoryLessCopy(){

        List<CategoryCounter> list = new ArrayList<>();

        int g = values().length;

         for (int i = 0; i < g; i++){
         int piecesOfProduct = getProductByCategoryName(Category.values()[i]);
         String typeOfProduct = Category.values()[i].toString();
         CategoryCounter judit = new CategoryCounter(typeOfProduct, piecesOfProduct);
         list.add(judit);
         }




        return list;}

}











