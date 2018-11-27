/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.TechnicalTesting.Service;

import com.ensi.ilsi.TechnicalTesting.Domain.TechnicalTest;
import com.ensi.ilsi.TechnicalTesting.Repository.QuestionRepository;
import com.ensi.ilsi.TechnicalTesting.Repository.TechnicalTestRepository;


import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author hajer
 */
@Service
public class TechnicalTestService {
   

    private final Logger log = LoggerFactory.getLogger(TechnicalTestService.class);

    private final TechnicalTestRepository technicalTestRepository;
    private final QuestionRepository questionRepository;

    public TechnicalTestService( TechnicalTestRepository technicalTestRepository, QuestionRepository questionRepository) {
        this.technicalTestRepository = technicalTestRepository;
        this.questionRepository = questionRepository;
    }
     public List<TechnicalTest> findAll() {
        log.debug("Request to get all Technical Tests");
        return this.technicalTestRepository.findAll();
    }

    @Transactional(readOnly = true)
    public TechnicalTest findById(int id) {
        log.debug("Request to get Technical Test : {}", id);
        return this.technicalTestRepository.findById(id);
    }

    public TechnicalTest create(TechnicalTest t) {
        log.debug("Request to create Technical Test : {}", t);

        return this.technicalTestRepository.save(
                new TechnicalTest(
                        t.getTechnicalTestDescription(),
                        t.getTechnicalTestType(),
                        t.getQuestions()
                ));
                        
    }

    public void delete(Long id) {
        log.debug("Request to delete Technical Test : {}", id);
        this.technicalTestRepository.deleteById(id);
    }

}

    