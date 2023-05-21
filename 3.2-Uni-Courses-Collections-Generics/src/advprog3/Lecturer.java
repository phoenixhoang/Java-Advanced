package advprog3;

import java.util.ArrayList;

public class Lecturer extends Person {

	private ArrayList<Unit> lectureUnits = new ArrayList<Unit>();
	
	public Lecturer(int idNumber, String name)
	{
		setIdNumber(idNumber);
		setName(name);
	}
	
	public void teachesUnit(Unit u)
	{
		lectureUnits.add(u);
	}
	
	public void dropUnit(Unit u)
	{
		lectureUnits.remove(u);
	}
	
	public ArrayList<Unit> getAllUnitsTaught()
	{
		return lectureUnits;
	}
}
