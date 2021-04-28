package com.example.todo_09;

import androidx.test.filters.SmallTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
@SmallTest
public class ExampleUnitTest {
    private Calculater mCalculater;

    @Before
    public void setUp(){
        mCalculater = new Calculater();
    }

    @Test
    public void addTwoNumber(){
        double sum = mCalculater.add(1d,2d);
        assertThat(sum,is(equalTo(3d)));
    }

    @Test
    public void addTwoNumberForNegative(){
        double sumNeg = mCalculater.add(1d,-2d);
        assertThat(sumNeg,is(equalTo(-1d)));
    }

    @Test
    public void addTwoFloat(){
        double sumFlo = mCalculater.add(1.111f,1.111f);
        assertThat(sumFlo,is(closeTo(2.222,0.01)));
    }

    @Test
    public void subTwoNumber(){
        double sub = mCalculater.sur(3d,2d);
        assertThat(sub,is(equalTo(1d)));
    }

    @Test
    public void subForNegativeNumber(){
        double subNeg = mCalculater.sur(1d,2d);
        assertThat(subNeg,is(equalTo(-1d)));
    }

    @Test
    public void mulTwoNumber(){
        double mul = mCalculater.mul(2d,2d);
        assertThat(mul,is(equalTo(4d)));
    }

    @Test
    public void mulForNumberZero(){
        double mulZero = mCalculater.mul(2d,0d);
        assertThat(mulZero,is(equalTo(0.0d)));
    }

    @Test
    public void divTwoNumber(){
        double div = mCalculater.div(4d,2d);
        assertThat(div,is(equalTo(2d)));
    }
}