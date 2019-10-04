package com.lambdaschool.congressdata

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.FixMethodOrder
import org.junit.Rule
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

@RunWith(AndroidJUnit4::class)
@LargeTest //Allows Network Access
@FixMethodOrder(MethodSorters.NAME_ASCENDING) // Perform the testes in ascending order

class DetailsActivityTest {

    //Tells Android Studio which activity to use for testing
    @Rule
    @JvmField
    var activityScenarioRule = ActivityScenarioRule(DetailsActivity::class.java)

}