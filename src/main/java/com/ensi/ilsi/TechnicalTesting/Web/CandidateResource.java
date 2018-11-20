

@RestController
@RequestMapping("/candidates")
public class CandidateWeb {

    private final CandidateService CandidateService;

    public CandidateWeb(CandidateService CandidateService) {
        this.CandidateService = CandidateService;
    }
    
    @GetMapping
    public List<TechnicalTest> ViewAffectedTest() {
        return this.CandidateService.ViewAffectedTest();
    }

}
