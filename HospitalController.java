package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
    @RestController
    @RequestMapping("/hosp")
    public class HospitalController {

        @Autowired
        PatientService pservice;

        @Autowired
        HospitalRepository hrepository;

        @GetMapping("getall")
        public List<Hospital> getAll()
        {
            return hrepository.getAll();
        }
        @PostMapping("add")
        public String add(@RequestBody Hospital h)
        {
            return pservice.addHospital(h);
        }
        @PutMapping("edit")
        public String edit(@RequestBody Hospital h)
        {
            return hrepository.edit(h);
        }

        @DeleteMapping("delete")
        public String delete(@RequestBody Hospital h)
        {
            return hrepository.delete(h);
        }

    }

