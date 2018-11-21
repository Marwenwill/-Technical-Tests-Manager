package com.ensi.ilsi.TechnicalTesting.Service;

import com.ensi.ilsi.TechnicalTesting.Domain.Candidate;
import com.ensi.ilsi.TechnicalTesting.Domain.TechnicalTest;
import com.ensi.ilsi.TechnicalTesting.Repository.CandidateRepository;
import java.util.List;
import org.springframework.stereotype.Service;





@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }
}
    
    