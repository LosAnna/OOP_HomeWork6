package homeWork6.Model;

import homeWork6.Service.UserService;
import homeWork6.impls.UserServiceImpl;

import java.util.List;
import java.util.Objects;


public class Teacher extends User {
    private List<Student> group;
    public float grade;

    public Teacher(String name) {
        this.setName(name);
//        this.grade = this.getGrade();
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public float getGrade() {
        float g = 0;
        float avgG = 0;
        UserService userService = new UserServiceImpl();
        List<Student> s = userService.getAllUsers().stream()
                .filter(Student.class::isInstance)
                .map(x -> (Student) x)
                .toList();
//        List<Teacher> t = userService.getAllUsers().stream()
//                .filter(Teacher.class::isInstance)
//                .map(x -> (Teacher) x)
//                .toList();
            for (Student i : s) {
                if (this.getName() == i.getTeacher().getName()) {
                    g = g + i.getGrade();
                }
            }
        avgG = g / s.size();
        return avgG;
    }
//    public void setGrade(float grade) {
//        this.grade = grade;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(this.getName(), teacher.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName());
    }

    @Override
    public String toString() {
        return "_Учитель_"
                + this.getName() +
                "\n";
    }
}
