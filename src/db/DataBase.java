package db;

import service.Mentor;
import service.Person;
import service.Student;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Person>people = new ArrayList<>();
    private List<Mentor>mentors = new ArrayList<>();
    private List<Student>students = new ArrayList<>();

    public DataBase(List<Person> people, List<Mentor> mentors, List<Student> students) {
        this.people = people;
        this.mentors = mentors;
        this.students = students;
    }

    public DataBase() {
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public List<Mentor> getMentors() {
        return mentors;
    }

    public void setMentors(List<Mentor> mentors) {
        this.mentors = mentors;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
