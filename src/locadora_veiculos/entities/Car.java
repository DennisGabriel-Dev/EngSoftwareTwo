package locadora_veiculos.entities;

public class Car {
    private Category category;
    private String model;

    public Car(Category category, String model) {
        this.category = category;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car: " +
                "category -> " + category +
                ", model -> " + model;
    }
}
