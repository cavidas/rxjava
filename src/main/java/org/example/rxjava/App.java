package org.example.rxjava;


import io.reactivex.Observable;
import io.reactivex.functions.Function;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main (String args[]){

        System.out.println("asd");
        List<String> someWords = new ArrayList<String>();
        someWords.add("Word1");
        someWords.add("Word2");


        Observable.fromIterable(someWords)
                .groupBy(word -> word.equals(word))
                .subscribe(grouplist ->
                        System.out.println(grouplist.forEach(System.out::println)));
    }
}
