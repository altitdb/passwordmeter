package br.com.db1.passwordmeter.meter.addition;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.passwordmeter.meter.Meter;

public class MiddleNumbersOrSymbolsAdditionMeterTest {

    @Test
    public void shouldReturnScore() {
        Meter meter = new MiddleNumbersOrSymbolsAdditionMeter();
        Assert.assertSame(2, meter.calculate("A$A"));
        Assert.assertSame(6, meter.calculate("A$$$A"));
        Assert.assertSame(2, meter.calculate("000"));
        Assert.assertSame(0, meter.calculate("Aaa!"));
        Assert.assertSame(2, meter.calculate("A1a!"));
    }

}
