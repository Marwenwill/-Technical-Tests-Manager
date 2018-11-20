/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
import java.util.ArrayList;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;


/**
 *
 * @author hajer
 */
@Entity
@Table(name = "technicalTest")
public class TechnicalTest {


    public TechnicalTest(int technicalTestId, String technicalTestDescription, String technicalTestType, ArrayList<Question> questions) {
        this.technicalTestId = technicalTestId;
        this.technicalTestDescription = technicalTestDescription;
        this.technicalTestType = technicalTestType;
        this.questions = questions;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "id", nullable = false)
    private int technicalTestId;
    
    @NotNull
    @Column(name = "description", nullable = false)
    private String technicalTestDescription;
    
    @NotNull
    @Column(name = "type", nullable = false)
    private String technicalTestType;
    
    public enum TestType {
    Python, Java, C, SQL
}

    @NotNull
    @OneToMany
    private ArrayList<Question> questions; 
    
  
    public void addQuestion(Question q){ 
  questions.add(q); 
 } 
    public void deleteQuestion(Question q){ 
  questions.remove(q); 
 } 
    
    @Override
    public String toString() {
        return "Technical Test{" +
                "Type='" + technicalTestType + '\'' +
                ", description='" + technicalTestDescription + '\'' +
                ", Questions =" + questions +
                '}';
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(technicalTestType, technicalTestDescription,questions ); 
    }
}



