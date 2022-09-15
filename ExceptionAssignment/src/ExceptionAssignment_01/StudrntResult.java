package ExceptionAssignment_01;

public class StudrntResult {
	
	private int mathMarks;
	
	private int physicsMarks;

	public int getMathMarks() {
		return mathMarks;
	}

	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}

	public int getPhysicsMarks() {
		return physicsMarks;
	}

	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}

	@Override
	public String toString() {
		return "StudrntResult [mathMarks=" + mathMarks + ", physicsMarks=" + physicsMarks + "]";
	}

	public StudrntResult(int mathMarks, int physicsMarks) {
		super();
		this.mathMarks = mathMarks;
		this.physicsMarks = physicsMarks;
	}
	
}
