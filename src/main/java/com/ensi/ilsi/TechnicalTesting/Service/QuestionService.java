/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entities.Question;
import Repository.QuestionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author hajer
 */
@Service
public class QuestionService {
    private final Logger log = LoggerFactory.getLogger(QuestionService.class);

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }
    


    public Question create(Question q) {
        log.debug("Request to create Question : {}", q);
        return map(this.questionRepository.save(
                new Question(
                    q.getQuestionId(),
                    q.getQuestion(),
                    q.getDescription()
                )));
    }
        public Question findById(Long QuestionId) {
        log.debug("Request to get Product : {}", QuestionId);
        return this.questionRepository.findById(QuestionId).map(QuestionService::map).orElse(null);
    }
    
        public void delete(Long QuestionId) {
        log.debug("Request to delete Question : {}", QuestionId );
        this.questionRepository.deleteById(QuestionId);
    }
    
     public static Question map(Question q) {
        if (q != null) {
            return new Question(
                    q.getQuestionId(),
                    q.getQuestion(),
                    q.getDescription()
            );
        }
        return null;
    }
}