package cursos_online;

import java.util.List;

public class Course {
    List<Module> modules;
    List<Registration> registrations;

    public Course(List<Module> modules) {
        this.modules = modules;
    }

    public Course(List<Module> modules, List<Registration> registrations) {
        this.modules = modules;
        this.registrations = registrations;
    }

    @Override
    public String toString() {
        return "Course{" +
                "modules=" + modules +
                ", registrations=" + registrations +
                '}';
    }
}
