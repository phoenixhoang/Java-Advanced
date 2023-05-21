package advprog3;

import java.util.ArrayList;

public class Student extends Person{

	private ArrayList<Unit> studentUnits = new ArrayList<Unit>();
	
	public Student(int idNumber, String name)
	{
		setIdNumber(idNumber);
		setName(name);
	}
	
	public void takesUnit(Unit u)
	{
		studentUnits.add(u);
		u.enrolStudent(this);
	}
	
	public void dropUnit(Unit unit)
	{
		studentUnits.remove(unit);
	}
	
	public ArrayList<Unit> getAllUnitsTaken()
	{
		return studentUnits;
	}
}
