package pl.bartek.randomendpoint.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.bartek.randomendpoint.service.RandomEndpointService;

@RestController
public class RandomEndpointController{
    private final RandomEndpointService randomEndpointService = new RandomEndpointService();
    @GetMapping("/random-endpoint")
    public RandomEndpointResponse randomEndpoint(@RequestParam(name = "name", required = false, defaultValue = "anymous")String name){
        RandomEndpointService randomEndpointService = new RandomEndpointService();
        Sex sex = randomEndpointService.giveMeSex(name);
        return new RandomEndpointResponse(sex);
    }
}

//TODO
//1 dodac pole płeć do randomendpoint response i ją zwrócic
//2 service ma zwracac enuma male lub female a nie stringa
