package de.tum.cit.aet.pse.buildables;

import de.tum.cit.aet.pse.buildables.burgeringredients.*;

public interface Builder<T> {


    public Builder<T> addPatty(Patty patty);

    public Builder<T> addBun(Bun bun);

    public Builder<T> addLettuce(Lettuce lettuce);

    public Builder<T> addTomato(Tomato tomato);

    public Builder<T> addOnion(Onion onion);

    public Builder<T> addPickle(Pickle pickle);

    public Builder<T> addCheese(Cheese cheese);

    public Builder<T> addSauce(Sauce sauce);

    public Builder<T> reset();

    public T getResult();

    // TODO 1: Implement the Builder interface. Make sure that the Builder interface has a generic type parameter T.

    // TODO 4: Implement the reset() method, which resets the Builder to the initialization state.

}
