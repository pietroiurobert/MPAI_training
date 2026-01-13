/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalinterfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author null
 */
public class FunctionalInterfaces {

    interface Operation<T, R> extends Function<T, R> {
    }

       
    

    public static Operation<Integer, Integer> makeOp(Integer number) {
        return (x) -> {
            return (x + number);
        };
    }


    public static void main(String[] args) {
        final Integer number = 5;
        Operation<Integer, Integer> op = makeOp(number);
//        for (int i = 0; i < 10; i++) {
//            op = makeOp(number);
//            System.out.println("result " + op.operation(i));
//        }
        Integer[] source = {1, 2, 3, 4};
//        Stream.of(source).map(x->x+5).forEach(System.out::println);
        Stream.of(source).map(op).forEach(System.out::println);
        System.out.println(Stream.of(source).filter(x -> x % 2 == 0).collect(Collectors.averagingInt(x -> x)));
    }

}
