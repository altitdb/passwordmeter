package br.com.db1.passwordmeter.meter.addition;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.passwordmeter.meter.Meter;

public class RequirementsAdditionMeterTest {

    @Test
    public void shouldReturnScore() {
        Meter meter = new RequirementsAdditionMeter();
        Assert.assertSame(10, meter.calculate("Aa1!0000"));
        Assert.assertSame(10, meter.calculate("0000Aa1!"));
        Assert.assertSame(0, meter.calculate("Aa1!"));
    }

}
