package advprog1;

import java.util.ArrayList; //import ArrayList Class


public class Student {
	//members
	String name;
	float aveMark1, aveMark2, aveGrade;
	ArrayList <UnitMark> unitMarkList;
	int assessmentNumber = 0;
	
	//Constructor
	Student (String name)
	{
		this.name = name;
		unitMarkList = new ArrayList<UnitMark>();
	}
	
	void setMarks(UnitMark member)
	{
		unitMarkList.add(member);
		assessmentNumber++;
	}
	
	float calculateOverallGrade()
	{
		int totalMark1 = 0;
		int totalMark2 = 0;
		
		for (UnitMark member: unitMarkList)
		{
			totalMark1 = totalMark1 + member.mark1;
			totalMark2 = totalMark2 + member.mark2;
		}
		
		aveMark1 = (float) totalMark1 / assessmentNumber;
		aveMark2 = (float) totalMark2 / assessmentNumber;
		aveGrade = (aveMark1 + aveMark2) / 2.0f;
		
		return aveGrade;
	}
	
	void Display()
	 {
		 System.out.println("Student Name: " + this.name);
		 //for each student Member in studentList
		 for (UnitMark member : unitMarkList)
		 {
			 member.Display();
		 }
		 System.out.println("Average Mark: " + this.aveGrade);
	 }
}
