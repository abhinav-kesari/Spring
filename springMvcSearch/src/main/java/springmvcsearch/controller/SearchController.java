package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import springmvcsearch.model.Search;

@Controller
public class SearchController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("This is Home page...");
        return "home";
    }

    @RequestMapping("/search")
    public String searchResult(@ModelAttribute Search query) {
        System.out.println("SearchResult method executed..."+query.getQ());
        if(query.getQ().isEmpty()){
            System.out.println("Empty ...");
            return "/home";
        }
        return "redirect:https://www.google.com/search?q="+ query.getQ();
    }
}
