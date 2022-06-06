package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CigarPartyTest {
    CigarParty cigarParty;

    @Before
    public void setUp() {
        cigarParty = new CigarParty();
    }

    @Test
    public void happy_path() {
        //Assert
        Assert.assertTrue(cigarParty.haveParty(50, false));
    }

    @Test
    public void too_little_cigars_on_weekday() {
        //Assert
        Assert.assertFalse(cigarParty.haveParty(39, false));
    }

    @Test
    public void too_little_cigars_on_weekend() {
        //Assert
        Assert.assertFalse(cigarParty.haveParty(39, true));
    }

    @Test
    public void too_many_cigars_on_weekday() {
        //Assert
        Assert.assertFalse(cigarParty.haveParty(61, false));
    }

    @Test
    public void way_more_than_enough_cigars_on_weekend() {
        //Assert
        Assert.assertTrue(cigarParty.haveParty(1000, true));
    }
}
