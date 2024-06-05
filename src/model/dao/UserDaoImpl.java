package model.dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{


    private List<User> addUser=new ArrayList<>(
            List.of(new User(1001,"sunly","sunlyslun"),
                    new User(1002,"sunlyalysun","sunly@123gmail.com"),
                    new User(1003,"sunlyhelhe","kila"))
    );




    @Override
    public void addNewUser(User user) {

        addUser.add(user);

    }

    @Override
    public void deleteNewUser(Integer id) {
            addUser.removeIf(e->e.getId().equals(id));
    }

    @Override
    public List<User> getListAll() {
        return addUser;
    }

    @Override
    public void UpdateUser(User user) {

    }
}
