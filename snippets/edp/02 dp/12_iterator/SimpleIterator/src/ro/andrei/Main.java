package ro.andrei;

import ro.andrei.domain.CustomIterator;
import ro.andrei.domain.IterableArray;

public class Main {

    public static void main(String[] args) {
        IterableArray myArray = new IterableArray();
        CustomIterator it = myArray.getIterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }
//
        it.end();
        while (it.hasPrevious()){
            Object o = it.previous();
            System.out.println(o);
        }
//        while (it.hasNext()){
//            Object o = it.next();
//            System.out.println(o);
//        }
    }
}
