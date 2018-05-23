package br.com.db1.passwordmeter.meter.addition;

import br.com.db1.passwordmeter.meter.Meter;

public class NumberCharactersAdditionMeter implements Meter {

    @Override
    public Integer calculate(String password) {
        Integer len = password.length();
        return len * 4;
    }

}
