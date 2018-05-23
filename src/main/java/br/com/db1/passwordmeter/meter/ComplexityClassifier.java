package br.com.db1.passwordmeter.meter;

public class ComplexityClassifier {

    private Integer score;

    public ComplexityClassifier(Integer score) {
        if (score > 100) {
            this.score = 100;
        } else if (score < 0) {
            this.score = 0;
        } else {
            this.score = score;
        }
    }

    public String classify() {
        String complexity = "Muito curta";
        if (score >= 0 && score < 20) {
            complexity = "Muito fraca";
        } else if (score >= 20 && score < 40) {
            complexity = "Fraca";
        } else if (score >= 40 && score < 60) {
            complexity = "Boa";
        } else if (score >= 60 && score < 80) {
            complexity = "Forte";
        } else if (score >= 80 && score <= 100) {
            complexity = "Muito forte";
        }
        return complexity;
    }

    public Integer getScore() {
        return score;
    }

}
