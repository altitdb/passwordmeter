package br.com.db1.passwordmeter.dto;

import java.io.Serializable;
import java.util.Objects;

public class PasswordResponseDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer score;
    private String complexity;

    public Integer getScore() {
        return score;
    }

    public String getComplexity() {
        return complexity;
    }

    public static class PasswordResponseBuilder {

        private PasswordResponseDTO dto;

        public PasswordResponseBuilder() {
            dto = new PasswordResponseDTO();
        }

        public PasswordResponseBuilder withScore(Integer score) {
            dto.score = score;
            return this;
        }

        public PasswordResponseBuilder withComplexity(String complexity) {
            dto.complexity = complexity;
            return this;
        }

        public PasswordResponseDTO build() {
            return dto;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, complexity);
    }

    @Override
    public boolean equals(Object obj) {
        PasswordResponseDTO dto = (PasswordResponseDTO) obj;
        return Objects.equals(dto.score, score) && Objects.equals(dto.complexity, complexity);
    }

}
