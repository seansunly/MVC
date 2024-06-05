package model.service;

import mapper.Mapper;
import model.User;
import model.dao.UserDao;
import model.dao.UserDaoImpl;
import model.dto.UserCreate;
import model.dto.UserDto;

import java.util.List;

public class UserServiceImpl implements UserService{

    private final UserDao userDao=new UserDaoImpl();

    @Override
    public List<UserDto> findAllUser() {
        return userDao.getListAll()
                .stream()
                .map(Mapper::mapFromUserToUserDto)
                .toList();
    }

    @Override
    public UserDto creteNew(UserCreate userCreate) {
        User user=User.builder()
                .id(userCreate.id())
                .name(userCreate.name())
                .email(userCreate.email())
                .build();
        userDao.getListAll().add(user);
        return
        UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .build();
    }

    @Override
    public void delete(Integer id) {
        User userdelete=userDao.getListAll().stream()
                .filter(e->e.getId().equals(id))
                .findFirst()
                .orElseThrow(null);
        userDao.getListAll().remove(userdelete);
    }
}
