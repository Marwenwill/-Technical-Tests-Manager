

@Service
public class CandidateService {

    private final CandidateRepository candidatRepository;

    public CandidateService(CandiateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

   
}
