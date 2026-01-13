package lambdatests;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
//        Stream.generate(new Random()::nextDouble).limit(10).forEach((x) -> System.out.println(x));
//        Stream.generate(new Supplier<Integer>() {
//            int n = 0;
//            @Override
//            public Integer get() {
//                n++;
//                return n;
//            }
//        }).limit(10).forEach((x) -> System.out.println(x));
        
        Integer result = Stream.iterate(0, i -> i+1).limit(10).filter(i -> i%2 == 0).reduce(0, (s, i) -> s+i).intValue();
        System.out.println(result);
    }
}
