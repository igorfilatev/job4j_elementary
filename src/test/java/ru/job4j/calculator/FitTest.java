package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.calculator.Fit;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman172Then828() {
        short in = 172;
        double expected = 82.8;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}