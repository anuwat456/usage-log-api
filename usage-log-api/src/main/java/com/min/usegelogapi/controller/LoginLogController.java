package com.min.usegelogapi.controller;

import com.min.usegelogapi.model.bean.APIResponse;
import com.min.usegelogapi.model.services.LoginLogRepository;
import com.min.usegelogapi.model.tables.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/login_log")
public class LoginLogController {
    @Autowired
    private LoginLogRepository loginLogRepository;

    @PostMapping("/createLoginLog")
    public  Object createLoginLog(LoginLog loginLog) {
        APIResponse res = new APIResponse();
        LoginLog dbLoginLog = loginLogRepository.save(loginLog);
        System.out.println(dbLoginLog);
        res.setMessage("Save user login log");
        return res;
    }
}
