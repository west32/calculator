package pl.bartek.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.bartek.calculator.service.ServiceFibonacciCount;

import java.util.Collection;

@Controller
public class CalculatorController {

    @PostMapping("/calculate/fibonacci")
    @ResponseBody
    public Collection<Long> integersList(@RequestParam(name = "howManyNumbers") int howManyNumbers){
        ServiceFibonacciCount fibonacciCount = new ServiceFibonacciCount();
        return fibonacciCount.countFibonacci(howManyNumbers);
    }

//    TODO
//    przeniesc Primenumbers z nowego brancha ktory odbbija z mastera
//    utworz pr z tego co dzis
//    return Collection w parametrze ilosc liczb fibonacciego
}