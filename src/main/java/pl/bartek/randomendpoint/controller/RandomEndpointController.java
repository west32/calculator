package pl.bartek.randomendpoint.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.bartek.randomendpoint.service.RandomEndpointService;
@RestController
public class RandomEndpointController{
    @GetMapping("/random-endpoint")
    @ResponseBody
//    public RandomEndpointService randomEndpoint(@RequestParam(name = "name", required = false, defaultValue = "anymous")String name){
//        return new RandomEndpointService("Bartek", 1);
//    }
    public String hello(){
        return "Hello";
    }
}
