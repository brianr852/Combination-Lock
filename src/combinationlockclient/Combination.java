/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinationlockclient;

/**
 * Combination - A service class that handles one combination number for the CombinationLock class.
 *
 * @author Brian Radomski
 * @version 08/13/2014
 */
public class Combination
{
    private int secretValue;     // the desired dial value for the combination number
    private int secretTurn;      // the desired turn value for the combination number

    private int currentValue;    // indicates the current dial value for the combination number
    private int currentTurn;     // indicates if the dial was turned to left or right for the combination number

    public static final int LEFT = 0;
    public static final int RIGHT = 1;

    /**
     * Secondary constructor
     *
     * @param secretValue
     * @param secretTurn
     */
    public Combination(int secretValue, int secretTurn)
    {
        // YOUR CODE GOES HERE
      this.secretValue = secretValue;
      this.secretTurn = secretTurn;
    }

    /**
     * Responsible for turning the dial, calls either turnRight or turnLeft method
     *
     * @param dial      the current dial value
     * @param noOfTicks the number of ticks to turn the dial
     * @param turn      the direction to turn the dial
     * @return the updated currentValue of the dial
     */
    public int turn(int dial, int noOfTicks, int turn)
    {
        // YOUR CODE GOES HERE
        this.currentValue = dial;
        this.currentTurn = turn;
        if(this.currentTurn == this.LEFT)
        {
            turnLeft(noOfTicks);
        }
        else
        {
            turnRight(noOfTicks);
        }

        return this.currentValue;  // THIS IS A STUB
    }

    /**
     * Increases the currentValue of the dial by the noOfTicks. Rolls over if needed.
     */
    private void turnRight(int noOfTicks)
    {
        // YOUR CODE GOES HERE
        this.currentValue += noOfTicks;
        if(this.currentValue > CombinationLock.MAX_VALUE)
        {
            this.currentValue -= (CombinationLock.MAX_VALUE + 1);
        }
    }

    /**
     * Decreases the currentValue of the counter by the noOfTicks. Rolls over if needed.
     */
    private void turnLeft(int noOfTicks)
    {
        // YOUR CODE GOES HERE
        this.currentValue -= noOfTicks;
        if(this.currentValue < 0)
        {
            this.currentValue += (CombinationLock.MAX_VALUE + 1);
        }
    }

    /**
     * sets the   currentValue to 0 and currentTurn to LEFT
     */
    public void reset()
    {
        // YOUR CODE GOES HERE
        this.currentValue = 0;
        this.currentTurn = this.LEFT;

    }

    /**
     * @return true if the combination number is in the desired state
     */
    public boolean correct()
    {
        // YOUR CODE GOES HERE
        return this.currentValue == this.secretValue && this.currentTurn == this.secretTurn; // THIS IS A STUB

    }

    /**
     * @param other the Combination object to test against for equality
     * @return true if both objects are in the same state
     */
    public boolean equals(Combination other)
    {
        // YOUR CODE GOES HERE
        return this.secretValue == other.secretValue && this.secretTurn == other.secretTurn &&
                this.currentValue == other.currentValue && this.currentTurn == other.currentTurn &&
                this.LEFT == other.LEFT && this.RIGHT == other.RIGHT; // THIS IS A STUB
    }

    /**
     * @return String representation of the secretValue and secretTurn
     */
    public String getSecretValueAndTurn()
    {
        return " " + this.secretValue;  // THIS IS A STUB
    }

    /**
     * @return String representation of the currentValue and currentTurn
     */
    public String getCurrentValueAndTurn()
    {
        return " " + this.currentValue;  // THIS IS A STUB
    }
}