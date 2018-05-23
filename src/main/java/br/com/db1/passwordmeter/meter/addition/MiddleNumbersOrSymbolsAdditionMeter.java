package br.com.db1.passwordmeter.meter.addition;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import br.com.db1.passwordmeter.meter.Meter;

public class MiddleNumbersOrSymbolsAdditionMeter extends AbstractCaseLettersAdditionMeter implements Meter {

    @Override
    public Integer calculate(String password) {
        int len = password.length();
        if (len < 3) {
            return 0;
        }
        String newPassword = StringUtils.substring(password, 1, len - 1);
        Pattern pattern = Pattern.compile("[^a-zA-Z]");
        Matcher matcher = pattern.matcher(newPassword);
        int n = 0;
        while (matcher.find()) {
            n++;
        }
        
        return n * 2;
    }

}
