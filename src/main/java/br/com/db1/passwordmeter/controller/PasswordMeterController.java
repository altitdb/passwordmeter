package br.com.db1.passwordmeter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.passwordmeter.dto.PasswordRequestDTO;
import br.com.db1.passwordmeter.dto.PasswordResponseDTO;
import br.com.db1.passwordmeter.service.PasswordMeterService;

@RestController
public class PasswordMeterController {

	@Autowired
	private PasswordMeterService passwordCheckerService;

	@RequestMapping(value = "/api/v1/password/check", method = RequestMethod.POST)
	public PasswordResponseDTO checkPassword(@RequestBody PasswordRequestDTO password) {
		return passwordCheckerService.check(password.getPassword());
	}

}
