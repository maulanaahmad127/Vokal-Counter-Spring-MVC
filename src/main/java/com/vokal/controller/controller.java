package com.vokal.controller;



import com.vokal.model.TextVokal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {
    
    @GetMapping
    public String home(Model model){
        model.addAttribute("msg", "Huruf Vokal Counter");
        model.addAttribute("vokal", new TextVokal());
        return "index";
    }

    @PostMapping("/cetak")
    public String cetak(Model model, TextVokal textVokal){
        model.addAttribute("msg", "Huruf Vokal Counter");
        model.addAttribute("vokal", textVokal);
        String output = textVokal.getVokal();
        System.out.println(output);
        model.addAttribute("output", output);
        return "index";
    }

    
}
