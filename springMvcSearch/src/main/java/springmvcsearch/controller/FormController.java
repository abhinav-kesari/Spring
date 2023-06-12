package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import springmvcsearch.model.Student;

@Controller
public class FormController {

    @RequestMapping("/complexForm")
    public String printForm() {
        System.out.println("Complex Form...");
        return "complexForm";
    }

    @RequestMapping("/submitForm")
    public String submitForm(@ModelAttribute Student student, BindingResult result) {
        System.out.println("Submit Form..."+student);
        if(result.hasErrors()){
            return "/complexForm";
        }
        return "success";
    }

}
