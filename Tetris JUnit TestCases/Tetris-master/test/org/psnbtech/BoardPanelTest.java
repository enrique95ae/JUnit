package org.psnbtech;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BoardPanelTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
    public void testIsValidAndEmpty() {
        assertFalse("Column fail",board.isValidAndEmpty(type, -1, 5, 0));
        assertFalse("Row fail",board.isValidAndEmpty(type, 4, -20, 0));
        assertTrue("Overall success",board.isValidAndEmpty(type, 5, 5, 0));
    }

    @Test
    public void testAddPiece() {
        assertTrue("Type check success",type.isTile(4, 4, 0));
        assertTrue("Type check fail",type.isTile(-5, -5, 0));
    }

	@Test
	public void testCheckLines() {
		fail("Not yet implemented");
	}

}
