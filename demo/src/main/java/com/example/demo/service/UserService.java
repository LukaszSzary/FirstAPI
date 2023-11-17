package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList=new ArrayList<User>();

    public UserService(){
        userList.add(new User(1,"Adam",18));
        userList.add(new User(2,"Marek",48));
        userList.add(new User(3,"Antoni",68));
        userList.add(new User(4,"Alicja",85));
    }
    public User getUser(Integer id){
        Optional optional=Optional.empty();
        for (User u:userList  ) {
            if(id==u.getId()){
                 optional=Optional.of(u);
//                 return optional;
                return u;
            }

        }
        return null;
    }
}
