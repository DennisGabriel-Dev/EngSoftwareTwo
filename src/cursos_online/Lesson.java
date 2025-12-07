package cursos_online;

import cursos_online.users_type.Instructor;

public class Lesson {
    private Instructor instructor;

    public Lesson(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "instructor=" + instructor +
                '}';
    }
}
