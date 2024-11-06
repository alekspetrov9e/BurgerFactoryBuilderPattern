package de.tum.cit.aet.pse;

import de.tum.cit.aet.pse.buildables.Builder;
import de.tum.cit.aet.pse.buildables.Burger;
import de.tum.cit.aet.pse.buildables.burgeringredients.*;

public class BurgerRestaurant {

	// TODO 5: Implement the methods in the BurgerRestaurant class.

	public void buildStandardBeefBurger(Builder<Burger> burgerBuilder) {
		burgerBuilder.reset()
				.addPatty(Patty.BEEF_PATTY)
				.addBun(Bun.BRIOCHE_BUN)
				.addOnion(Onion.CARAMELIZED_ONION)
				.addTomato(Tomato.BEEFSTEAK_TOMATO)
				.addLettuce(Lettuce.ICEBERG_LETTUCE)
				.addPickle(Pickle.CORNICHON)
				.addCheese(Cheese.AMERICAN_CHEESE)
				.addSauce(Sauce.KETCHUP);
	}

	public void buildSpecialBeefBurger(Builder<Burger> burgerBuilder) {
		burgerBuilder.reset()
				.addPatty(Patty.BEEF_PATTY)
				.addPatty(Patty.BEEF_PATTY)
				.addBun(Bun.SESAME_BUN)
				.addOnion(Onion.CARAMELIZED_ONION)
				.addTomato(Tomato.BEEFSTEAK_TOMATO)
				.addLettuce(Lettuce.ROMAINE_LETTUCE)
				.addPickle(Pickle.SPICY_SOUR_PICKLE)
				.addCheese(Cheese.BRIE_CHEESE)
				.addCheese(Cheese.CHEDDAR_CHEESE)
				.addSauce(Sauce.MAYO)
				.addSauce(Sauce.KETCHUP)
				.addSauce(Sauce.BBQ_SAUCE);
	}

	public void buildStandardChickenBurger(Builder<Burger> burgerBuilder) {
		burgerBuilder.reset().addPatty(Patty.CHICKEN_PATTY).addOnion(Onion.DEEP_FRIED_ONION)
				.addTomato(Tomato.CHERRY_TOMATO).addBun(Bun.CIABATTA_BUN).addLettuce(Lettuce.GREEN_LEAF_LETTUCE)
				.addPickle(Pickle.FULL_SOUR_PICKLE).addCheese(Cheese.GOUDA_CHEESE).addSauce(Sauce.YELLOW_MUSTARD)
				.addSauce(Sauce.CHIMICHURRI_SAUCE);
	}

}
