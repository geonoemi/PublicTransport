
public class Line {
	
	private int numberLetter;
	private String type;
	private double length;

	public Line(int numberLetter, String type, double length) {

		this.numberLetter = numberLetter;
		this.type = type;
		this.length = length;
	}

	public int getNumberLetter() {
		return numberLetter;
	}

	public String getType() {
		return type;
	}

	public double getLength() {
		return length;
	}

	@Override
	public String toString() {
		return numberLetter + " " + type + " " + length;
	}

}