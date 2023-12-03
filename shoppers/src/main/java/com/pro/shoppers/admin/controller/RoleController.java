package com.pro.shoppers.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/role")
public class RoleController {

    public RoleController() {

    }

    @GetMapping
    public String getAllRoles(Model model) {
        model.addAttribute("roles");
        return "all_roles";
    }
}
