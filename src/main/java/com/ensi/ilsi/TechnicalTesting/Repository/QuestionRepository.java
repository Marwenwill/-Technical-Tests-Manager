/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.TechnicalTesting.Repository;

import com.ensi.ilsi.TechnicalTesting.Domain.Question;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hajer
 */
@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    public Question findById(int id);
    public Question deleteById(int id);
}

