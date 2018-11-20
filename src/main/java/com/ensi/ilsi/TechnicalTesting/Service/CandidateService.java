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
    
<<<<<<< HEAD

=======
    public List<TechnicalTest> ViewAffectedTest()
    {
        return Candidate.getTestList()
    }
    
    
   
>>>>>>> e54dbb6c2fa57a6fc4206cffd4787bda95651b4a
}
