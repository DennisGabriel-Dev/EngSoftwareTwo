package cursos_online;

public class User {
    private String name;
    private String document;

    public User(String name, String document){
        this.name = name;
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "name='" + name + '\'' +
                ", document='" + document + '\'' +
                '}';
    }
}
