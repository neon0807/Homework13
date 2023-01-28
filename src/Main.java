import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Задача №1

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(9);
        arr.add(3);
        arr.add(6);
        arr.add(8);

        Integer min = arr.stream().min(Integer::compareTo).get();
        Integer max = arr.stream().max(Integer::compareTo).get();

        BiConsumer<Integer, Integer> minMaxConsumer = new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer integer, Integer integer2) {
            }
        };

        minMaxConsumer.accept(min, max);

        //Задача №2

        Predicate<Integer> evenNum = integer -> {
            if (integer % 2 == 0) {
                return true;
            }
            return false;
        };

        Integer count = Math.toIntExact(arr.stream().filter(evenNum).count());
        System.out.println("Коллличество четных чисел - " + count);
        List<Integer> even = arr.stream().filter(evenNum).collect(Collectors.toList());
        System.out.println(even);



    }


}