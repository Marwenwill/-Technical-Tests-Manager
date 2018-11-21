package com.ensi.ilsi.TechnicalTesting.Web;


import com.ensi.ilsi.TechnicalTesting.Domain.TechnicalTest;
import com.ensi.ilsi.TechnicalTesting.Service.CandidateService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/candidates")
public class CandidateWeb {

    private final CandidateService CandidateService;

    public CandidateWeb(CandidateService CandidateService) {
        this.CandidateService = CandidateService;
    }
}
