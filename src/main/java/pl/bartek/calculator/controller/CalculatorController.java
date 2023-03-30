package pl.bartek.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.bartek.calculator.service.PrimeNumbersService;

@Controller
public class CalculatorController {

    @PostMapping("/calculate/prime-numbers")
    @ResponseBody

    public String primeNumbers(@RequestParam(name = "minRange")int minRange,@RequestParam(name = "maxRange")int maxRange){
        PrimeNumbersService primeNumbersService = new PrimeNumbersService();
        return primeNumbersService.printPrimeNumbers(minRange,maxRange);
    }

}
