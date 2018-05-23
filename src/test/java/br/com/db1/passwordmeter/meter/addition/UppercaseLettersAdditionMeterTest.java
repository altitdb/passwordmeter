package br.com.db1.passwordmeter.meter.addition;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.passwordmeter.meter.Meter;

public class UppercaseLettersAdditionMeterTest {

    @Test
    public void shouldReturnScore() {
        Meter meter = new UppercaseLettersAdditionMeter();
        Assert.assertSame(0, meter.calculate("AAAAAAAAAA"));
        Assert.assertSame(6, meter.calculate("AAAAAAAAAA123"));
    }

}
