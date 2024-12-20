package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.GetMapping;
import vn.hoidanit.laptopshop.service.UserService;

@Controller
public class UserController {
    
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage() {
        String test = this.userService.HandleHello();
        return "index.html";
    }
}

// @RestController
// public class UserController {
//     private UserService userService;
//     public UserController(UserService userService) {
//         this.userService = userService;
//     }
//     @GetMapping("")
//     public String getHomePage() {
//         return this.userService.HandleHello();
//     }
// }


