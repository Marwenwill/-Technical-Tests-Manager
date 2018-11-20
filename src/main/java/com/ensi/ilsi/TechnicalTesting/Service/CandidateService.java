

@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateService(CandiateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

   
}
