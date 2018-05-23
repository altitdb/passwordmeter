package br.com.db1.passwordmeter.meter.addition;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.db1.passwordmeter.meter.Meter;

public class SymbolsAdditionMeter implements Meter {

    @Override
    public Integer calculate(String password) {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(password);
        int n = 0;
        while (matcher.find()) {
            n++;
        }
        return n * 6;
    }

}
