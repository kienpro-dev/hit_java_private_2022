import java.util.*;
import java.util.stream.*;

public class App {
    public static void main(String[] args) {

        IntStream.range(1, 5).forEach(i -> System.out.print(i + " "));
        LongStream.range(1, 10).filter(i -> i % 2 != 0).forEach(i -> System.out.print(i + " "));

        String[] lang = { "Java", "C++", "Python" };
        Stream<String> stream = Arrays.stream(lang);
        stream.filter(s -> s.contains("a")).forEach(i -> System.out.print(i + " "));

        Stream<String> stream2 = Stream.of("a", "b", "c", "d", "e", "f");
        List<String> str = stream2.collect(Collectors.toList());
        str.forEach(i -> System.out.println(i + " "));

        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        l.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " "));

        List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        // l2.stream().limit(5).forEach(i->System.out.print(i+" "));
        // l2.stream().limit(5).forEach(i->System.out.print(i+" "));
        // l2.stream().skip(1).limit(2).forEach(i->System.out.print(i+" "));
        // l2.stream().map(i -> i * 2).forEach(i -> System.out.println(i));
        // l2.stream().sorted().forEach(i->System.out.println(i));
        l2.stream().sorted((a, b) -> b - a).forEach(i -> System.out.println(i));
    }
}
