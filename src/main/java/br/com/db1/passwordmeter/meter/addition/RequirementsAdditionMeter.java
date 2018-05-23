package br.com.db1.passwordmeter.meter.addition;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.db1.passwordmeter.meter.Meter;

public class RequirementsAdditionMeter implements Meter {

    @Override
    public Integer calculate(String password) {
        int n = 0;

        if (password.length() >= 8) {
            n++;
        }

        Boolean isUpper = matcher(password, "[A-Z]");
        if (isUpper) {
            n++;
        }

        Boolean isLower = matcher(password, "[a-z]");
        if (isLower) {
            n++;
        }

        Boolean isNumbers = matcher(password, "[0-9]");
        if (isNumbers) {
            n++;
        }

        Boolean isSymbols = matcher(password, "[^0-9a-zA-Z]");
        if (isSymbols) {
            n++;
        }

        if (n > 4) {
            return 10;
        }
        return 0;
    }

    protected boolean matcher(String password, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

}
