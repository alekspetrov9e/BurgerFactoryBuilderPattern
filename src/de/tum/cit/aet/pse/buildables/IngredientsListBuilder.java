package de.tum.cit.aet.pse.buildables;

import de.tum.cit.aet.pse.buildables.burgeringredients.*;

public class IngredientsListBuilder implements Builder<IngredientsList> {
    private IngredientsList ingredientsList;

    public IngredientsListBuilder() {
        ingredientsList = new IngredientsList();
    }

    @Override
    public Builder<IngredientsList> addPatty(Patty patty) {
        this.ingredientsList.addBurgerPatty(patty);
        return this;
    }

    @Override
    public Builder<IngredientsList> addBun(Bun bun) {
        this.ingredientsList.addBun(bun);
        return this;
    }

    @Override
    public Builder<IngredientsList> addLettuce(Lettuce lettuce) {
         this.ingredientsList.addLettuce(lettuce);
         return this;
    }

    @Override
    public Builder<IngredientsList> addTomato(Tomato tomato) {
        this.ingredientsList.addTomato(tomato);
        return this;
    }

    @Override
    public Builder<IngredientsList> addOnion(Onion onion) {
        this.ingredientsList.addOnion(onion);
        return this;
    }

    @Override
    public Builder<IngredientsList> addPickle(Pickle pickle) {
        this.ingredientsList.addPickle(pickle);
        return this;
    }

    @Override
    public Builder<IngredientsList> addCheese(Cheese cheese) {
        this.ingredientsList.addCheese(cheese);
        return this;
    }

    @Override
    public Builder<IngredientsList> addSauce(Sauce sauce) {
        this.ingredientsList.addSauce(sauce);
        return this;
    }

    @Override
    public Builder<IngredientsList> reset() {
        this.ingredientsList = new IngredientsList();
        return this;
    }

    @Override
    public IngredientsList getResult() {
        return this.ingredientsList;
    }

    // TODO 3: Implement the IngredientsListBuilder class which provides a concrete implementation of the Builder interface.

}
