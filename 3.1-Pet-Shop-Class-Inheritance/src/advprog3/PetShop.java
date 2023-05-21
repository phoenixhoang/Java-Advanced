package advprog3;

public class PetShop {
	
	private Pet[] petsInShop;
	
	public PetShop()
	{
		Cat cat1, cat2, cat3;
		Dog dog1, dog2, dog3;
		Goldfish fish1, fish2, fish3, fish4;
		
		cat1 = new Cat ("Yuumi", 2, 70);
		cat2 = new Cat ("Espeon", 1, 120);
		cat3 = new Cat ("Glameow", 3, 90);
		dog1 = new Dog ("Arcanine", 3, 500);
		dog2 = new Dog ("Zorua", 1, 450);
		dog3 = new Dog ("Poochyena", 1, 250);
		fish1 = new Goldfish ("Magikarp", 1, 10);
		fish2 = new Goldfish ("Goldeen", 2, 15);
		fish3 = new Goldfish ("Feebas", 1, 5);
		fish4 = new Goldfish ("Finneon", 1, 15);
		
		Pet[] petsInShop = {cat1, cat2, cat3, dog1, dog2, dog3, fish1, fish2, fish3, fish4};
		
		setPetsInShop(petsInShop);
	}
	
	public void setPetsInShop(Pet[] pis)
	{
		this.petsInShop = pis;
	}
	
	public Cat buyCat()
	{
		try 
		{
			Pet cat = buyPet("Cat");
			System.out.println(cat.getName() + " has been bought.");
			return (Cat) cat;
		}
		catch(NullPointerException e)
		{
			return null;
		}
		
	}
	
	public Dog buyDog()
	{
		try 
		{
			Pet dog = buyPet("Dog");
			System.out.println(dog.getName() + " has been bought.");
			return (Dog) dog;
		}
		catch(NullPointerException e)
		{
			return null;
		}
		
	}
	
	public Goldfish buyGoldfish()
	{
		try 
		{
			Pet goldfish = buyPet("Goldfish");
			System.out.println(goldfish.getName() + " has been bought.");
			return (Goldfish) goldfish;
		}
		catch(NullPointerException e)
		{
			return null;
		}
		
	}
	
	public Pet buyPet(String pet)
	{
		for (int i = 0; i < 10; i++)
		{
			try 
			{
				if (petsInShop[i].getClass().getName().toString().contains(pet))
				{
					Pet x = petsInShop[i];
					petsInShop[i] = null;
					return x;
			
				}
			}
			catch(NullPointerException e) {}
		}
		return null;
	}
	
	public Pet buyPetByCost(double money)
	{
		Pet best = null;
		double bestCost = 0;
		
		for(int i = 0; i < petsInShop.length; i++)
		{
			if (petsInShop[i].getCost() <= money && petsInShop[i].getCost() > bestCost)
			{
				bestCost = petsInShop[i].getCost();
				best = petsInShop[i];
				System.out.println(best);
			}
		}
		
		return best;
	}
	
	/*
	public Strokeable[] getAllStrokeable()
	{
		Strokeable[] strokeables = new Strokeable[10];
		for (int i = 0; i < petsInShop.length; i++)
		{
			strokeables[i] = (Strokeable) petsInShop[i];
		}
	}
	*/
}
	
