<<<<<<< HEAD
package com.ensi.ilsi.TechnicalTesting.Web;


import com.ensi.ilsi.TechnicalTesting.Domain.Question;
import com.ensi.ilsi.TechnicalTesting.Service.QuestionService;
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

import Domain.Question;
import Service.QuestionService;
>>>>>>> e54dbb6c2fa57a6fc4206cffd4787bda95651b4a
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hajer
 */
@RestController
@RequestMapping("/questions")
public class QuestionResource {
   

    private final QuestionService questionService;

    public QuestionResource(QuestionService questionService) {
        this.questionService = questionService;
    }


    @GetMapping("/{id}")
<<<<<<< HEAD
    public Question findById(@PathVariable int id) {
=======
    public Question findById(@PathVariable Long id) {
>>>>>>> e54dbb6c2fa57a6fc4206cffd4787bda95651b4a
        return this.questionService.findById(id);
    }

    @PostMapping
    public Question create(Question q) {
        return this.questionService.create(q);
    }

    @DeleteMapping("/{id}")
<<<<<<< HEAD
    public void delete(@PathVariable int id) {
        this.questionService.delete(id);
    }
}
=======
    public void delete(@PathVariable Long id) {
        this.questionService.delete(id);
    }
}
    

>>>>>>> e54dbb6c2fa57a6fc4206cffd4787bda95651b4a
