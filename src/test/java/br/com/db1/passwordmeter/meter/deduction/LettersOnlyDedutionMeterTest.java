package br.com.db1.passwordmeter.meter.deduction;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.passwordmeter.meter.Meter;

public class LettersOnlyDedutionMeterTest {

    @Test
    public void shouldReturnScore() {
        Meter meter = new LettersOnlyDedutionMeter();
        Assert.assertSame(-2, meter.calculate("aA"));
        Assert.assertSame(-3, meter.calculate("aaa"));
        Assert.assertSame(0, meter.calculate("000"));
    }

}
