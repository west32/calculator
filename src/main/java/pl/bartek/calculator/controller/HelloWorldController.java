package pl.bartek.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.bartek.calculator.Greetings;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWorldController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @PostMapping("/say-hello-to")
    @ResponseBody
    public Greetings sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return new Greetings(counter.incrementAndGet(), String.format(template, name));
    }

}
