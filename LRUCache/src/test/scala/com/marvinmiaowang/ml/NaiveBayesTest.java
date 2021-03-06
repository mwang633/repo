package com.marvinmiaowang.ml;

import junit.framework.TestCase;
import org.junit.Test;

public class NaiveBayesTest extends TestCase {

    @Test
    public void genderTest() {
        Instance[] instances = new Instance[] {
                new Instance("male", new double[] {   6,    180, 12}),
                new Instance("male", new double[] {   5.92, 190, 11}),
                new Instance("male", new double[] {	  5.58, 170, 12}),
                new Instance("male", new double[] {   5.92, 165, 10}),
                new Instance("female", new double[] { 5, 	100, 6}),
                new Instance("female", new double[] { 5.5,  150, 8}),
                new Instance("female", new double[] { 5.42, 130, 7}),
                new Instance("female", new double[] { 5.75, 150, 9})
        };

        NaiveBayes nb = new NaiveBayes(3);

        nb.train(instances);

        assertEquals(nb.classify(new double[] {6, 130, 8}), "female");
    }
}