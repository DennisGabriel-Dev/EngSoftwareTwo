package cursos_online;

import cursos_online.users_type.Instructor;
import cursos_online.users_type.Student;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    static void main() {
        Student student01 = new Student("Dennis", "000.000.000-01");
        Student student02 = new Student("Gabriel", "000.000.000-02");
        Instructor instructor = new Instructor("Jones", "000.000.000-02");
        Registration registrationStudent01 = new Registration(student01);
        Registration registrationStudent02 = new Registration(student02);
        List<Registration> registrations = new ArrayList<Registration>();
        registrations.add(registrationStudent01);
        registrations.add(registrationStudent02);

        Lesson lesson = new Lesson(instructor);
        List<Lesson> lessons = new ArrayList<Lesson>();
        lessons.add(lesson);

        Module module = new Module("1o ano",lessons);
        List<Module> modules = new ArrayList<Module>();
        modules.add(module);

        Course ads = new Course(modules, registrations);

        System.out.println(ads);

    }
}
