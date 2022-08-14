package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        float eps = 0.0001f;
        Assert.assertEquals(expectedEuro, outEuro, eps);
    }

    @Test
    public void whenConvert0RblThen0Euro() {
        float inEuro = 0;
        float expectedEuro = 0;
        float outEuro = Converter.rubleToEuro(inEuro);
        float eps = 0.0001f;
        Assert.assertEquals(expectedEuro, outEuro, eps);
    }

    @Test
    public void whenConvert1RblThen0dot0142Euro() {
        float inEuro = 1;
        float expectedEuro = 0.0142f;
        float outEuro = Converter.rubleToEuro(inEuro);
        float eps = 0.0001f;
        Assert.assertEquals(expectedEuro, outEuro, eps);
    }

    @Test
    public void whenConvert180RblThen3Dollar() {
        float inDollar = 180;
        float expectedDollar = 3;
        float outDollar = Converter.rubleToDollar(inDollar);
        float eps = 0.0001f;
        Assert.assertEquals(expectedDollar, outDollar, eps);
    }

    @Test
    public void whenConvert0RblThen0Dollar() {
        float inDollar = 0;
        float expectedDollar = 0;
        float outDollar = Converter.rubleToDollar(inDollar);
        float eps = 0.0001f;
        Assert.assertEquals(expectedDollar, outDollar, eps);
    }

    @Test
    public void whenConvert1RblThen0dot0166Dollar() {
        float inDollar = 1;
        float expectedDollar = 0.0166f;
        float outDollar = Converter.rubleToDollar(inDollar);
        float eps = 0.0001f;
        Assert.assertEquals(expectedDollar, outDollar, eps);
    }
}