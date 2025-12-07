package cursos_online;

import cursos_online.users_type.Student;

import java.util.Date;

public class Registration {
    private Date initialDate;
    private Student student;
    private StudentProgressionEnum progression;

    public Registration(Student student) {
        this.student = student;
        this.initialDate = new Date();
        this.progression = StudentProgressionEnum.PROGRESS;
    }

    public Registration(Student student, Date initialDate) {
        this.student = student;
        this.initialDate = initialDate;
        this.progression = StudentProgressionEnum.PROGRESS;
    }

    public void changeProgression(StudentProgressionEnum progression){
        this.progression = progression;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "initialDate=" + initialDate +
                ", student=" + student +
                ", progression=" + progression +
                '}';
    }
}
