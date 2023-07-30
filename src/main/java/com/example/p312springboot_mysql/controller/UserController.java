package com.example.p312springboot_mysql.controller;


import com.example.p312springboot_mysql.entity.User;
import com.example.p312springboot_mysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/allusers")
    public String showAllUsers(Model model){
        List<User> users = userService.getAllUsers();
        model.addAttribute("allUsers", users);
        return "allusers";
    }

    @GetMapping("add")
    public String addUser(Model model){
        model.addAttribute("user", new User());
        return "userinfo";
    }

    @PostMapping()
    public String saveUser(@ModelAttribute("user") User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "userinfo";
        }
        userService.addUser(user);
        return "redirect:/allusers";
    }
    @PostMapping("/deleteUser")
    public String deleteEmployee(@RequestParam ("userID") int id) {
        userService.deleteUser(id);
        return "redirect:/allusers";
    }

    @GetMapping("/updateUser")
    public String updateEmployee(Model model, @RequestParam ("userID") int id) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        userService.addUser(user);
        return "/userinfo";
    }

}
