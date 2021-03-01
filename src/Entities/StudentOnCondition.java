package Entities;

public class StudentOnCondition extends Student {

	public StudentOnCondition() {
	//	int x=1;
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateMark()
	{
		return 60;
	}
}
