package org.example;

/**
 * @author Andmz
 *
 * Genric class of a coal-fired oven
 */

public class Oven {
    public Integer Length;
    public Integer Width;
    public String status;  // is on or off

    private Integer ammount_coal;
    private Integer cost;

    protected Integer temperature;
    protected boolean cooked_food;

    // Methods

    /**
     * This method turn on the oven.
     */
    public void turn_on()
    {
        System.out.println("Is On");
    };

    /**
     * this method turn off the oven.
     */

    public void turn_off()
    {
        System.out.println("Is off")
    ;}

    /**
     * This method is applied when the oven is turned on and
     * the coal is consumed.
     */

    private void consume_coal()
    {
        System.out.println("We use coal!");
    }

    /**
     * this method open the smokestack so that the smoke comes out.
     */
    private void open_smokestack()
    {
        System.out.println("Opening smokestack");
    }

    /**
     * This method notifies when the food is ready.
     */
    protected void done()
    {
        System.out.println("food done!");
    }

    /**
     * This method notifies you when you Burned the food.
     */
    protected void alerta()
    {
        System.out.println("the food got burned :(");
    }



}