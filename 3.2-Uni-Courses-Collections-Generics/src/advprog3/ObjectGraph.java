package advprog3;

import java.util.ArrayList;

public class ObjectGraph {

	Lecturer kris = new Lecturer(1234, "Kris");
	Lecturer david = new Lecturer(3456, "David");
	Lecturer nick = new Lecturer(5678, "Nick");
	Lecturer darren = new Lecturer(7890, "Darren");

	Unit advProg = new Unit("Advanced Programming", kris);
	Unit algAndDS = new Unit("Algorithms and Data Structures", david);
	Unit prog = new Unit("Programming", david);
	Unit entProg = new Unit("Enterprise Programming", nick);
	Unit softEngMet = new Unit("Software Engineering Methodologies", darren);
	Unit introMT = new Unit("Introduction to Matthew-Taming", darren);

	Student student1 = new Student(191234, "Mohammed");
	Student student2 = new Student(192345, "Soufiene"); 
	Student student3 = new Student(193456, "Matthew"); 
	Student student4 = new Student(194567, "Majdi"); 
	Student student5 = new Student(195678, "Huw"); 
	Student student6 = new Student(196789, "Bob"); 
	Student student7 = new Student(197890, "Elaine"); 
	Student student8 = new Student(198901, "Annabel");
	Student student9 = new Student(199012, "Susan");
	
	ArrayList<Unit> units = new ArrayList<Unit>();
	
	public ObjectGraph()
	{
		units.add(advProg);
		units.add(algAndDS);
		units.add(prog);
		units.add(entProg);
		units.add(softEngMet);
		units.add(introMT);
		
		kris.teachesUnit(advProg);
		david.teachesUnit(algAndDS);
		david.teachesUnit(prog);
		nick.teachesUnit(entProg);
		darren.teachesUnit(softEngMet);
		darren.teachesUnit(introMT);
		
		student1.takesUnit(prog);
		student1.takesUnit(algAndDS);
		
		student2.takesUnit(advProg);
		student2.takesUnit(prog);
		
		student3.takesUnit(algAndDS);
		student3.takesUnit(prog);
		
		student4.takesUnit(softEngMet);
		student4.takesUnit(entProg);
		
		student5.takesUnit(entProg);
		student5.takesUnit(introMT);
		
		student6.takesUnit(introMT);
		student6.takesUnit(entProg);
	
		student7.takesUnit(prog);
		student7.takesUnit(entProg);
		
		student8.takesUnit(algAndDS);
		student8.takesUnit(advProg);
		
		student9.takesUnit(introMT);
		student9.takesUnit(advProg);
		
		
	}
	
	//Test 1
	public String printStudentUnits(Student name)
	{
		ArrayList<Unit> unitsTakenList = name.getAllUnitsTaken();
		String unitsTaken = ("");
		for (int i = 0; i < unitsTakenList.size(); i++)
		{
			unitsTaken = unitsTakenList.get(i).getTitle() + " / " + unitsTaken;
		}
		
		return unitsTaken;
	}

	//Test 2
	public String printStudentsTaught(Lecturer name)
	{
		ArrayList<Unit> unitsTaughtList = name.getAllUnitsTaught();
		String unitsTaught = ("");
		for(int i = 0; i < unitsTaughtList.size(); i++)
		{
			for(int j = 0; j < unitsTaughtList.get(i).getStudentList().size(); j++)
			{
				unitsTaught = unitsTaught + " " + unitsTaughtList.get(i).getStudentList().get(j).getName();
			}
		}
		
		return unitsTaught;
	}

	//Test 3
	public String unitsMoreTwoStudents()
	{
		String unitsMultipleStudents = ("");
		String space = (" ");
		for (Unit unit: units)
		{
			if (unit.getStudentList().size() < 2)
			{
				unitsMultipleStudents = unit.getTitle() + space + unitsMultipleStudents;
			}
		}
		return unitsMultipleStudents;
	}
	
	//Test 4
	public String notTaughtBy(Lecturer name1, Lecturer name2)
	{
		ArrayList<Unit> unitTaught1 = name1.getAllUnitsTaught();
		ArrayList<Unit> unitTaught2 = name2.getAllUnitsTaught();
		unitTaught1.addAll(unitTaught2);
		
		//ArrayList<Person> fortunateStudents = new ArrayList<Person>();
		ArrayList<Person> unfortunateStudents = new ArrayList<Person>();
		
		String notTaughtByLecturers = ("");
		
			
			for (int j = 0; j < unfortunateStudents.size(); j++)
			{
				notTaughtByLecturers = unfortunateStudents.get(j).getName() + " / ";
			}
			
			return notTaughtByLecturers;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
