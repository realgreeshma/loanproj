package com.learn.spring.basics.springindemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ModelSortAlgorithm implements SortAlgorithm
{
    public int[] seater(int[] seats)
    {
        return seats;
    }
}
