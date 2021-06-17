package com.springsecurity.demo.springsecurityoath2bootcamp;


import org.graalvm.compiler.lir.LIRInstruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController
{
    private UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @GetMapping("/user/get/profile")
    public MappingJacksonValue viewProfile(Principal principal)
    {
        User user = userService.viewProfile(principal.getName());
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue((user));
        return mappingJacksonValue;
    }
}
