package locadora_veiculos.entities;

public abstract class Person {
    private String name;
    private String document;

    public Person(String name, String document) {
        this.name = name;
        this.document = document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", document='" + document + '\'' +
                '}';
    }
}
