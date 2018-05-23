package br.com.db1.passwordmeter.meter.deduction;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.passwordmeter.meter.Meter;

public class NumbersOnlyDedutionMeterTest {

    @Test
    public void shouldReturnScore() {
        Meter meter = new NumbersOnlyDedutionMeter();
        Assert.assertSame(-2, meter.calculate("01"));
        Assert.assertSame(-3, meter.calculate("123"));
        Assert.assertSame(0, meter.calculate("aa123"));
    }

}
