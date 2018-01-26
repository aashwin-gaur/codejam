package commons;


public enum Round {
	QUALIFIERS("qualifiers"),
	ROUND1A("round1a"),
	ROUND1B("round1b"),
	ROUND1C("round1c"),
	ROUND2("round2"),
	ROUND3("round3"),
	FINALS("finals");
	
	String round;
	
	Round(String round){
		this.round = round;
	}
	
	public String toString() {
		return round;
	}
	
	
}