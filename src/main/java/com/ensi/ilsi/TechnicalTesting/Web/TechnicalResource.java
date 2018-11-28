
package com.ensi.ilsi.TechnicalTesting.Web;

import com.ensi.ilsi.TechnicalTesting.Domain.TechnicalTest;
import com.ensi.ilsi.TechnicalTesting.Service.TechnicalTestService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hajer
 */
@RestController
@RequestMapping("/TechnicalTest")
public class TechnicalResource {

    private final TechnicalTestService technicalTestService;

    public TechnicalResource(TechnicalTestService technicalTestService) {
        this.technicalTestService = technicalTestService;
    }

    @GetMapping
    public List<TechnicalTest> findAll() {
        return this.technicalTestService.findAll();
    }

    @GetMapping("/{id}")
    public TechnicalTest findById(@PathVariable int id) {
        return this.technicalTestService.findById(id);
    }

    @PostMapping
    public TechnicalTest create(@RequestBody TechnicalTest t) {
        return this.technicalTestService.create(t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.technicalTestService.delete(id);
    }
    
}
