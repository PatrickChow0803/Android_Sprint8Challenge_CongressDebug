package com.lambdaschool.congressdata

import org.junit.Test
import kotlin.test.assertEquals

//Goal of this class is to test the class "OfficialOverview"
class OverviewUnitTest{

    /*
    OfficialOverview's constructor as reference
    constructor(firstName: String, middleName: String, lastName: String, party: String, state: String, id: String) {
        this.firstName = firstName
        this.middleName = middleName
        this.lastName = lastName
        this.party = party
        this.state = state
        this.displayName = buildDisplayName()
        this.id = id
    }
     */

    // First Test
    @Test
    fun firstTestingConstructor(){
        val firstName = "Patrick"
        val middleName = "null"
        val lastName = "Chow"
        val party = "N/A"
        val state = "NY"
        val id = "123"

        val test = OfficialOverview(firstName, middleName, lastName, party, state, id)

        assertEquals("Patrick Chow", test.displayName)
        assertEquals("N/A", test.party)
        assertEquals("NY", test.state)
        assertEquals("123", test.id)
    }

    // Second Test
    @Test
    fun secondTestingConstructor(){
        val firstName = "Alex"
        val middleName = "Wendy"
        val lastName = "Bell"
        val party = "Republican"
        val state = "TX"
        val id = "111"

        val test = OfficialOverview(firstName, middleName, lastName, party, state, id)

        assertEquals("Alex Wendy Bell", test.displayName)
        assertEquals("Republican", test.party)
        assertEquals("TX", test.state)
        assertEquals("111", test.id)
    }
}