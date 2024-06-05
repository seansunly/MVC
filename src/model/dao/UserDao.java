package model.dao;

import model.User;

import java.util.List;

public interface UserDao {
    void addNewUser(User user);
    void deleteNewUser(Integer id);
    List<User> getListAll();
    void UpdateUser(User user);

}
