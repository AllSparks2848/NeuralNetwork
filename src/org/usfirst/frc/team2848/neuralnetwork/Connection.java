
package org.usfirst.frc.team2848.neuralnetwork;

/**
 * Represents a connection between two {@link Neuron}s, and holds a weight and
 * its delta.
 * 
 * 
 */
public class Connection {

    /**
     * The weight of this connection.
     */
    public double weight = Math.random();
    /**
     * The change in the weight from the last time it was updated. This is used
     * for momentum calculation.
     */
    public double deltaWeight = 0;
    
    public void reset() {
        weight = Math.random();
        deltaWeight = 0;
    }
}
