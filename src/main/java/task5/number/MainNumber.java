package task5.number;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainNumber {
    public static void main(String[] args) {
        List<Integer> list = Stream.iterate(10, (i) -> i + 10).limit(10).map((i) -> i /= 2)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
