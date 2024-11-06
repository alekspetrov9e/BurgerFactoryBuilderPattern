package de.tum.cit.aet.pse.buildables;

import de.tum.cit.aet.pse.buildables.burgeringredients.*;

public class BurgerBuilder implements Builder<Burger> {
    private Burger burger;
    public BurgerBuilder() {
        burger = new Burger();
    }
    @Override
    public Builder<Burger> addPatty(Patty patty) {
        if (burger.getBurgerPatty1() == null) {
            burger.setBurgerPatty1(patty);
        } else if (burger.getBurgerPatty2() == null) {
            burger.setBurgerPatty2(patty);
        } else {
            throw new IllegalStateException("Only 2 patties are available.");
        }
        return this;
    }

    @Override
    public Builder<Burger> addBun(Bun bun) {
        this.burger.setBun(bun);
        return this;
    }

    @Override
    public Builder<Burger> addLettuce(Lettuce lettuce) {
        this.burger.setLettuce(lettuce);
        return this;
    }

    @Override
    public Builder<Burger> addTomato(Tomato tomato) {
        this.burger.setTomato(tomato);
        return this;
    }

    @Override
    public Builder<Burger> addOnion(Onion onion) {
        this.burger.setOnion(onion);
        return this;
    }

    @Override
    public Builder<Burger> addPickle(Pickle pickle) {
        this.burger.setPickle(pickle);
        return this;
    }

    @Override
    public Builder<Burger> addCheese(Cheese cheese) {
        if (burger.getCheese1() == null) {
            burger.setCheese1(cheese);
        } else if (burger.getCheese2() == null) {
            burger.setCheese2(cheese);
        } else {
            throw new IllegalStateException("You can only add up to 2 types of cheese.");
        }
        return this;
    }

    @Override
    public Builder<Burger> addSauce(Sauce sauce) {
        if (burger.getSauce1() == null) {
            burger.setSauce1(sauce);
        } else if (burger.getSauce2() == null) {
            burger.setSauce2(sauce);
        } else if (burger.getSauce3() == null) {
            burger.setSauce3(sauce);
        } else {
            throw new IllegalStateException("You can only add 3 sauces to your burger.");
        }
        return this;
    }

    @Override
    public Builder<Burger> reset() {
        this.burger = new Burger();
        return this;
    }

    @Override
    public Burger getResult() {
        return this.burger;
    }

    // TODO 2: Implement the BurgerBuilder class which provides a concrete implementation of the Builder interface.

}
