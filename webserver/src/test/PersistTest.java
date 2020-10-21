package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import config.Persist;
import exceptions.InvalidPortNumberException;

public class PersistTest {

	@Test
	public void test() throws InvalidPortNumberException {
		Persist persist = new Persist();
		persist.setPortNumber(1);
	}

}
