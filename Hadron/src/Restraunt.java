import java.util.HashMap;
import java.util.Scanner;

public class Restraunt {
	public static void main(String[] args) {
		HashMap<String, Integer> hs = new HashMap<>();

		String[] items = new String[] { "Chicken Masala", "Chicken Curry", "Chicken Lollipop", "Chilli Chicken",
				"Egg Bhurji", "Egg Omelette", "Panneer Masala", "Palak Paneer", "Mix Veg", "Mushroom Curry",
				"Butter Naan", "Laccha Paratha", "Roti" };
		int[] rate = new int[] { 80, 70, 80, 75, 60, 40, 70, 70, 50, 65, 15, 10, 5 };
		for (int i = 0; i < items.length; i++) {
			hs.put(items[i], rate[i]);
			System.out.println(i + 1 + "." + items[i] + "\t\t" + rate[i]);
		}

		String choice = "";
		int sum = 0;
		while (true) {
			System.out.println("Enter your order");
			Scanner sc = new Scanner(System.in);
			String order = sc.nextLine();
			sum = sum + hs.get(order);
			System.out.println("Do you want to order more items");
			choice = sc.nextLine();
			if (choice.equalsIgnoreCase("no"))
				break;
		}
		System.out.println("Your Order has been processed Successfully!");
		System.out.println("Your billing amount is :- " + sum);
	}

}
