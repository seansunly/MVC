package controller;

import model.dto.UserCreate;
import model.dto.UserDto;
import model.service.UserService;
import model.service.UserServiceImpl;

import java.util.List;

public class UserController {
    private final UserService userService = new   UserServiceImpl();


  public  void delete(Integer id){
         userService.delete(id);
    }
   public List<UserDto> findAllUser(){
        return userService.findAllUser();
    }

    public void createNew(UserCreate userCreate){
        userService.creteNew(userCreate);
    }
}
