package advprog3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			PetShop ps = new PetShop();
			Cat cat1 = ps.buyCat();
			Cat cat2 = ps.buyCat();
			Dog dog1 = ps.buyDog();
			Dog dog2 = ps.buyDog();
			Goldfish fish1 = ps.buyGoldfish();
			Pet s = ps.buyPetByCost(90);
		}
		catch(NullPointerException e)
		{
			System.out.println("Sincerest apologies. There are no pets at our shop which meet your criteria.");
		}
	}

}
