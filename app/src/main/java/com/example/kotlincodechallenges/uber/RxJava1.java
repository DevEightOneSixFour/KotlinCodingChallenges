package com.example.kotlincodechallenges.uber;

import java.util.Arrays;
import java.util.List;
import io.reactivex.rxjava3.core.Observable;

public class RxJava1 {
    public static void main(String[] args) {
        final List<String> items = Arrays.asList("1","2","3","4","5","6");
//        Observable.fromIterable(items)
//                .switchMap(s -> {
//                   return Observable.just(s + "x");
//                })
//                .toList()
//                .doOnNext(System.out::println)
//                .subscribe();
    }
}
