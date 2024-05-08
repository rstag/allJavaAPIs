package com.rstest.base.allJavaApi.usertest.services;

import com.rstest.base.allJavaApi.usertest.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> users;

    public UserService() {
        users=new ArrayList<>();
        User u=new User(1,"rs","rs@gm.com");
        users.add(u);
         u=new User(2,"asda","ghjf@gm.com");
        users.add(u);
    }

    public List<User> getUsers() {

        return users;
    }
}
