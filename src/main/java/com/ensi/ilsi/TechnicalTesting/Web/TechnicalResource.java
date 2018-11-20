/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

import Domain.TechnicalTest;
import Service.TechnicalTestService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hajer
 */
@RestController
@RequestMapping("/TechnicalTest")
public class TechnicalResource {

    private final TechnicalTestService technicalTestService;

    public TechnicalResource(TechnicalTestService productService) {
        this.technicalTestService = productService;
    }

    @GetMapping
    public List<TechnicalTest> findAll() {
        return this.technicalTestService.findAll();
    }

    @GetMapping("/{id}")
    public TechnicalTest findById(@PathVariable Long id) {
        return this.technicalTestService.findById(id);
    }

    @PostMapping
    public TechnicalTest create(@RequestBody TechnicalTest t) {
        return this.technicalTestService.create(t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.technicalTestService.delete(id);
    }
    
}
