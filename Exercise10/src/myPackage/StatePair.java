package myPackage;

public class StatePair {
	private String stateName, stateAbbreviation;

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateAbbreviation() {
		return stateAbbreviation;
	}

	public void setStateAbbreviation(String stateAbbreviation) {
		this.stateAbbreviation = stateAbbreviation;
	}
	
	public StatePair(String stateName, String stateAbbreviation) {
		this.stateName = stateName;
		this.stateAbbreviation = stateAbbreviation;
	}
	
}
