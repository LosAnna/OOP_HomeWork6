// package homeWork6;

// import homeWork6.Model.Student;
// import homeWork6.Model.Teacher;
// import homeWork6.Model.User;
// import homeWork6.Service.UserService;
// import homeWork6.impls.UserServiceImpl;

// import java.util.Comparator;
// import java.util.List;

// import static java.util.stream.Collectors.toList;
// import static homeWork6.Model.Teacher.getGrade;

// public class TeacherComparator {

//    public List<Teacher> compareByGrade() {
//        UserService userService = new UserServiceImpl();
//        List<Teacher> teachers = userService.getAllUsers().stream()
//                .filter(Teacher.class::isInstance)
//                 .sorted(Comparator.comparing(Teacher::i.getGrade()))
//                .toList();
//        return sortedTeachers;
//    }
// }
