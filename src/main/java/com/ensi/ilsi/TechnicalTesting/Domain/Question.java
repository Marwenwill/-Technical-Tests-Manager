/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

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
    
   
    public Question(int newId,String newQuestion, String newDescription) {
        this.questionId = newId;
        this.question = newQuestion;
        this.description = newDescription;
    }

    public Question() {
        // New question
    }
 
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question q = (Question) o;
        return Objects.equals(question, q.question) &&
               Objects.equals(description, q.description);
    }

    @Override
    public String toString() {
                return " Question{" +
                "question ='" + question +  + '\'' +
                ", description='" +  description +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, description); 
    }
}



