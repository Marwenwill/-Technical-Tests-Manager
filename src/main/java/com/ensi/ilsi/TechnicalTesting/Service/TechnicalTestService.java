/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.TechnicalTesting.Service;

<<<<<<< HEAD
import com.ensi.ilsi.TechnicalTesting.Domain.TechnicalTest;
import com.ensi.ilsi.TechnicalTesting.Repository.QuestionRepository;
import com.ensi.ilsi.TechnicalTesting.Repository.TechnicalTestRepository;
=======
import Entities.TechnicalTest;
import Repository.QuestionRepository;
import Repository.TechnicalTestRepository;
>>>>>>> e54dbb6c2fa57a6fc4206cffd4787bda95651b4a
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
                        t.getTechnicalTestId(),
                        t.getTechnicalTestDescription(),
<<<<<<< HEAD
                        t.getTechnicalTestType(),
                        t.getQuestions()
                ));
=======
                        t.getQuestions().stream().map(QuestionService::map).collect(Collectors.toSet())
                )));
>>>>>>> e54dbb6c2fa57a6fc4206cffd4787bda95651b4a
    }

    public void delete(Long id) {
        log.debug("Request to delete Technical Test : {}", id);
        this.technicalTestRepository.deleteById(id);
    }

<<<<<<< HEAD

=======
    public static TechnicalTest map(TechnicalTest t) {
        if (t != null) {
            return new TechnicalTest(
                        t.getTechnicalTestId(),
                        t.getTechnicalTestType(),
                        t.getTechnicalTestDescription(),
                        t.getQuestions().stream().map(QuestionService::map).collect(Collectors.toSet())
            );
        }
        return null;
    }
>>>>>>> e54dbb6c2fa57a6fc4206cffd4787bda95651b4a

}

    