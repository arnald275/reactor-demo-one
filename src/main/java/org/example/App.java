package org.example;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        Flux<Integer> factoryflux = Flux.just(1,2,3,4,5,6);


        Integer[] arr = {1,2,3,4,5};
        Flux<Integer> fluxFromArray = Flux.fromArray(arr);

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        Flux<Integer> fluxFromIterable = Flux.fromIterable(list);

        Flux<Integer> anotherFactoryFlux = Flux.range(1,6);

        Flux.interval(Duration.ofMillis(5)).subscribe(
                System.out::println
        );
    }
}
