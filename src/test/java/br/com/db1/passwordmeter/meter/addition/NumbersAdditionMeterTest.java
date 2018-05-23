package br.com.db1.passwordmeter.meter.addition;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.passwordmeter.meter.Meter;

public class NumbersAdditionMeterTest {

    @Test
    public void shouldReturnScore() {
        Meter meter = new NumbersAdditionMeter();
        Assert.assertSame(0, meter.calculate("123"));
        Assert.assertSame(12, meter.calculate("123aaa"));
    }

}
