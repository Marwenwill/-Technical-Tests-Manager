
package com.ensi.ilsi.TechnicalTesting.Web;


import com.ensi.ilsi.TechnicalTesting.Domain.Question;
import com.ensi.ilsi.TechnicalTesting.Service.QuestionService;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    public Question findById(@PathVariable int id) {
        return this.questionService.findById(id);
    }

    @PostMapping
    public Question create(Question q) {
        return this.questionService.create(q);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.questionService.delete(id);
    }

    
}
    