package org.example;

/**
 * @author Andmz
 */

public class Cell_LG {
    // Attributes
    /**
     * Description of a generic LG brand cell phone
     */
    public String model;
    public String color;
    public Integer Length;
    public Integer Width;

    /**
     * All LG have these attributes of origin
     */
    private String made_in = "Seul" ;
    private String screem = "Amoled";
    private Integer spotlights_on_camera = 8;

    /**
     * attributes only used by this class
     */
    protected Integer cell_number;
    protected String operatin_system;
    protected String owner;

    //Methods

    /**
     * ringtone when calling
     */
    public void call()
    {System.out.println("biiiit biiiiiit bit");}

    /**
     * open music app and play music
     */
    public void  PLay_Music()
    { System.out.println("Opening library ");}

    /**
     * Open instagram app
     */

    public void Instagram()
    { System.out.println("Opening Instagram");}

    /**
     * In camara autofocus
     */
    private void autofocus()
    { System.out.println("pleas wait a minute. We are focusing on your camare "); }

    /**
     *
     the processor and ram will give priority to the selected game. In this
     case Call Of Dutty
     */
    private void super_game()
    { System.out.println("all resources directed to COD"); }

    /**
     * this command updates all apps
     */
    protected void update_app()
    { System.out.println("all apps updating");}

    /**
     * show a QR code for anything
     */
    protected void display_QR_code()
    {System.out.println("Here is your QR code"); }

}