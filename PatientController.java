package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService pservice;

    @GetMapping("/getall")
    public List<Patient> getAll()
    {
        return pservice.getAll();
    }

    @PostMapping("/add")
    public String post(@RequestBody Patient p)
    {
        return pservice.add(p);
    }

    @PutMapping("/edit")
    public String edit(@RequestBody Patient p)
    {
        return pservice.edit(p);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Patient p)
    {
        return pservice.delete(p);
    }

}
