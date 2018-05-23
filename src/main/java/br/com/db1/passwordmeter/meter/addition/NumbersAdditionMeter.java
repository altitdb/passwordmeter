package br.com.db1.passwordmeter.meter.addition;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.db1.passwordmeter.meter.Meter;

public class NumbersAdditionMeter implements Meter {

    @Override
    public Integer calculate(String password) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(password);
        int n = 0;
        while (matcher.find()) {
            n++;
        }
        int len = password.length();
        if (len == n) {
            return 0;
        }
        return (len - n) * 4;
    }

}
