package com.example.demo;

import org.apache.maven.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HoodController {
    @Autowired
    Jobrepository jobrepository;

    @RequestMapping("/")
    public String listJobs(Model model){
        model.addAttribute("jobs", jobrepository.findAll());
        return "list";

    @GetMapping("/add")
     public String jobForm(Model model){
            model.addAttribute("job", new Job());
            return "jobform";
        }

     @PostMapping("/process")
     public String processForm(@Valid Job job, BindingResult result){
            return "jobform";
        }

        jobrepository.save(job);
    return "redirect:/";
        }
    }

