package shaojiexu.www.covariance;

import java.util.Arrays;
import java.util.List;

/**
 * Created by shaojie.xu on 03/07/2017.
 */
public class JavaVariance {

    public static void main(String... args) {
        Integer[] ints = {1,3,4,6,2};
        Object[] objs = ints;
        objs[0] = "1";
        objs[1] = true;
        objs[2] = new Object();
        List<Sparrow> sparrows = Arrays.asList(new Sparrow(), new Sparrow());
        flyBirds(sparrows);
        processSparrow(sparrows);
    }


    public static void flyBirds(List<? extends Bird> birds) {
        Sparrow sparrow = new Sparrow();
//        birds.add(sparrow);
        birds.add(null);
        birds.forEach(bird -> bird.fly());
    }

    public static void processSparrow(List<? super ItalianSparrow> sparrows) {
        ItalianSparrow sparrow = new ItalianSparrow();
        sparrows.add(sparrow);
//        for(ItalianSparrow bird : sparrows) {}
    }


}

interface Animal {}
abstract class Bird implements Animal { abstract void fly(); }

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow Fly");
    }
}
class ItalianSparrow extends Sparrow {

    @Override
    void fly() {
        System.out.println("ItalianSparrow Fly");
    }
}

class BirdContainer<T extends Bird> {

    private T bird;

    public T process(T bird){
        //...
        return bird;
    }

}