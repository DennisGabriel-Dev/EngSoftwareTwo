package locadora_veiculos.entities;

import locadora_veiculos.entities.person_type.Customer;
import locadora_veiculos.entities.person_type.Employee;

import java.util.Date;
import java.util.List;

public class Contract {
    private List<Car> cars;
    private Date removalDate;
    private Date devolutionDate;
    private Customer customer;
    private Employee employee;

    public Contract(Builder builder){
        this.cars = builder.cars;
        this.removalDate = builder.removalDate;
        this.devolutionDate = builder.devolutionDate;
        this.customer = builder.customer;
        this.employee = builder.employee;
    }

    @Override
    public String toString() {
        return "Contract: \n" +
                "cars=" + cars +
                "\nremovalDate=" + removalDate +
                "\ndevolutionDate=" + devolutionDate +
                "\ncustomer=" + customer +
                "\nemployee=" + employee;
    }

    public static class Builder {
        private List<Car> cars;
        private Date removalDate;
        private Date devolutionDate;
        private Customer customer;
        private Employee employee;

        public Builder cars(List<Car> cars){
            this.cars = cars;
            return this;
        }

        public Builder removalDate(Date removalDate){
            this.removalDate = removalDate;
            return this;
        }


        public Builder devolutionDate(Date devolutionDate){
            this.devolutionDate = devolutionDate;
            return this;
        }

        public Builder customer(Customer customer){
            this.customer = customer;
            return this;
        }

        public Builder employee(Employee employee){
            this.employee = employee;
            return this;
        }


        public void addCar(Car car) {
            cars.add(car);
        }

        public Contract build(){
            return new Contract(this);
        }
    }
}
