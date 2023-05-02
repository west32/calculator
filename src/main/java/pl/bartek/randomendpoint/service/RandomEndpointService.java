package pl.bartek.randomendpoint.service;
import pl.bartek.randomendpoint.controller.Sex;
import java.util.Objects;

public class RandomEndpointService {
    public Sex giveMeSex(String name){
        if (Objects.equals(name, "Łukasz")){
            return Sex.Male;
        } else if(Objects.equals(name, "Asia")){
            return Sex.Female;
        }else return Sex.HCWD;

    }
}
