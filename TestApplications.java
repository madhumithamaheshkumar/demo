package com.example.demo.TestApplications;

import com.example.demo.Patient;
import com.example.demo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
class TestApplications {

        @Autowired
        PatientRepository prepository;

        public static void main(String[] args) {
            SpringApplication.run(TestApplications.class, args);
        }
        public void run(String... args) throws Exception{

            Patient P1=new Patient(1,"Arvind");
            Patient P2=new Patient(2,"Pandiyan");

            prepository.plist.add(P1);
            prepository.plist.add(P2);
        }

    }

