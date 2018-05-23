package br.com.db1.passwordmeter.service;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.passwordmeter.dto.PasswordResponseDTO;
import br.com.db1.passwordmeter.dto.PasswordResponseDTO.PasswordResponseBuilder;

public class PasswordMeterServiceBeanTest {

    private PasswordMeterService passwordMeterService = new PasswordMeterServiceBean();
    
    @Test
    public void test() {
        PasswordResponseDTO response = passwordMeterService.check("p4ssW0rd!!");
        PasswordResponseDTO expected = new PasswordResponseBuilder().withScore(100).withComplexity("Muito forte").build();
        Assert.assertEquals(expected, response);
    }

}
