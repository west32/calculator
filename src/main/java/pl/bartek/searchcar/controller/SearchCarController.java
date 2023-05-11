package pl.bartek.searchcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.bartek.searchcar.Car;
import pl.bartek.searchcar.service.SearchCarService;

import java.util.List;

@RestController
public class SearchCarController {

    @GetMapping("/find-car")
    SearchCarResponse searchCar(@RequestParam(name = "query",required = false,defaultValue = "") String query){
        SearchCarService searchCarService = new SearchCarService();
        List<Car> queryCars = searchCarService.findCar(query);
        return new SearchCarResponse(queryCars);
    }

}
