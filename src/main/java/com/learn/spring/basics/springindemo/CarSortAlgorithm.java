package com.learn.spring.basics.springindemo;


import org.springframework.stereotype.Component;

@Component
public class  CarSortAlgorithm implements SortAlgorithm
{
    public int[] seater(int[] seats)
    {
        return seats;
    }
}
