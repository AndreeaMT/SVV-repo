package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import config.Config;
import exceptions.InvalidPortNumberException;

public class ConfigurationTest {

	@Test
	public void testSetSetting() {
		Config conf = new Config("valid");
		assertTrue(conf.setSetting("PortNumber", "8000"));
	}

}
