package Lesson10.Dishes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DishRunner {

    public static void main(String[] args) {

        List<Dish> menu = Dish.menu;
        menu.stream()
                .filter(d -> d.getCalories() > 300)
                .filter(Dish::isVegetarian)
                .forEach(System.out::println);
        System.out.println();

        menu.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .limit(2)
                .forEach(System.out::println);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        numbers.stream()
                .map(number -> number * number)
                .forEach(System.out::println);

        Optional<Integer> calori = menu.stream()
                .map(dish -> dish.getCalories())
                .reduce((d1, d2) -> d1 > d2
                        ? d1
                        : d2);
        System.out.println(calori);

        Optional<Integer> count = menu.stream()
                .map(dish -> 1)
                .reduce((n1, n2) -> n1 + n2);
        System.out.println(count);
    }
}
