package homeWork6.Service;


import homeWork6.Model.*;

import java.util.List;

public interface UserService {
    void add(User user);

    void remove(User user);

    void remove(int index);


    void edit(User user, User updatedUser);

    void print(User user);

    List<User> getAllUsers();

    User get(User user);

    void saveAll(List<User> users);
    void sort(List<User> users);

    void sort(User user);
}
