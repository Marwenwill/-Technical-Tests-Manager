/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.TechnicalTesting.Domain;

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
private Set<Test> TestList;
    
    
public Candidate()
{/*wallah je suis un constructeur*/}
    
public Candidate(int idCandidate, String firstName, String lastName)   
{this.idCandidate = idCandidate;
 this.firstName = firstName;
 this.lastName = lastName;
this.TestList = TestList;}
 
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
    public Set<Test> getTestList() {
        return TestList;
    }

    public void setTestList(Set<Test> TestList) {
        this.TestList = TestList;
    }
   
   @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.idCandidate;
        hash = 97 * hash + Objects.hashCode(this.firstName);
        hash = 97 * hash + Objects.hashCode(this.lastName);
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
       
        if (!Objects.equals(this.TestList, other.TestList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Candidate{" + "idCandidate=" + idCandidate + ", firstName=" + firstName + ", lastName=" + lastName + ",TestList=" + TestList + '}';
    }
    
    
    
}
