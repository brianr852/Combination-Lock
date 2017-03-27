/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinationlockclient;

/**
 * CombinationLock - A service class that implements the CombinationLock functionality.
 *
 * @author Brian Radomski
 * @version 08/13/2014
 */
public class CombinationLock
{
    private int dial;
    private Combination combination1;
    private Combination combination2;
    private Combination combination3;
    public static final int MAX_VALUE = 39;

    /**
     * The secondary constructor for objects of class CombinationLock.
     * Throws an exception if the value is greater than the maximum allowed
     */
    public CombinationLock(int secret1, int secret2, int secret3) throws CombinationLockInitializationException
    {
        this.combination1 = new Combination(secret1, Combination.RIGHT);
        this.combination2 = new Combination(secret2, Combination.LEFT);
        this.combination3 = new Combination(secret3, Combination.RIGHT);

    }

    /**
     * Calls turn method to turn the dial for each number
     *
     * @param noOfTicks1 number of ticks for the first combination number
     * @param turn1      direction to turn the dial for the first combination number
     * @param noOfTicks2 number of ticks for the second combination number
     * @param turn2      direction to turn the dial for the second combination number
     * @param noOfTicks3 number of ticks for the third combination number
     * @param turn3      direction to turn the dial for the third combination number
     */
    public void turnTheDial(int noOfTicks1, int turn1, int noOfTicks2, int turn2, int noOfTicks3, int turn3) {
        // YOUR CODE GOES HERE
        reset();
        this.dial = this.combination1.turn(this.dial, noOfTicks1, turn1);
        this.dial = this.combination2.turn(this.dial, noOfTicks2, turn2);
        this.dial = this.combination3.turn(this.dial, noOfTicks3, turn3);
        System.out.print("Turning the dial " + noOfTicks1 + " times to the right, " +
                noOfTicks2 + " times to the left, " + noOfTicks3 + " times to the right " + '\n');
    }

    /**
     * Checks if the Combination lock is open
     *
     * @return true if the correct() for each number returns true
     *         false otherwise
     */
    public boolean open()
    {
        // YOUR CODE GOES HERE
        return this.combination1.correct() && this.combination2.correct()
                && this.combination3.correct(); // THIS IS A STUB
    }

    /**
     * Determines if two CombinationLock objects are in the same state
     *
     * @param other the CombinationLock object to test against for equality
     * @return true if both objects are in the same state
     */
    public boolean equals(CombinationLock other)
    {
        // YOUR CODE GOES HERE
        return this.dial == other.dial && this.combination1.equals(other.combination1) &&
                this.combination2.equals(other.combination2) && this.combination3.equals(other.combination3) &&
                this.MAX_VALUE == other.MAX_VALUE;
    }

    /**
     * resets dial to 0 and each combination number to its default state
     */
    public void reset()
    {
        // YOUR CODE GOES HERE
        this.dial = 0;
        this.combination1.reset();
        this.combination2.reset();
        this.combination3.reset();
    }

    /**
     * @return String containing the current values of the CombinationLock object
     *         including the secret values.
     */
    public String toString()
    {
        // YOUR CODE GOES HERE

        return "The dial is set to " + this.dial + " with combination of: " + this.combination1.getCurrentValueAndTurn() + " "
                + this.combination2.getCurrentValueAndTurn() + " " + this.combination3.getCurrentValueAndTurn() + '\n' +
                " The lock combination is " + this.combination1.getSecretValueAndTurn() + " "
                + this.combination2.getSecretValueAndTurn() + " " + this.combination3.getSecretValueAndTurn();
                 // THIS IS A STUB


    }
}