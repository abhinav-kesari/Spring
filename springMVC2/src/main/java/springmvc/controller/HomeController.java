package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(Model model){
        System.out.println("This is Home !!");
        model.addAttribute("name","Abhinav Kesari");
        model.addAttribute("id","2215");

        List<String> friends = new ArrayList<String>();
        friends.add("Shyam");
        friends.add("Riya");
        friends.add("Anjali");


        model.addAttribute("f",friends);


        return "index";
    }
    @RequestMapping("/about")
    public String about(){
        System.out.println("This is about !!");
        return "about";
    }

    @RequestMapping("/help")
    public ModelAndView help(){
        System.out.println("This is Help !!");
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("sname","kesari");
        modelAndView.addObject("sid",23);

        LocalDateTime time = LocalDateTime.now();
        modelAndView.addObject("time",time);

        //marks
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        modelAndView.addObject("listA",list);

        modelAndView.setViewName("help");
        return modelAndView;
    }

}
