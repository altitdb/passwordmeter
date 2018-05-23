package br.com.db1.passwordmeter.meter.addition;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.passwordmeter.meter.Meter;

public class LowercaseLettersAdditionMeterTest {

    @Test
    public void shouldReturnScore() {
        Meter meter = new LowercaseLettersAdditionMeter();
        Assert.assertSame(0, meter.calculate("aaaaaaaaaa"));
        Assert.assertSame(6, meter.calculate("aaaaaaaaaa123"));
    }

}
