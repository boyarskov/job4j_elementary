package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
    float in = 140;
    float expected = 2;
    float out = Converter.rubleToEuro(in);
    float eps = 0.0001f;
    Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert1800RblThen30Dollars() {
        float in = 1800;
        float expected = 30;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}