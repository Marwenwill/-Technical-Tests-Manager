/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.TechnicalTesting.Service;

import com.ensi.ilsi.TechnicalTesting.Domain.Candidate;
import com.ensi.ilsi.TechnicalTesting.Domain.TechnicalTest;
import com.ensi.ilsi.TechnicalTesting.Repository.ManagerRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Toshiba-PC
 */
@Service
public class ManagerService {
    private final ManagerRepository managerRepository;

    public ManagerService(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }
    
    public void testToCandidate(TechnicalTest t, Candidate c){
        
    }
}

