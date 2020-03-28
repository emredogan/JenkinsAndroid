package com.example.jenkinsandroid;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void addition() {
        assertThat(8, is(MainActivity.additions(5,3)));
    }
}