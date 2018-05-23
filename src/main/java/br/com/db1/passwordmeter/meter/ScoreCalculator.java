package br.com.db1.passwordmeter.meter;

import java.util.ArrayList;
import java.util.List;

import br.com.db1.passwordmeter.meter.addition.LowercaseLettersAdditionMeter;
import br.com.db1.passwordmeter.meter.addition.MiddleNumbersOrSymbolsAdditionMeter;
import br.com.db1.passwordmeter.meter.addition.NumberCharactersAdditionMeter;
import br.com.db1.passwordmeter.meter.addition.NumbersAdditionMeter;
import br.com.db1.passwordmeter.meter.addition.RequirementsAdditionMeter;
import br.com.db1.passwordmeter.meter.addition.SymbolsAdditionMeter;
import br.com.db1.passwordmeter.meter.addition.UppercaseLettersAdditionMeter;
import br.com.db1.passwordmeter.meter.deduction.ConsecutiveLowercaseLettersDeductionMeter;
import br.com.db1.passwordmeter.meter.deduction.ConsecutiveNumbersDeductionMeter;
import br.com.db1.passwordmeter.meter.deduction.ConsecutiveUppercaseLettersDeductionMeter;
import br.com.db1.passwordmeter.meter.deduction.LettersOnlyDedutionMeter;
import br.com.db1.passwordmeter.meter.deduction.NumbersOnlyDedutionMeter;
import br.com.db1.passwordmeter.meter.deduction.RepeatCharactersDeductionMeter;
import br.com.db1.passwordmeter.meter.deduction.SequentialLettersDeductionMeter;
import br.com.db1.passwordmeter.meter.deduction.SequentialNumbersDeductionMeter;
import br.com.db1.passwordmeter.meter.deduction.SequentialSymbolsDeductionMeter;

public class ScoreCalculator {

    private static final List<Meter> ADDITION = new ArrayList<>();
    private static final List<Meter> DEDUCTION = new ArrayList<>();

    static {
        ADDITION.add(new LowercaseLettersAdditionMeter());
        ADDITION.add(new MiddleNumbersOrSymbolsAdditionMeter());
        ADDITION.add(new NumberCharactersAdditionMeter());
        ADDITION.add(new NumbersAdditionMeter());
        ADDITION.add(new RequirementsAdditionMeter());
        ADDITION.add(new SymbolsAdditionMeter());
        ADDITION.add(new UppercaseLettersAdditionMeter());
        DEDUCTION.add(new ConsecutiveLowercaseLettersDeductionMeter());
        DEDUCTION.add(new ConsecutiveNumbersDeductionMeter());
        DEDUCTION.add(new ConsecutiveUppercaseLettersDeductionMeter());
        DEDUCTION.add(new LettersOnlyDedutionMeter());
        DEDUCTION.add(new NumbersOnlyDedutionMeter());
        DEDUCTION.add(new RepeatCharactersDeductionMeter());
        DEDUCTION.add(new SequentialLettersDeductionMeter());
        DEDUCTION.add(new SequentialNumbersDeductionMeter());
        DEDUCTION.add(new SequentialSymbolsDeductionMeter());
    }

    public Integer meter(String password) {
        Integer addition = 0;
        for (Meter meter : ADDITION) {
            addition += meter.calculate(password);
        }
        
        Integer deduction = 0;
        for (Meter meter : ADDITION) {
            deduction -= meter.calculate(password);
        }

        return addition - deduction;
    }

}
