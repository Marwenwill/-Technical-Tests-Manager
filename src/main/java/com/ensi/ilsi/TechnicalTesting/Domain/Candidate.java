/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.TechnicalTesting.Domain;

import java.util.Objects;
import java.util.Set;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author ASUS-PC
 */
public class Candidate {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)


private int idCandidate;
private String firstName;
private String lastName;
@OneToMany
private Set<TechnicalTest> testList;
    
    
public Candidate()
{/*wallah je suis un constructeur*/}
    
public Candidate(int idCandidate, String firstName, String lastName)   
{
    this.idCandidate = idCandidate;
    this.firstName = firstName;
    this.lastName = lastName;
    this.testList = testList;
}
 
     public int getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(int idCandidate) {
        this.idCandidate = idCandidate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Set<TechnicalTest> getTestList() {
        return testList;
    }

    public void setTestList(Set<TechnicalTest> TestList) {
        this.testList = TestList;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.idCandidate;
        hash = 37 * hash + Objects.hashCode(this.firstName);
        hash = 37 * hash + Objects.hashCode(this.lastName);
        hash = 37 * hash + Objects.hashCode(this.testList);
        return hash;
    }
   
   
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Candidate other = (Candidate) obj;
        if (this.idCandidate != other.idCandidate) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
       
        if (!Objects.equals(this.testList, other.testList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Candidate{" + "idCandidate=" + idCandidate + ", firstName=" + firstName + ", lastName=" + lastName + ",TestList=" + testList + '}';
    }
    
    
    
}
