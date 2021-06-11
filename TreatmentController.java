package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/treat")
    public class TreatmentController {

        @Autowired
        TreatmentRepository trepository;

        @GetMapping("getall")
        public List<Treatment> getAll()
        {
            return trepository.getAll();
        }
        @PostMapping("add")
        public String add(@RequestBody Treatment t)
        {
            return trepository.add(t);
        }
        @PutMapping("edit")
        public String edit(@RequestBody Treatment t)
        {
            return trepository.edit(t);
        }

        @DeleteMapping("delete")
        public String delete(@RequestBody Treatment t)
        {
            return trepository.delete(t);
        }

    }

