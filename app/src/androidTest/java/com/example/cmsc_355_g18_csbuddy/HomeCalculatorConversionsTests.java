package com.example.cmsc_355_g18_csbuddy;


import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;


@RunWith(AndroidJUnit4.class)
public class HomeCalculatorConversionsTests {

    @Rule public final ActivityTestRule<MainActivity> main = new ActivityTestRule<>(MainActivity.class);

    //Test for scenario Decimal --> Decimal in the Decimal to Hexadecimal Conversion User Story
    @Test
    public void decimalToDecimalTest(){
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.sevenButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("17")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("17 = 17")));
    }

    //Test for scenario Decimal --> Binary in the Binary to Decimal Conversion User Story
    @Test
    public void decimalToBinaryTest(){
        onView(withId(R.id.outputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Bin"))).perform(click());
        onView(withId(R.id.twoButton)).perform(click());
        onView(withId(R.id.sixButton)).perform(click());
        onView(withId(R.id.threeButton)).perform(click());
        onView(withId(R.id.threeButton)).perform(click());
        onView(withId(R.id.threeButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("26333")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("26333 = 110011011011101")));
    }

    //Test for scenario Decimal --> Hexadecimal in the Decimal to Hexadecimal Conversion User Story
    @Test
    public void decimalToHexTest(){
        onView(withId(R.id.outputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Hex"))).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.nineButton)).perform(click());
        onView(withId(R.id.twoButton)).perform(click());
        onView(withId(R.id.eightButton)).perform(click());
        onView(withId(R.id.threeButton)).perform(click());
        onView(withId(R.id.sevenButton)).perform(click());
        onView(withId(R.id.fourButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("1928374")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("1928374 = 1D6CB6")));
    }

    //Test for scenario Binary --> Decimal in the Binary to Decimal Conversion User Story
    @Test
    public void binaryToDecimalTest(){
        onView(withId(R.id.inputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Bin"))).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("110010")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("110010 = 50")));
    }

    //Test for scenario Binary --> Binary in the Binary to Decimal Conversion User Story
    @Test
    public void binaryToBinaryTest(){
        onView(withId(R.id.inputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Bin"))).perform(click());
        onView(withId(R.id.outputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Bin"))).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("1001")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("1001 = 1001")));
    }

    //Test for scenario Binary --> Hexadecimal in the Hexadecimal to Binary Conversion User Story
    @Test
    public void binaryToHexTest(){
        onView(withId(R.id.inputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Bin"))).perform(click());
        onView(withId(R.id.outputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Hex"))).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("1011110")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("1011110 = 5E")));
    }

    //Test for scenario Hexadecimal --> Decimal in the Decimal to Hexadecimal Conversion User Story
    @Test
    public void hexToDecimalTest(){
        onView(withId(R.id.inputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Hex"))).perform(click());
        onView(withId(R.id.aButton)).perform(click());
        onView(withId(R.id.bButton)).perform(click());
        onView(withId(R.id.cButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.twoButton)).perform(click());
        onView(withId(R.id.threeButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("ABC123")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("ABC123 = 11256099")));
    }

    //Test for scenario Hexadecimal --> Binary in the Hexadecimal to Binary Conversion User Story
    @Test
    public void hexToBinaryTest(){
        onView(withId(R.id.inputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Hex"))).perform(click());
        onView(withId(R.id.outputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Bin"))).perform(click());
        onView(withId(R.id.eButton)).perform(click());
        onView(withId(R.id.fourButton)).perform(click());
        onView(withId(R.id.cButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("E4C")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("E4C = 111001001100")));
    }

    //Test for scenario Hexadecimal --> Hexadecimal in the Hexadecimal to Binary Conversion User Story
    @Test
    public void hexToHexTest(){
        onView(withId(R.id.inputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Hex"))).perform(click());
        onView(withId(R.id.outputBases)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Hex"))).perform(click());
        onView(withId(R.id.threeButton)).perform(click());
        onView(withId(R.id.sixButton)).perform(click());
        onView(withId(R.id.fButton)).perform(click());
        onView(withId(R.id.zeroButton)).perform(click());
        onView(withId(R.id.dButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("36F0D")));
        onView(withId(R.id.equalsButton)).perform(click());
        onView(withId(R.id.inputText)).check(matches(withText("0")));
        onView(withId(R.id.answerText)).check(matches(withText("36F0D = 36F0D")));
    }

}
