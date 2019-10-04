package com.lambdaschool.congressdata

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.FixMethodOrder
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

@RunWith(AndroidJUnit4::class)
@LargeTest // Allows Network Access
@FixMethodOrder(MethodSorters.NAME_ASCENDING) // Perform the testes in ascending order

class DetailsActivityTest {

    // Tells Android Studio which activity to use for testing
    @Rule
    @JvmField
    var activityScenarioRule = ActivityScenarioRule(DetailsActivity::class.java)

    // Check to see if the text matches up with activity_details_view
    @Test
    fun check(){
        onView(withId(R.id.profile_name)).check(matches(withText("Trent P. Kelly")))
        onView(withId(R.id.profile_party)).check(matches(withText("Republican")))
        onView(withId(R.id.profile_district)).check(matches(withText("Mississippi - District 10")))
        onView(withId(R.id.profile_twitter)).check(matches(withText("Twitter")))
        onView(withId(R.id.profile_facebook)).check(matches(withText("Facebook")))
    }
}