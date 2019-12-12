package com.example.cmsc_355_g18_csbuddy;

import org.junit.Test;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;


public class HomeCalculatorCalculationsTests {

    @Rule public final ActivityTestRule<MainActivity> main= new ActivityTestRule<>(MainActivity.class);

    //Test for scenario Decimal Addition in the Decimal Calculations User Story
    @Test
    public void decimalAdditionTest(){
        onView(withId(R.id.threeButton)).perform(click());
        onView(withId(R.id.sixButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("3610")));
        onView(withId(R.id.plusButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("3610 + ")));
        onView(withId(R.id.nineButton)).perform(click());
        onView(withId(R.id.eightButton)).perform(click());
        onView(withId(R.id.twoButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("982")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("3610 + 982 = 4592")));
    }

    //Test for scenario Decimal Subtraction in the Decimal Calculations User Story
    @Test
    public void decimalSubtractionTest(){
        onView(withId(R.id.twoButton)).perform(click());
        onView(withId(R.id.sevenButton)).perform(click());
        onView(withId(R.id.fiveButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("275")));
        onView(withId(R.id.minusButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("275 - ")));
        onView(withId(R.id.sevenButton)).perform(click());
        onView(withId(R.id.eightButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("78")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("275 - 78 = 197")));
    }

    //Test for scenario Decimal Multiplication in the Decimal Calculations User Story
    @Test
    public void decimalMultiplicationTest(){
        onView(withId(R.id.fourButton)).perform(click());
        onView(withId(R.id.sevenButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("47")));
        onView(withId(R.id.multiplyButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("47 * ")));
        onView(withId(R.id.fiveButton)).perform(click());
        onView(withId(R.id.threeButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("53")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("47 * 53 = 2491")));
    }

    //Test for scenario Decimal Division in the Decimal Calculations User Story
    @Test
    public void decimalDivisionTest(){
        onView(withId(R.id.sevenButton)).perform(click());
        onView(withId(R.id.fiveButton)).perform(click());
        onView(withId(R.id.twoButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("752")));
        onView(withId(R.id.divideButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("752 / ")));
        onView(withId(R.id.eightButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("80")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("752 / 80 = 9.4")));
    }

    //Test for scenario Binary Addition in the Binary Calculations User Story
    @Test
    public void binaryAdditionTest(){
        onView(withId(R.id.inputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Bin"))).perform(click());
        onView(withId(R.id.outputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Bin"))).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("110")));
        onView(withId(R.id.plusButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("110 + ")));
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("10")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("110 + 10 = 1000")));
    }

    //Test for scenario Binary Subtraction in the Binary Calculations User Story
    @Test
    public void binarySubtractionTest(){
        onView(withId(R.id.inputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Bin"))).perform(click());
        onView(withId(R.id.outputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Bin"))).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("1001")));
        onView(withId(R.id.minusButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("1001 - ")));
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("101")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("1001 - 101 = 100")));
    }

    //Test for scenario Binary Multiplication in the Binary Calculations User Story
    @Test
    public void binaryMultiplicationTest(){
        onView(withId(R.id.inputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Bin"))).perform(click());
        onView(withId(R.id.outputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Bin"))).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("11110")));
        onView(withId(R.id.multiplyButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("11110 * ")));
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("111")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("11110 * 111 = 11010010")));
    }

    //Test for scenario Binary Division in the Binary Calculations User Story
    @Test
    public void binaryDivisionTest(){
        onView(withId(R.id.inputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Bin"))).perform(click());
        onView(withId(R.id.outputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Bin"))).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("10010000")));
        onView(withId(R.id.divideButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("10010000 / ")));
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("1001")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("10010000 / 1001 = 10000")));
    }

    //Test for scenario Hexadecimal Addition in the Hexadecimal Calculations User Story
    @Test
    public void hexAdditionTest(){
        onView(withId(R.id.inputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Hex"))).perform(click());
        onView(withId(R.id.outputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Hex"))).perform(click());
        onView(withId(R.id.sevenButton)).perform(click());
        onView(withId(R.id.dButton)).perform(click());
        onView(withId(R.id.fiveButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("7D5")));
        onView(withId(R.id.plusButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("7D5 + ")));
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.fButton)).perform(click());
        onView(withId(R.id.aButton)).perform(click());
        onView(withId(R.id.fButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("1FAF")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("7D5 + 1FAF = 2784")));
    }

    //Test for scenario Hexadecimal Subtraction in the Hexadecimal Calculations User Story
    @Test
    public void hexSubtractionTest(){
        onView(withId(R.id.inputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Hex"))).perform(click());
        onView(withId(R.id.outputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Hex"))).perform(click());
        onView(withId(R.id.eButton)).perform(click());
        onView(withId(R.id.fourButton)).perform(click());
        onView(withId(R.id.bButton)).perform(click());
        onView(withId(R.id.cButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("E4BC")));
        onView(withId(R.id.minusButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("E4BC - ")));
        onView(withId(R.id.twoButton)).perform(click());
        onView(withId(R.id.fiveButton)).perform(click());
        onView(withId(R.id.sixButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("256")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("E4BC - 256 = E266")));
    }

    //Test for scenario Hexadecimal Multiplication in the Hexadecimal Calculations User Story
    @Test
    public void hexMultiplicationTest(){
        onView(withId(R.id.inputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Hex"))).perform(click());
        onView(withId(R.id.outputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Hex"))).perform(click());
        onView(withId(R.id.eightButton)).perform(click());
        onView(withId(R.id.twoButton)).perform(click());
        onView(withId(R.id.aButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("82A")));
        onView(withId(R.id.multiplyButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("82A * ")));
        onView(withId(R.id.fButton)).perform(click());
        onView(withId(R.id.fButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("FF")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("82A * FF = 821D6")));
    }

    //Test for scenario Hexadecimal Division in the Hexadecimal Calculations User Story
    @Test
    public void hexDivisionTest(){
        onView(withId(R.id.inputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Hex"))).perform(click());
        onView(withId(R.id.outputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Hex"))).perform(click());
        onView(withId(R.id.sixButton)).perform(click());
        onView(withId(R.id.aButton)).perform(click());
        onView(withId(R.id.aButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("6AA")));
        onView(withId(R.id.divideButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("6AA / ")));
        onView(withId(R.id.threeButton)).perform(click());
        onView(withId(R.id.fiveButton)).perform(click());
        onView(withId(R.id.fiveButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("355")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("6AA / 355 = 2")));
    }

}
