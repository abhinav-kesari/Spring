package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

    @Autowired
    private UserService userService;

    @RequestMapping("/contact")
    public String showForm() {
        System.out.println("we r in contact controller");
        return "contact";
    }

    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String contactHandler(@ModelAttribute User user, Model model) {
        System.out.println("Inside the processform");
        System.out.println(user);

        if(user.getUsername().isEmpty()){
            return "redirect:/contact";
        }


        userService.insertUser(user);

         model.addAttribute("email",user.getEmail());
         model.addAttribute("name",user.getUsername());
         model.addAttribute("pass",user.getPassword());
        return "success";
    }
}
