package com.example.cmsc_355_g18_csbuddy;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.swipeLeft;
import static androidx.test.espresso.action.ViewActions.swipeRight;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class PermutationCombinationTests {
    @Rule
    public final ActivityTestRule<MainActivity> main= new ActivityTestRule<>(MainActivity.class);

    //Represents Scenario 1 in the Compute Permutations User Story
    @Test
    public void permWithRepTest() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.permRadioButton)).perform(click());
        onView(withId(R.id.repetitionButton)).perform(click());
        onView(withId(R.id.editText3)).perform(typeText("10"));
        onView(withId(R.id.editText4)).perform(typeText("3"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.submitButton)).perform(click());
        onView(withId(R.id.outputTextView)).check(matches(withText("1000")));
    }

    //Represents Scenario 2 in the Compute Permutations User Story
    @Test
    public void combWithRepTest() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.combRadioButton)).perform(click());
        onView(withId(R.id.repetitionButton)).perform(click());
        onView(withId(R.id.editText3)).perform(typeText("7"));
        onView(withId(R.id.editText4)).perform(typeText("2"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.submitButton)).perform(click());
        onView(withId(R.id.outputTextView)).check(matches(withText("28")));
    }

    //Represents Scenario 3 in the Compute Permutations User Story
    @Test
    public void permNoRepTest() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.permRadioButton)).perform(click());
        onView(withId(R.id.editText3)).perform(typeText("10"));
        onView(withId(R.id.editText4)).perform(typeText("3"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.submitButton)).perform(click());
        onView(withId(R.id.outputTextView)).check(matches(withText("720")));
    }

}
