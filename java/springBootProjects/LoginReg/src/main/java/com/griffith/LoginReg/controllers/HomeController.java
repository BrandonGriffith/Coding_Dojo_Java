package com.griffith.LoginReg.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.griffith.LoginReg.models.LoginUser;
import com.griffith.LoginReg.models.User;
import com.griffith.LoginReg.services.UserService;

@Controller
public class HomeController {
	@Autowired
    private UserService userServ;

    @GetMapping("/")
    public String index(Model model) {
    model.addAttribute("newUser", new User());
    model.addAttribute("newLogin", new LoginUser());
    return "index.jsp";
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
    BindingResult result, Model model, HttpSession session) {
        User user = this.userServ.register(newUser, result);
        if(result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        session.setAttribute("loggedInUserID", user.getId());
        return "redirect:/dashboard";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
    BindingResult result, Model model, HttpSession session) {
        User user = userServ.login(newLogin, result);
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        session.setAttribute("loggedInUserID", user.getId());
        return "redirect:/dashboard";
    }

    @RequestMapping("/dashboard")
    public String home(HttpSession session, Model model) {
        Long id = (Long) session.getAttribute("loggedInUserID");
        if(id == null) {
            return "redirect:/";
        }
        User loggedInUser = this.userServ.findOneUser(id);
        model.addAttribute("loggedInUser", loggedInUser);
        return "dashboard.jsp";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}