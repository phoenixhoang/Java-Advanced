package advprog1;

public class UnitMark {
	//members
	int mark1, mark2;
		
	//Constructor
	UnitMark (int mark1, int mark2)
	{
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	float calculateUnitMark()
	{
		float aveMark, weightPercent1, weightPercent2, weight1, weight2;
		
		weightPercent1 = 50;
		weightPercent2 = 50;
		weight1 = (weightPercent1 / 100);
		weight2 = (weightPercent2 / 100);
			
		aveMark = ((mark1 * weight1) + (mark2 * weight2));
		return aveMark;
	}
		
	String calculateUnitClassification()
	{
		String unitClassification;
		float aveMark;
		aveMark = calculateUnitMark();
		
		if (aveMark > 70)
			unitClassification = "I";
		else if (aveMark > 60 && aveMark <= 70)
			unitClassification = "II(I)";
		else if (aveMark > 50 && aveMark <= 60)
			unitClassification = "II(II)";
		else if (aveMark > 40 && aveMark <= 50)
			unitClassification = "III";
		else
			unitClassification = "Fail";
			
		return unitClassification;
	}
		
	void Display()
	{
		System.out.println("Marks: " + mark1 + " and " + mark2);
		System.out.println("Average Mark: " + this.calculateUnitMark());
		System.out.println("Unit Grade: " + this.calculateUnitClassification());
	
	}
		
}
