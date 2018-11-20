/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 *
 * @author hajer
 */
@Entity
@Table(name = "Question")
public class Question {
 
@Id
@NotNull
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id", nullable = false)
private int questionId;

@NotNull
@Column(name = "question", nullable = false)
private String question; 
@NotNull
@Column(name = "description", nullable = false)
private String description; 

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
   
   
