package com.example.cmsc_355_g18_csbuddy;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.swipeLeft;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MatrixCalculatorTests {
    @Rule
    public final ActivityTestRule<MainActivity> main = new ActivityTestRule<>(MainActivity.class);

    // Unit Test 1 for Scenario 1: Matrix Addition
    @Test
    public void MatrixAdditionTestOne() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT MATRIX ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT MATRIX COLUMN SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT VALUES: 1
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2, 3
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2, 3 4
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.plusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT 2ND COLUMN SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click()); // INPUT VALUES: 9
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUES: 9 0
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click()); // INPUT VALUES: 9 0, 5
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sevenButtonForMatrix)).perform(click()); // INPUT VALUES: 9 0, 5 7
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 10 2 |\n| 8 11 |"))); // ANSWER MATRIX: 10 2 , 8 11
    }

    // Unit Test 2 for Scenario 1: Matrix Addition
    @Test
    public void MatrixAdditionTestTwo() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click()); // INPUT MATRIX ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT MATRIX COLUMN SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click()); // INPUT VALUES: -1
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click()); // INPUT VALUES: -1 , 5
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click()); // INPUT VALUES: -1 , 5 , -3
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.plusButtonForMatrix)).perform(click()); // INPUT OPERATION
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
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 8 |\n| 5 |\n| 9 |"))); // ANSWER MATRIX: 8 , 5 , 9
    }

    // Unit Test 3 for Scenario 1: Matrix Addition
    @Test
    public void MatrixAdditionTestThree() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT MATRIX ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click()); // INPUT MATRIX COLUMN SIZE
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
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4, -10
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4, -10 -20
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4, -10 -20 -30
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4 -5 , -10 -20 -30 -40
        onView(withId(R.id.plusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT 2ND MATRIX ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click()); // INPUT 2ND MATRIX COLUMN SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT VALUES: 1
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2 3
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2 3 4
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4, 10
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4, 10 20
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4, 10 20 30
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // INPUT VALUES: -1 -2 -3 -4, 10 20 30 40
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 0 0 0 0 |\n| 0 0 0 0 |"))); // ANSWER MATRIX: 0 0 0 0 0 , 0 0 0 0 0
    }

    // Unit Test 1 for Scenario 2: Matrix Subtraction
    @Test
    public void MatrixSubtractionTestOne() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT MATRIX ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT MATRIX COLUMN SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT VALUES: 1
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2, 3
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2, 3 4
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.minusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT 2ND ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT 2ND COLUMN SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click()); // INPUT VALUES: 4
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUES: 4 0
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click()); // INPUT VALUES: 4 0, 9
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT VALUES: 4 0, 9 1
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| -3 2 |\n| -6 3 |"))); // ANSWER MATRIX: -3 2 , -6 3
    }

    // Unit Test 2 for Scenario 2: Matrix Subtraction
    @Test
    public void MatrixSubtractionTestTwo() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT MATRIX ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click()); // INPUT MATRIX COLUMN SIZE
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
        onView(withId(R.id.minusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT 2ND ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click()); // INPUT 2ND COLUMN SIZE
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
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| -1 895 1000 -232 |"))); // ANSWER MATRIX: -1 895 1000 -232
    }

    // Unit Test 3 for Scenario 2: Matrix Subtraction
    @Test
    public void MatrixSubtractionTestThree() {
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
        onView(withId(R.id.minusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT 2ND ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT 2ND COLUMN SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click()); // INPUT VALUE: -33333
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 45678 |"))); // ANSWER MATRIX: 45678
    }


    // Unit Test 1 for Scenario 3: Matrix Subtraction & Addition
    @Test
    public void MatrixSubAddTestOne() {
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
        onView(withId(R.id.minusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT 2ND ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT 2ND COLUMN SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click()); // INPUT VALUE: 9
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| -4 |"))); // ANSWER MATRIX: -4
        onView(withId(R.id.plusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT COLUMN SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sixButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // INPUT VALUE: 60
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 56 |"))); // ANSWER MATRIX: 56
    }

    // Unit Test 2 for Scenario 3: Matrix Subtraction & Addition
    @Test
    public void MatrixSubAddTestTwo() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT MATRIX ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT MATRIX COLUMN SIZE
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
        onView(withId(R.id.minusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT 2ND ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT 2ND COLUMN SIZE
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
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| -9 82 |\n| -22 -432 |"))); // ANSWER MATRIX: -9 82 ,-22 -432
        onView(withId(R.id.plusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
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
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 1101 160 |\n| -25 -1 |")));
    }

    // Unit Test 3 for Scenario 3: Matrix Subtraction & Addition
    @Test
    public void MatrixSubAddTestThree() {
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
        onView(withId(R.id.minusButtonForMatrix)).perform(click()); // INPUT OPERATION
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
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| -500 |\n| 199 |\n| 49967 |"))); // ANSWER MATRIX
        onView(withId(R.id.plusButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
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
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 1234067 |\n| -800 |\n| 49965 |"))); // ANSWER MATRIX
    }

    // Unit Test 1 for Scenario 1: Matrix Determinant
    @Test
    public void MatrixDetTestOne() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // 1x1 MATRIX
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click()); // INPUT VALUES: 99
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.detButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewTwo)).check(matches(withText("99"))); // DET = 99
    }

    // Unit Test 2 for Scenario 1: Matrix Determinant
    @Test
    public void MatrixDetTestTwo() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // 2x2 MATRIX
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // 0
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.decimalButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 0 3.2,
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // 0 3.2, 0
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click()); // 0 3.2, 0 -5
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.detButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewTwo)).check(matches(withText("0"))); // DET = 0
    }

    // Unit Test 3 for Scenario 1: Matrix Determinant
    @Test
    public void MatrixDetTestThree() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click()); // 4x4 MATRIX
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 4 900
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); /// 4 900 1
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // 4 900 1 1
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 4 900 1 1, -3
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 4 900 1 1, -3 99
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 4 900 1 1, -3 99 22
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 4 900 1 1, -3 99 22 0,
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 4 900 1 1, -3 99 22 0, 5
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 4 900 1 1, -3 99 22 0, 5 12
        onView(withId(R.id.sixButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 4 900 1 1, -3 99 22 0, 5 12
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 4 900 1 1, -3 99 22 0, 5 12
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.detButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewTwo)).check(matches(withText("-16276384"))); // DET = -16276384
    }

    // Unit Test 1 for Scenario 2: Matrix Addition & Determinant
    @Test
    public void MatrixAddDetTestOne() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 1x1 MATRIX
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 111
        onView(withId(R.id.plusButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 1x1 MATRIX
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 111 + -23
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 88 |"))); // ANS = 88
        onView(withId(R.id.detButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewTwo)).check(matches(withText("88"))); // DET = 88
    }

    // Unit Test 2 for Scenario 2: Matrix Addition & Determinant
    @Test
    public void MatrixAddDetTestTwo() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // 2x2 MATRIX
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // 0
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.decimalButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 0 3.2,
        onView(withId(R.id.nineButtonForMatrix)).perform(click()); // 0 3.2, 9
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click()); // 0 3.2, 9 -5
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.plusButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // 2x2 MATRIX
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.decimalButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 1.2
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 1.2 5 ,
        onView(withId(R.id.eightButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 1.2 5 , -8
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 1.2 5 , -8 1
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 1.2 8.2 |\n| 1 -4 |"))); // ANSWER
        onView(withId(R.id.detButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewTwo)).check(matches(withText("-13"))); // DET = -13
    }

    // Unit Test 3 for Scenario 2: Matrix Addition & Determinant
    @Test
    public void MatrixAddDetTestThree() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sixButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sevenButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.eightButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.plusButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.eightButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sevenButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sixButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 10 10 10 |\n| 10 10 10 |\n| 10 10 10 |")));
        onView(withId(R.id.detButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewTwo)).check(matches(withText("0")));
    }

    // Unit Test 1 for Scenario 3: Matrix Multiplication & Determinant
    @Test
    public void MatrixMultiDetTestOne() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 1x1 MATRIX
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.eightButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 18
        onView(withId(R.id.multiplyButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 1x1 MATRIX
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 18 * -2
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| -36 |")));
        onView(withId(R.id.detButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewTwo)).check(matches(withText("-36")));
    }

    // Unit Test 2 for Scenario 3: Matrix Multiplication & Determinant
    @Test
    public void MatrixMultiDetTestTwo() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // 2x2 MATRIX
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sevenButtonForMatrix)).perform(click());
        onView(withId(R.id.decimalButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 7.5
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 7.5 2,
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 7.5 2, 4
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.decimalButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());  // 7.5 2, 4 3.5
        onView(withId(R.id.multiplyButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // 2x2 MATRIX
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.decimalButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.decimalButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| -9 44.25 |\n| 2.5 27.25 |")));
        onView(withId(R.id.detButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewTwo)).check(matches(withText("-355.875"))); // DET
    }

    // Unit Test 3 for Scenario 3: Matrix Multiplication & Determinant
    @Test
    public void MatrixMultiDetTestThree() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sixButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sevenButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.eightButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.multiplyButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.eightButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sevenButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sixButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 39 32 25 |\n| 84 69 54 |\n| 138 114 90 |")));
        onView(withId(R.id.detButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewTwo)).check(matches(withText("0")));
    }

    // Unit Test 1 for Scenario 1: Matrix Multiplication
    @Test
    public void MatrixMultiTestOne() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 1x2 MATRIX
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 2
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 2 1
        onView(withId(R.id.multiplyButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 2x1 MATRIX
        onView(withId(R.id.fiveButtonForMatrix)).perform(click()); // 5
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 5 , 3
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 13 |")));
    }

    // Unit Test 2 for Scenario 1: Matrix Multiplication
    @Test
    public void MatrixMultiTestTwo() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click()); // 1x4 MATRIX
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.decimalButtonForMatrix)).perform(click());
        onView(withId(R.id.eightButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.decimalButtonForMatrix)).perform(click());
        onView(withId(R.id.eightButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.multiplyButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sixButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.decimalButtonForMatrix)).perform(click());
        onView(withId(R.id.eightButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 592.2 |")));
    }


    // Unit Test 3 for Scenario 1: Matrix Multiplication
    @Test
    public void MatrixMultiTestThree() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.sevenButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.multiplyButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sixButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sixButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| -51 195 |\n| -20 66 |")));
    }

    // Unit Test 1 for Scenario 2: Matrix Addition & Multiplication
    @Test
    public void MatrixAddMultiTestOne() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT MATRIX ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT MATRIX COLUMN SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click()); // INPUT VALUES: 1
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2, 3
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click()); // INPUT VALUES: 1 2, 3 4
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.plusButtonForMatrix)).perform(click()); // INPUT OPERATION
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT ROW SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click()); // INPUT 2ND COLUMN SIZE
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 5 5 |\n| 5 5 |")));
        onView(withId(R.id.multiplyButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.decimalButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.decimalButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sevenButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 15.5 -5 -14 |\n| 15.5 -5 -14 |")));
    }

    // Unit Test 2 for Scenario 2: Matrix Addition & Multiplication
    @Test
    public void MatrixAddMultiTestTwo() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.plusButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 21 |")));
        onView(withId(R.id.multiplyButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.decimalButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.decimalButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 63.42 -441 31.54 42 |")));
    }

    // Unit Test 3 for Scenario 2: Matrix Addition & Multiplication
    @Test
    public void MatrixAddMultiTestThree() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.plusButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 7761 13399 |\n| -5000 287 |")));
        onView(withId(R.id.multiplyButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 31282497 |\n| -1396439 |")));
    }

    // Unit Test 1 for Scenario 3: Matrix Multiplication & Subtraction
    @Test
    public void MatrixMultiSubTestOne() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.decimalButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.multiplyButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.decimalButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| -74246.86 |")));
        onView(withId(R.id.minusButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.decimalButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.negateButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| -20033.56 |")));
    }

    // Unit Test 2 for Scenario 3: Matrix Multiplication & Subtraction
    @Test
    public void MatrixMultiSubTestTwo() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.nineButtonForMatrix)).perform(click());
        onView(withId(R.id.eightButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.multiplyButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fiveButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 260256 |")));
        onView(withId(R.id.minusButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 260256 |")));
    }

    // Unit Test 3 for Scenario 3: Matrix Multiplication & Subtraction
    @Test
    public void MatrixMultiSubTestThree() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click()); // CLEAR INPUT TEXT
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sixButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.eightButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.multiplyButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.eightButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.sixButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 32 20 |\n| 80 52 |")));
        onView(withId(R.id.minusButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.oneButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.twoButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.threeButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.fourButtonForMatrix)).perform(click());
        onView(withId(R.id.zeroButtonForMatrix)).perform(click());
        onView(withId(R.id.enterButtonForMatrix)).perform(click());
        onView(withId(R.id.matrixViewOne)).check(matches(withText("| 22 0 |\n| 50 12 |")));
    }
}
