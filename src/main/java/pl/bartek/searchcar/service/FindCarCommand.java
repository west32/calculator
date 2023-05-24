package pl.bartek.searchcar.service;

import pl.bartek.searchcar.CarCategory;
import pl.bartek.searchcar.CarModel;

public class FindCarCommand {
    private final CarModel model;
    private final CarCategory category;
    private final Integer fromYear;
    private final Integer toYear;

    public FindCarCommand(CarModel model, CarCategory category, Integer fromYear, Integer toYear) {
        this.model = model;
        this.category = category;
        this.fromYear = fromYear;
        this.toYear = toYear;
    }

    public CarModel getModel() {
        return model;
    }

    public CarCategory getCategory() {
        return category;
    }

    public Integer getFromYear() {
        return fromYear;
    }

    public Integer getToYear() {
        return toYear;
    }
}
