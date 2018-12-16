package com.learn.spring.basics.springindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInDemoApplication {

	public static void main(String[] args) {

		//what are beans?
		//where to search for beans?
		// what are the dependencies for beans?


		//CarSortImpl carSorting = new CarSortImpl(new ModelSortAlgorithm());
		//Application context
		ApplicationContext applicationContext =
		SpringApplication.run(SpringInDemoApplication.class, args);

		CarSortImpl carSorting = applicationContext.getBean(CarSortImpl.class);

		String selectedcar = carSorting.carSort(new int[]{2,4,7,8},4);

		System.out.println(selectedcar);
	}
}
