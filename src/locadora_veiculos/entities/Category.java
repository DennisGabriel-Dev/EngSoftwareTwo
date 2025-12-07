package locadora_veiculos.entities;

import java.util.ArrayList;

public class Category {
    private String title;
    private Double dailyValue;

    public Category(String title, Double dailyValue) {
        this.title = title;
        this.dailyValue = dailyValue;
    }

    @Override
    public String toString() {
        return "Category{" +
                "title='" + title + '\'' +
                ", dailyValue=" + dailyValue +
                '}';
    }
}
