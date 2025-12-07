package locadora_veiculos.test;

import locadora_veiculos.entities.Car;
import locadora_veiculos.entities.Category;
import locadora_veiculos.entities.Contract;
import locadora_veiculos.entities.person_type.Customer;
import locadora_veiculos.entities.person_type.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test01 {
    static void main() {
        System.out.println("========================== TEST 01 ==========================");
        Category category = new Category("SUV", 250.0);
        Employee employee = new Employee("Oliveira", "000.000.000-01");
        Customer customer = new Customer("Dennis", "000.000.000-02");
        Car car = new Car(category, "Nissan Kait");
        List<Car> cars= new ArrayList<Car>();
        cars.add(car);
        Contract contract = new Contract.Builder()
                .customer(customer)
                .employee(employee)
                .devolutionDate(new Date())
                .removalDate(new Date())
                .cars(cars)
                .build();

        System.out.println(contract.toString());
    }
}
