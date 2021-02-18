package org.launchcode.javawebdevtechjobsmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * Created by LaunchCode
 */
@Controller
public class HomeController {

    @RequestMapping(value = "")
    public String index(Model model) {

        HashMap<String, String> actionChoices = new HashMap<>();
        actionChoices.put("search", "Search"); //action.key in index.html followed by action.value
        actionChoices.put("list", "List");

        model.addAttribute("actions", actionChoices);

        return "index";
    }

}
