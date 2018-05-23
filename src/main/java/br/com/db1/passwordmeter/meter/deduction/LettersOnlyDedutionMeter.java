package br.com.db1.passwordmeter.meter.deduction;

import br.com.db1.passwordmeter.meter.Meter;

public class LettersOnlyDedutionMeter extends AbstractOnlyDeductionMeter implements Meter {

    @Override
    public Integer calculate(String password) {
        return matcher(password, "[a-zA-Z]");
    }

}
