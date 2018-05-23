package br.com.db1.passwordmeter.classifier;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.passwordmeter.meter.ComplexityClassifier;

public class ComplexityClassifierTest {

    private ComplexityClassifier classifier;
    
    @Test
    public void shouldValidateScoreGreaterThanOneHundred() {
        classifier = new ComplexityClassifier(120);
        Assert.assertSame(100, classifier.getScore());
        Assert.assertEquals("Muito forte", classifier.classify());
    }
    
    @Test
    public void shouldValidateScoreLessThanZero() {
        classifier = new ComplexityClassifier(-20);
        Assert.assertSame(0, classifier.getScore());
        Assert.assertEquals("Muito fraca", classifier.classify());
    }
    
    @Test
    public void shouldValidateScoreVeryWeak() {
        classifier = new ComplexityClassifier(15);
        Assert.assertEquals("Muito fraca", classifier.classify());
    }
    
    @Test
    public void shouldValidateScoreVeryWeakWithMinLimit() {
        classifier = new ComplexityClassifier(0);
        Assert.assertEquals("Muito fraca", classifier.classify());
    }
    
    @Test
    public void shouldValidateScoreWeakWithMinLimit() {
        classifier = new ComplexityClassifier(20);
        Assert.assertEquals("Fraca", classifier.classify());
    }
    
    @Test
    public void shouldValidateScoreWeak() {
        classifier = new ComplexityClassifier(25);
        Assert.assertEquals("Fraca", classifier.classify());
    }
    
    @Test
    public void shouldValidateScoreGoodWithMinLimit() {
        classifier = new ComplexityClassifier(40);
        Assert.assertEquals("Boa", classifier.classify());
    }
    
    @Test
    public void shouldValidateScoreGood() {
        classifier = new ComplexityClassifier(45);
        Assert.assertEquals("Boa", classifier.classify());
    }
    
    @Test
    public void shouldValidateScoreStrongWithMinLimit() {
        classifier = new ComplexityClassifier(60);
        Assert.assertEquals("Forte", classifier.classify());
    }
    
    @Test
    public void shouldValidateScoreStrong() {
        classifier = new ComplexityClassifier(70);
        Assert.assertEquals("Forte", classifier.classify());
    }

    @Test
    public void shouldValidateScoreVeryStrongWithMinLimit() {
        classifier = new ComplexityClassifier(80);
        Assert.assertEquals("Muito forte", classifier.classify());
    }

}
