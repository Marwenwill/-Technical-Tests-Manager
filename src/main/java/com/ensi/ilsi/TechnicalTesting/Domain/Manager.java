/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.TechnicalTesting.Domain;

import com.ensi.ilsi.TechnicalTesting.Domain.Candidate;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Toshiba-PC
 */
@Entity
public class Manager {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idManger;
    
    private String firstName;
    
    private String lastName;
    
    private Set<Candidate> candidatesList;
    
    private Set<Test> TestList;

    public Manager() {
    }

    public Manager(int idManger, String firstName, String lastName, Set<Candidate> candidatesList, Set<Test> TestList) {
        this.idManger = idManger;
        this.firstName = firstName;
        this.lastName = lastName;
        this.candidatesList = candidatesList;
        this.TestList = TestList;
    }

    public int getIdManger() {
        return idManger;
    }

    public void setIdManger(int idManger) {
        this.idManger = idManger;
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

    public Set<Candidate> getCandidatesList() {
        return candidatesList;
    }

    public void setCandidatesList(Set<Candidate> candidatesList) {
        this.candidatesList = candidatesList;
    }

    public Set<Test> getTestList() {
        return TestList;
    }

    public void setTestList(Set<Test> TestList) {
        this.TestList = TestList;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.idManger;
        hash = 97 * hash + Objects.hashCode(this.firstName);
        hash = 97 * hash + Objects.hashCode(this.lastName);
        hash = 97 * hash + Objects.hashCode(this.candidatesList);
        hash = 97 * hash + Objects.hashCode(this.TestList);
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
        final Manager other = (Manager) obj;
        if (this.idManger != other.idManger) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.candidatesList, other.candidatesList)) {
            return false;
        }
        if (!Objects.equals(this.TestList, other.TestList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Manager{" + "idManger=" + idManger + ", firstName=" + firstName + ", lastName=" + lastName + ", candidatesList=" + candidatesList + ", TestList=" + TestList + '}';
    }
    
    
}
