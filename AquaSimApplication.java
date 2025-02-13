import java.awt.Color;
import java.util.Random;

/** Aquarium Lab Series: <br>    
 *      The AquaSimApplication class contains the main function that will
 *      run the Aquarium Simulation. (This description should be updated
 *      when the behavior of the program changes.)<br>
 *
 * Modifications: <br>
 *   23 March 2008,  Alyce Brady,  Created skeleton main that constructs and
 *                                 displays an empty aquarium.<br>
 *   (date), (your name), Modified to .... <br>
 *
 *  @author  Alyce Brady  (should be Your Name)
 *  @version 23 March 2008  (should be today's date)
 *  @see AquariumController
 **/
public class AquaSimApplication
{
    /**
     *  This is the main function.  It executes the program.
     *  @param    String args[] is never used
     **/
    public static void main(String args[])
    {
        System.out.println("This will be an aquarium simulation.");

        // CONSTRUCT OBJECTS NEEDED FOR THE AQUARIUM SIMULATION.
        Random generator = new Random();
        int randNum;
        randNum = generator.nextInt(12);
        int randChange;
        randChange = generator.nextInt(4);
        
        // Construct the aquarium.  Specify its dimensions when creating it.
        Aquarium aqua;                 // create reference to an Aquarium ...
        aqua = new Aquarium(2000,2000);
        
        // ... object that has now been created

        // Construct fish and add them to the aquarium.
        //      CODE MISSING HERE!
        if (randNum == 0)
        {
            AquaFish fish = new AquaFish(aqua, Color.RED);
            aqua.add(fish);
            
        }
        else if (randNum>=1 && randNum<=3)
        {
            AquaFish fish = new AquaFish(aqua, Color.BLUE);
            aqua.add(fish);
        }
        else if (randNum == 4)
        {
            AquaFish fish = new AquaFish(aqua, Color.ORANGE);
            aqua.add(fish);
        }
        else if (randNum == 5)
        {
            AquaFish fish = new AquaFish(aqua, Color.YELLOW);
            aqua.add(fish);
        }
        else if (randNum>=6 && randNum <=10)
        {
            AquaFish fish = new AquaFish(aqua, Color.MAGENTA);
            aqua.add(fish);
        }
        else if (randNum == 11)
        {
            AquaFish fish = new AquaFish(aqua, Color.GREEN);
            aqua.add(fish);
        }
       
        
        AquaFish ghost = new AquaFish(aqua, Color.RED);
        aqua.add(ghost);
        AquaFish vicky = new AquaFish(aqua, Color.BLACK);
        aqua.add(vicky);
        AquaFish shamu = new AquaFish(aqua, Color.YELLOW);
        aqua.add(shamu);
        AquaFish crispy = new AquaFish(aqua, Color.MAGENTA);
        aqua.add(crispy);
        // Construct a graphical user interface (GUI) to display and control
        // the simulation.  The user interface needs to know about the
        // aquarium, so we pass aqua to the user interface constructor.
        AquaSimGUI aqoo;
        aqoo = new AquaSimGUI(aqua,true, true);
        AquaSimGUI userInterface;              // create reference to GUI ...
        userInterface = new AquaSimGUI(aqua);  // ... and then GUI itself

        // Tell the user how to start the aquarium simulation.
        System.out.println("Welcome to the fish-less aquarium! :)");

        // Now wait for the user to press the start button.
        aqoo.waitForStart();

        // Draw the initial view of the aquarium and its contents.
        aqoo.showAquarium();
        int steps = aqoo.getNumberOfSteps();
        int number = aqoo.getNumberOfFish();

        // RUN THE AQUARIUM SIMULATION.

        // Make the fish move and redisplay.
        //      CODE MISSING HERE!
     for (int i = 1; i<=number; i++)
     {
         int randNumb = generator.nextInt(12);
         if (randNumb == 0)
        {
            AquaFish fish = new AquaFish(aqua, Color.RED);
            aqua.add(fish);
            
        }
        else if (randNumb>=1 && randNumb<=3)
        {
            AquaFish fish = new AquaFish(aqua, Color.BLUE);
            aqua.add(fish);
        }
        else if (randNumb == 4)
        {
            AquaFish fish = new AquaFish(aqua, Color.ORANGE);
            aqua.add(fish);
        }
        else if (randNumb == 5)
        {
            AquaFish fish = new AquaFish(aqua, Color.YELLOW);
            aqua.add(fish);
        }
        else if (randNumb>=6 && randNumb <=10)
        {
            AquaFish fish = new AquaFish(aqua, Color.MAGENTA);
            aqua.add(fish);
        }
        else if (randNumb == 11)
        {
            AquaFish fish = new AquaFish(aqua, Color.GREEN);
            aqua.add(fish);
        }
        }
        for (int i = 1; i<=steps; i++)
        {
            randChange = generator.nextInt(4);
            ghost.moveForward();
            if (ghost.atWall()==true || randChange == 2)
            {
 
                ghost.changeDir();
                ghost.moveForward();
            }
            vicky.moveForward();
            if (vicky.atWall()==true || randChange ==3)
            {

                vicky.changeDir();
                vicky.moveForward();
            }
            shamu.moveForward();
            if (shamu.atWall()==true || randChange == 0)
            {
     
                shamu.changeDir();
                shamu.moveForward();
            }
            crispy.moveForward();
            if (crispy.atWall()==true || randChange == 0)
            {
     
                crispy.changeDir();
                crispy.moveForward();
            }
            
        aqoo.showAquarium();
    }
   


        // WRAP UP.

        // Remind user how to quit application.
        

        //end main
    aqoo.println ("Close GUI display window to quit.");
}//end class

}
