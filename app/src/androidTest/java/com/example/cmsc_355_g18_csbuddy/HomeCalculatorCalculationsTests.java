package com.example.cmsc_355_g18_csbuddy;

import android.widget.Button;

import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
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

}
