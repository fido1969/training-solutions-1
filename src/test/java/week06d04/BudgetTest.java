package week06d04;

import org.junit.jupiter.api.Test;
import week06d03.WordEraser;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BudgetTest {


    @Test
    public void wordEraser() {


        Item item = new Item (12, 1, "Alma");
        Item item2 = new Item (12, 2, "Alma");
        Item item3 = new Item (12, 3, "Alma");
        Item item4 = new Item (12, 4, "Alma");
        Item item5 = new Item (12, 5, "Alma");

        List<Item> list = new ArrayList<>();
        list.add(item);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        list.add(item5);
        list.add(item5);
        list.add(item5);


        Budget budget = new Budget(list);

        assertEquals(1, budget.getItemsByMonth(1).size());


    }


}
