package com.learn.spring.basics.springindemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarSortImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;
//Constructor injection
//    public CarSortImpl(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }


   /* public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }Setter Injection*/

    public String carSort(int[] seats, int noofseats)
    {
        //CarSortAlgorithm seatsorter = new CarSortAlgorithm();
       // int[]carseats = seatsorter.seater(seats);
        //tightly coupled to 4 seater
        int [] carseats = sortAlgorithm.seater(seats);
        System.out.println(sortAlgorithm);
        return "4seater";
    }


    //Sorting cars
    //Searching cars
    //REturn result
}
