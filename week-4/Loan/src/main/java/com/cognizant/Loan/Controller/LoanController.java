package com.cognizant.Loan.Controller;

import com.cognizant.Loan.model.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/loans/{number}")
    public Loan getLoan(@PathVariable String number) {

        return new Loan(
                3258.0,
                400000.0,
                number,
                18,
                "Car"
        );
    }
}