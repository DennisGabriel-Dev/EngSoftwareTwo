package locadora_veiculos.entities.person_type;

import locadora_veiculos.entities.Contract;
import locadora_veiculos.entities.Person;

import java.util.List;

public class Customer extends Person implements CanHaveContracts {
    private List<Contract> contracts;

    public Customer(String name, String document) {
        super(name, document);
    }

    @Override
    public void addContract(Contract contract) {
        contracts.add(contract);
    }
}
