/* We seperated the main class from the rest of the files so we can mainly follow the Open Close principle.
Since we will be mostly making modifications to other files, we kept this file seperate from others so that
it is still open to modifications if needed. Since this files modification may depend on many factors then we
may not be able to apply the single responsilbity principle here. Interface Segregation does not apply to this file*/

package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

//import threesolid.IWorker;


public class Main
{   

   public static Manager tsManager = new Manager();

   // The entry main() method
   public static void main(String[] args) 
   {
 
      try 
      {
         System.out.format("Starting ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

            try 
      {
         System.out.format("Stopping ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

      System.exit(0);

   }
 }

 