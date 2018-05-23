package br.com.db1.passwordmeter.meter.addition;

import br.com.db1.passwordmeter.meter.Meter;

public class LowercaseLettersAdditionMeter extends AbstractCaseLettersAdditionMeter implements Meter {

    @Override
    public Integer calculate(String password) {
        return calculate(password, "[a-z]");
    }

}
