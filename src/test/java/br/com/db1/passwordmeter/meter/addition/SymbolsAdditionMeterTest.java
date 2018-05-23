package br.com.db1.passwordmeter.meter.addition;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.passwordmeter.meter.Meter;

public class SymbolsAdditionMeterTest {

    @Test
    public void shouldReturnScore() {
        Meter meter = new SymbolsAdditionMeter();
        Assert.assertSame(18, meter.calculate("$$$"));
        Assert.assertSame(18, meter.calculate("123$$$"));
    }

}
