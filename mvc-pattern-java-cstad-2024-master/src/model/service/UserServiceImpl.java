package model.service;

import mapper.Mapper;
import model.dao.UserDao;
import model.dao.UserDaoImpl;
import model.dto.UserDto;
import java.util.List;

public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDaoImpl();
    @Override
    public List<UserDto> getAllUsers() {
        return userDao.getAllUsers()
                .stream()
                .map(Mapper::mapFromUserToUserDto)
                .toList();
    }
}
