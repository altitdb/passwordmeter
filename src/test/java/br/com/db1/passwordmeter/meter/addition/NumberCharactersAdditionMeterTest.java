package br.com.db1.passwordmeter.meter.addition;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.passwordmeter.meter.Meter;

public class NumberCharactersAdditionMeterTest {

    @Test
    public void shouldReturnScore() {
        Meter meter = new NumberCharactersAdditionMeter();
        Assert.assertSame(40, meter.calculate("1234567890"));
        Assert.assertSame(40, meter.calculate("aaaaaaaaaa"));
    }

}
