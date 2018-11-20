<<<<<<< HEAD
package com.ensi.ilsi.TechnicalTesting.Web;


import com.ensi.ilsi.TechnicalTesting.Domain.TechnicalTest;
import com.ensi.ilsi.TechnicalTesting.Service.CandidateService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
=======
>>>>>>> e54dbb6c2fa57a6fc4206cffd4787bda95651b4a


@RestController
@RequestMapping("/candidates")
public class CandidateWeb {

    private final CandidateService CandidateService;

    public CandidateWeb(CandidateService CandidateService) {
        this.CandidateService = CandidateService;
    }
<<<<<<< HEAD

}
=======
    
    @GetMapping
    public List<TechnicalTest> ViewAffectedTest() {
        return this.CandidateService.ViewAffectedTest();
    }

}
>>>>>>> e54dbb6c2fa57a6fc4206cffd4787bda95651b4a
