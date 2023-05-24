package pl.bartek.searchcar.service;

public class FindCarCommand {
    private final String model;
    private final String category;
    private final Integer fromYear;
    private final Integer toYear;

    public FindCarCommand(String model, String category, Integer fromYear, Integer toYear) {
        this.model = model;
        this.category = category;
        this.fromYear = fromYear;
        this.toYear = toYear;
    }

    public String getModel() {
        return model;
    }

    public String getCategory() {
        return category;
    }

    public Integer getFromYear() {
        return fromYear;
    }

    public Integer getToYear() {
        return toYear;
    }
}
