package org.example;

public class Land_vehicle {

    // Attributes
    public String model;  // model car
    public String mark;
    public Integer year;

    private Integer engine_serial ;  // Engine Serial Number
    private String engine_type;  // combustion or electric

    protected Integer mileage;  // mileage traveled by the car
    protected String gearbox;  // gearbox types
    protected String owner;

    //Methods

    /**
     * Warns if the car starts the engine
     */
    public void start_engine()
    {System.out.println("RRRRUM");}

    /**
     * Warns when you turn left when driving
     */
    public void  turn_right()
    { System.out.println("imma turn right");}

    /**
     * Warns when you increase speed
     */
    public void speed_up()
    { System.out.println("As fast as lighting mcqueen");}


    /**
     * Lights up when something is wrong with the car
     */
    private void ckeck_in_light()
    { System.out.println(" ckeck?"); }

    /**
     * Generate a code to know what the error is
     */
    private void error_code()
    { System.out.println("404 NOT FOUND"); }

    /**
     * Drift action
     */
    protected void drift()
    { System.out.println("Tokyo drift u know, like fast and furious");}

    /**
     * Turn on the high beams of the car
     */
    protected void turn_on_high_lights()
    {System.out.println("High lights on"); }

}
