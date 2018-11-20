package com.ensi.ilsi.TechnicalTesting.Service;

import org.springframework.stereotype.Service;





@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }
    
    public Test ViewAffectedTest()
    {
        return Candidate.getTestList()
    }
    
    
   
}
