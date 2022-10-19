package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> result = new ArrayList<>();
        if (numberOfDishes == 0) return result;

        ArrayList<Integer> dishArray = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {              // 4 10
            dishArray.add(i);                               // 0  1
        }


        int indexToEat = everyDishNumberToEat - 1; // 10 2 9 4 8 6 7 1 6 3 5 0 4 2 3 1 2 1 1 0
        while (dishArray.size() > 0) {             //    3   6   9   2   7   1   8   5   10  4
            result.add(dishArray.get(indexToEat));
            dishArray.remove(indexToEat);
            indexToEat += everyDishNumberToEat - 1;

            if (indexToEat >= dishArray.size()) {
                if (dishArray.size() == 1) {
                    indexToEat = 0;
                } else {
                    indexToEat = indexToEat - dishArray.size();
                }
            }
        }

        return result;
    }
}
