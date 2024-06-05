package model.service;

import model.dto.UserCreate;
import model.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> findAllUser();
    UserDto creteNew(UserCreate userCreate);
    void delete(Integer id);

}
