package com.example.cmsc_355_g18_csbuddy;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.swipeLeft;
import static androidx.test.espresso.action.ViewActions.swipeRight;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MatrixCalculatorTests {
    @Rule
    public final ActivityTestRule<MainActivity> main= new ActivityTestRule<>(MainActivity.class);

    // Unit Test 1 for Scenario 1: Matrix Addition
    @Test
    public void MatrixAdditionTestOne(){
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT MATRIX ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("2")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT MATRIX COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("2")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT VALUES: 1
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2, 3
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2, 3 4
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT 2ND ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("2")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT 2ND COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("2")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click()); // INPUT VALUES: 9
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUES: 9 0
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click()); // INPUT VALUES: 9 0, 5
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sevenButtonForMatrix)).perform(click()); // INPUT VALUES: 9 0, 5 7
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.plusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.matrixView)).check(matches(withText("10 2 \n8 11 "))); // ANSWER MATRIX: 10 2 , 8 11
    }

    // Unit Test 2 for Scenario 1: Matrix Addition
    @Test
    public void MatrixAdditionTestTwo(){
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click()); // INPUT MATRIX ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("3")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT MATRIX COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("1")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click()); // INPUT VALUES: -1
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click()); // INPUT VALUES: -1 , 5
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click()); // INPUT VALUES: -1 , 5 , -3
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click()); // INPUT 2ND ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("3")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT 2ND COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("1")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click()); // INPUT VALUES: 9
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUES: 9 , 0
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT VALUES: 9 , 0 , 12
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.plusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.matrixView)).check(matches(withText("8 \n5 \n9 "))); // ANSWER MATRIX: 8 , 5 , 9
    }

    // Unit Test 3 for Scenario 1: Matrix Addition
    @Test
    public void MatrixAdditionTestThree(){
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT MATRIX ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("2")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click()); // INPUT MATRIX COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("5")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click()); // INPUT VALUES: -1
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4 -5
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4 -5 , -10
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4 -5 , -10 -20
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4 -5 , -10 -20 -30
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4 -5 , -10 -20 -30 -40
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4 -5 , -10 -20 -30 -40 -50
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT 2ND MATRIX ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("2")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click()); // INPUT 2ND MATRIX COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("5")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT VALUES: 1
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2 3
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2 3 4
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2 3 4 5 ,
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4 -5 , 10
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4 -5 , 10 2
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4 -5 , 10 20 30
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4 -5 , 10 20 30 40
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4 -5 , 10 20 30 40 50
        onView(withId(R.id.plusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.matrixView)).check(matches(withText("0 0 0 0 0 \n0 0 0 0 0 "))); // ANSWER MATRIX: 0 0 0 0 0 , 0 0 0 0 0
    }
    // Unit Test 1 for Scenario 2: Matrix Subtraction
    @Test
    public void MatrixSubtractionTestOne(){
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT MATRIX ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("2")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT MATRIX COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("2")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT VALUES: 1
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2, 3
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2, 3 4
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT 2ND ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("2")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT 2ND COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("2")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click()); // INPUT VALUES: 4
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUES: 4 0
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click()); // INPUT VALUES: 4 0, 9
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT VALUES: 4 0, 9 1
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.minusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.matrixView)).check(matches(withText("-3 2 \n-6 3 "))); // ANSWER MATRIX: -3 2 , -6 3
    }

    // Unit Test 2 for Scenario 2: Matrix Subtraction
    @Test
    public void MatrixSubtractionTestTwo(){
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT MATRIX ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("1")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click()); // INPUT MATRIX COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("5")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click()); // INPUT VALUES: 99
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUES: 99 900
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT VALUES: 99 900 1
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click()); // INPUT VALUES: 99 900 1 -230
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sixButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click()); // INPUT VALUES: 99 900 1 -230 -62
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT 2ND ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("1")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click()); // INPUT 2ND COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("5")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUES: 100
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click()); // INPUT VALUES: 100 5
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click()); // INPUT VALUES: 100 5 -999
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT VALUES: 100 5 -999 2
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click()); // INPUT VALUES: 100 5 -999 2 3
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.minusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.matrixView)).check(matches(withText("-1 895 1000 -232 -65 "))); // ANSWER MATRIX: -1 895 1000 -232 -65
    }

    // Unit Test 3 for Scenario 2: Matrix Subtraction
    @Test
    public void MatrixSubtractionTestThree(){
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT MATRIX ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("1")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT MATRIX COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("1")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click()); // INPUT VALUE: 12345
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT 2ND ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("1")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT 2ND COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("1")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click()); // INPUT VALUE: -33333
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.minusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.matrixView)).check(matches(withText("45678 "))); // ANSWER MATRIX: 45678
    }


    // Unit Test 1 for Scenario 3: Matrix Subtraction & Addition
    @Test
    public void MatrixSubAddTestOne(){
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT MATRIX ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("1")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT MATRIX COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("1")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click()); // INPUT VALUE: 5
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT 2ND ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("1")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT 2ND COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("1")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click()); // INPUT VALUE: 9
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.minusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.matrixView)).check(matches(withText("-4 "))); // ANSWER MATRIX: -4
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT COLUMN SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sixButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUE: 60
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.plusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.matrixView)).check(matches(withText("56 "))); // ANSWER MATRIX: 56
    }

    // Unit Test 2 for Scenario 3: Matrix Subtraction & Addition
    @Test
    public void MatrixSubAddTestTwo(){
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT MATRIX ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("2")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT MATRIX COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("2")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUE: 0
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUE: 0 90 ,
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.eightButtonForMatrix)).perform(click()); // INPUT VALUE: 0 90 , 8
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click()); // INPUT VALUE: 0 90 , 8 -432
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT 2ND ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("2")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT 2ND COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("2")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click()); // INPUT VALUE: 9
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.eightButtonForMatrix)).perform(click()); // INPUT VALUE: 9 8
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUE: 9 8 , 30
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUE: 9 8 , 30 0
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.minusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.matrixView)).check(matches(withText("-9 82 \n-22 -432 "))); // ANSWER MATRIX: -9 82 ,-22 -432
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT COLUMN SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUE: 1110
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sevenButtonForMatrix)).perform(click());
        onView(withId(R.id.eightButtonForMatrix)).perform(click()); // INPUT VALUE: 1110 78
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click()); // INPUT VALUE: 1110 78 , -3
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT VALUE: 1110 78 , -3 431
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.plusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.matrixView)).check(matches(withText("1101 160 \n-25 -1 "))); // ANSWER MATRIX: 56
    }

    // Unit Test 3 for Scenario 3: Matrix Subtraction & Addition
    @Test
    public void MatrixSubAddTestThree(){
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click()); // INPUT MATRIX ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("3")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT MATRIX COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("1")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUE: 0 ,
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUE: 0 , 200 ,
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUE: 0 , 200 , 50000
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click()); // INPUT 2ND ROW SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("3")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT 2ND COLUMN SIZE
        onView(withId(R.id.inputValueForMatrix)).check(matches(withText("1")));
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUE: 500
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT VALUE: 500 , 1
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click()); // INPUT VALUE: 500 , 1 , 33
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.minusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.matrixView)).check(matches(withText("-500 \n199 \n49967 "))); // ANSWER MATRIX
        onView(withId(R.id.threeButtonForMatrix)).perform(click()); // INPUT ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT COLUMN SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.sixButtonForMatrix)).perform(click());
        onView(withId(R.id.sevenButtonForMatrix)).perform(click()); // INPUT VALUE: 1234567 ,
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click()); // INPUT VALUE: 1234567 , -999
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click()); // INPUT VALUE: 1234567 , -999 , -2
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.plusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.matrixView)).check(matches(withText("1234067 \n-800 \n49965 "))); // ANSWER MATRIX
    }
}
