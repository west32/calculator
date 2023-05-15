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
    private final SearchCarService searchCarService = new SearchCarService();
    @GetMapping("/find-car")
    SearchCarResponse searchCar(
            @RequestParam(name = "model", required = false, defaultValue = "")String model,
            @RequestParam(name = "category",required = false, defaultValue = "") String category,
            @RequestParam(name = "fromYear", required = false, defaultValue = "0" ) int fromYear,
            @RequestParam(name = "toYear", required = false, defaultValue = "" + Integer.MAX_VALUE) int toYear
    ){
        List<Car> queryCars = searchCarService.findCar(model, category, fromYear, toYear);
        return new SearchCarResponse(queryCars);
    }
}
