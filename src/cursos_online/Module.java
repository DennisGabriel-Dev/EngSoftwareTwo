package cursos_online;

import java.util.List;

public class Module {
    private String description;
    List<Lesson> lessons;

    public Module(String description, List<Lesson> lessons) {
        this.description = description;
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Module{" +
                "description='" + description + '\'' +
                ", lessons=" + lessons +
                '}';
    }
}
