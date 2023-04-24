package pl.bartek.adventcallendar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.bartek.adventcallendar.service.ServiceAdventCallendar;

import java.util.List;

@Controller
public class AdventCallendarController {

    @PostMapping("/advent-callendar")
    @ResponseBody

    public int result(@RequestBody List<Integer> data ){

        ServiceAdventCallendar serviceAdventCallendar = new ServiceAdventCallendar();
        return serviceAdventCallendar.countIncreasment(data);
    }

//    TODO zamiast hardode zawartosc listy to musze je przeslac w postaci json
//    Lista integerow w jsonie co to jak ja zrobic, jak bede przzesylac liste intow w jsonie to spring
//     zmapuje na taka kolekcje jaka wpisalem


}
