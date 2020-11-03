package com.min.usegelogapi.controller;

import com.min.usegelogapi.model.bean.APIResponse;
import com.min.usegelogapi.model.services.LoginLogRepository;
import com.min.usegelogapi.model.services.UserDataRepository;
import com.min.usegelogapi.model.tables.LoginLog;
import com.min.usegelogapi.model.tables.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserDataRepository userDataRepository;
    @Autowired
    private LoginLogRepository loginLogRepository;

    @PostMapping("/register")
    public Object register(UserData userData) {
        APIResponse res = new APIResponse();
        Optional<UserData> optUserData = userDataRepository.findByUserName(userData.getUserName());
        if (optUserData.isPresent()) {
            res.setMessage("Exist User");
            res.setData(1);
        } else {
            UserData dbUserData = userDataRepository.save(userData);
            res.setMessage("Create User");
            res.setData(dbUserData);
            System.out.println(dbUserData);
        }
        return res;
    }

    @PostMapping("/login")
    public Object login(@RequestParam String userName, @RequestParam String passWord) {
        APIResponse res = new APIResponse();
        Optional<UserData> optUserData = userDataRepository.findByUserNameAndPassWord(userName, passWord);
        if (optUserData.isPresent()) {
            res.setMessage("Find user");
            Optional<UserData> dbUserData = userDataRepository.findByUserName(userName);
            System.out.println(dbUserData);
            res.setData(dbUserData);
        } else {
            res.setMessage("Not found user");
            res.setData(0);
        }
        return res;
    }

    @PostMapping("/saveuserloginlog")
    public UserData saveUserLoginLog(@RequestBody UserData userData) {
        return userDataRepository.save(userData);
    }

    @PostMapping("/findalluser")
    public List<UserData> findAllUser() {
        return userDataRepository.findAll();
    }
}
