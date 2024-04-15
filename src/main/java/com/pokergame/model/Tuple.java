package com.pokergame.model;

/**
 * Represents a tuple, a data structure that can hold two elements.
 *
 * @param <X> the type of the first element
 * @param <Y> the type of the second element
 */
public class Tuple<X, Y> {
    public final X x;
    public final Y y;

    /**
     * Constructs a Tuple with the specified elements.
     *
     * @param x the first element
     * @param y the second element
     */
    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }
}
