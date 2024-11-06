package de.tum.cit.aet.pse;


import de.tum.cit.aet.pse.buildables.Burger;
import de.tum.cit.aet.pse.buildables.BurgerBuilder;
import de.tum.cit.aet.pse.buildables.IngredientsList;
import de.tum.cit.aet.pse.buildables.IngredientsListBuilder;

public final class Client {
	private Client() {
	}

	public static void main(String[] args) {

		// You can uncomment the following code in order to test your implementation.
    	
		/*
        BurgerRestaurant burgerRestaurant = new BurgerRestaurant();

		BurgerBuilder burgerBuilder = new BurgerBuilder();
		burgerRestaurant.buildStandardBeefBurger(burgerBuilder);
		Burger burger = burgerBuilder.getResult();

		System.out.println("You have selected the following Burger: " + burger.toString());

		IngredientsListBuilder ingredientsListBuilder = new IngredientsListBuilder();
		burgerRestaurant.buildSpecialBeefBurger(ingredientsListBuilder);
		IngredientsList specBurgeringreList = ingredientsListBuilder.getResult();

		System.out.println("You have selected the following Burger: " + specBurgeringreList.toString());

		burgerRestaurant.buildStandardChickenBurger(burgerBuilder);
		Burger chickenBurger = burgerBuilder.getResult();

		System.out.println("You have selected the following Burger: " + chickenBurger.toString());
		*/

	}
}
