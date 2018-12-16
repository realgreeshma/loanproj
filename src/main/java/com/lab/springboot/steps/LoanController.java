package com.lab.springboot.steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class LoanController {

    @GetMapping("/loan")
    public List<Loan> getAllLoanTypes()
    {
        return Arrays.asList(new Loan(1,"Ganesh","Education"));
    }
}
