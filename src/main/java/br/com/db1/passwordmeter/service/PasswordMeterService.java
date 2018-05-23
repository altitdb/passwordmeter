package br.com.db1.passwordmeter.service;

import br.com.db1.passwordmeter.dto.PasswordResponseDTO;

public interface PasswordMeterService {

	PasswordResponseDTO check(String password);

}
