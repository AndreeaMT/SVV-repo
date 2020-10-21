package config;

import exceptions.InvalidPortNumberException;
import validators.PortNumberValidator;

public class Persist {
	public int getPortNumber() {
		return 0;
	}
	
	public String getRootDir() {
		return null;
	}
	
	public String getMaintenanceDir() {
		return null;
	}
	
	public boolean setPortNumber(int portNumber) throws InvalidPortNumberException{
		if(!PortNumberValidator.validate(portNumber)) {
			throw new InvalidPortNumberException();
		}
		return false;
	}
	
	public void setRootDir(String rootDir) {
		
	}
	
	public void setMaintenanceDir(String maintenanceDir) {
		
	}
}
