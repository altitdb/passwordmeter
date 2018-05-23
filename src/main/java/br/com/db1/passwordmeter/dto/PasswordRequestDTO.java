package br.com.db1.passwordmeter.dto;

import java.io.Serializable;
import java.util.Objects;

public class PasswordRequestDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String password;

    public String getPassword() {
        return password;
    }

    @Override
    public int hashCode() {
        return Objects.hash(password);
    }

    @Override
    public boolean equals(Object obj) {
        PasswordRequestDTO dto = (PasswordRequestDTO) obj;
        return Objects.equals(dto.password, password);
    }

}
