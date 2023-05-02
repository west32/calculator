package pl.bartek.randomendpoint.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.bartek.randomendpoint.service.RandomEndpointService;
@RestController
class RandomEndpointController {
    private final RandomEndpointService randomEndpointService = new RandomEndpointService();
    @GetMapping("/random-endpoint")
    RandomEndpointResponse randomEndpoint(@RequestParam(name = "name", required = false, defaultValue = "anymous")String name) {
        RandomEndpointService randomEndpointService = new RandomEndpointService();
        Sex sex = randomEndpointService.giveMeSex(name);
        return new RandomEndpointResponse(sex);
    }
}
