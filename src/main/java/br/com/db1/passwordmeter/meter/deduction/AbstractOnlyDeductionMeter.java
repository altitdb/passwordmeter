package br.com.db1.passwordmeter.meter.deduction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbstractOnlyDeductionMeter {

    protected Integer matcher(String password, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        int n = 0;
        while (matcher.find()) {
            n++;
        }
        int len = password.length(); 
        if (len == n) {
            return n * -1;
        }
        return 0;
    }

}