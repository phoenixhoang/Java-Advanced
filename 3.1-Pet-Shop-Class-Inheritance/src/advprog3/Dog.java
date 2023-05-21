package advprog3;

public class Dog extends Pet implements Strokeable {
	
	public Dog(String name, int age, double cost)
	{
		setName(name);
		setAge(age);
		setCost(cost);
	}
	
	@Override
	public void makeNoise()
	{
		System.out.println(getName() + ": Woof!");
	}
	
	@Override
	public void stroke()
	{
		System.out.println(getName() + " enjoys being stroked.");
	}
}
