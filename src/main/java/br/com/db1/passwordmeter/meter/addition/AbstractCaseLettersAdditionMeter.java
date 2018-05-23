package br.com.db1.passwordmeter.meter.addition;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AbstractCaseLettersAdditionMeter {

    protected Integer calculate(String password, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        int n = 0;
        while (matcher.find()) {
            n++;
        }
        int len = password.length();
        return (len - n) * 2;
    }

}
