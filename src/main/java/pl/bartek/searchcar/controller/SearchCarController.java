package pl.bartek.searchcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.bartek.searchcar.Car;
import pl.bartek.searchcar.CarCategory;
import pl.bartek.searchcar.CarModel;
import pl.bartek.searchcar.filter.FilterFactory;
import pl.bartek.searchcar.service.FindCarCommand;
import pl.bartek.searchcar.service.SearchCarService;
import java.util.List;

@RestController
public class SearchCarController {

    private final FilterFactory filterFactory = new FilterFactory();
    private final SearchCarService searchCarService = new SearchCarService(filterFactory);

    @GetMapping("/find-car")
    SearchCarResponse searchCar(
            @RequestParam(name = "model", required = false) CarModel model,
            @RequestParam(name = "category",required = false) CarCategory category,
            @RequestParam(name = "fromYear", required = false ) Integer fromYear,
            @RequestParam (name = "toYear", required = false) Integer toYear
    ) {
            FindCarCommand findCarCommand = new FindCarCommand(model, category, fromYear, toYear);
            List<Car> queryCars = searchCarService.findCar(findCarCommand);
            return new SearchCarResponse(queryCars);
    }
}
