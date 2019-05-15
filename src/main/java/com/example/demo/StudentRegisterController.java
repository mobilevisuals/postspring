/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;
//https://dzone.com/articles/spring-boot-restful-web-service-example

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentRegisterController {

    @RequestMapping(method = RequestMethod.POST, value = "/register/student")
    @ResponseBody
    StudentRegistrationReply registerStudent(@RequestBody StudentRegistration studentregd) {
        StudentRegistrationReply stdregreply = new StudentRegistrationReply();
        stdregreply.setName(studentregd.getName());
        stdregreply.setAge(studentregd.getAge());
        stdregreply.setRegistrationNumber("12345678");
        stdregreply.setRegistrationStatus("Successful");
        return stdregreply;
    }
}
