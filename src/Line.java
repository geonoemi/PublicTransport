
public class Line {
	
	private int number;
	private String letter;
	private String type;
	private double length;

	public Line(int number, String letter, String type, double length) {

		this.number = number;
		this.letter = letter;
		this.type = type;
		this.length = length;
	}

	public int getNumber() {
		return number;
	}

	public String getLetter() {
		return letter;
	}

	public String getType() {
		return type;
	}

	public double getLength() {
		return length;
	}

	@Override
	public String toString() {
		return number + " " + letter + " " + type + " " + length;
	}

}