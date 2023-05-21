package advprog3;

public class Goldfish extends Pet {

	public Goldfish(String name, int age, double cost)
	{
		setName(name);
		setAge(age);
		setCost(cost);
	}
	
	@Override
	public void makeNoise()
	{
		super.makeNoise();
		System.out.println("They're a goldfish!");
	}
	
	
}
