package br.com.db1.passwordmeter.service;

import org.springframework.stereotype.Service;

import br.com.db1.passwordmeter.dto.PasswordResponseDTO;
import br.com.db1.passwordmeter.dto.PasswordResponseDTO.PasswordResponseBuilder;
import br.com.db1.passwordmeter.meter.ComplexityClassifier;
import br.com.db1.passwordmeter.meter.ScoreCalculator;

@Service
public class PasswordMeterServiceBean implements PasswordMeterService {

    @Override
    public PasswordResponseDTO check(String password) {
        ScoreCalculator scoreCalculator = new ScoreCalculator();
        Integer totalScore = scoreCalculator.meter(password);
        ComplexityClassifier complexityClassifier = new ComplexityClassifier(totalScore);
        String complexity = complexityClassifier.classify();
        Integer score = complexityClassifier.getScore();
        return new PasswordResponseBuilder().withScore(score).withComplexity(complexity).build();
    }

}