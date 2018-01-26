package commons;

public enum Problem {
	A("A"),
	B("B"),
	C("C"),
	D("D"),
	E("E"),
	F("F"),
	G("G"),
	H("H");

	String name;
	
	Problem(String name){
		this.name = name.toUpperCase();
	}	
	
	public static enum Size {
		SMALL("small"),
		LARGE("large");
		
		String size;
		
		Size(String size){
			this.size = size;
		}
		public String toString() {
			return size;
		}
	}
}
