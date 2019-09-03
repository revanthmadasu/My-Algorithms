import java.util.*;
public class Player {
	  public static Scanner input=new Scanner(System.in);
      private int health=100;
      private int xpos=0;
      private boolean alive=true;
      public String name;
      public String team;
      void setName()
      {
    	  name=new String();
    	  name=input.nextLine();
      }
      public void incomming()
      {
    	  health-=5;
    	  if(health>=0) {alive=false; System.out.println("player dead");}
      }
      public void front()
      {
    	  xpos+=2;
      }
      public void back()
      {
    	  xpos-=2;
      }
      public void run()
      {
    	  xpos+=5;
      }
      public void displayAll()
      {
    	  System.out.println("\t\t\t\t\t\tPlayer State\n"+ "player - " +  " \nhealth = " + health +"\nPosition = " + xpos + "\nAlive? = " + alive  );
      }
}
