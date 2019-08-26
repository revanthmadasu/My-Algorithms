public class Monster
{
 public final String TOMBSTONE;
 private int health ;
 private int attack;
 private int movement ;
 private int xPosition ;
 private int yPosition ;
 private boolean alive ;
 public String name ;
 public int getAttack()
    {
        return attack;
    }
 public int getHealth()
 {
  return health;
 }
 public void setHealth(int decreaseHealth)
 {
   health=health-decreaseHealth;
   if(health<0)
    alive=false;
 }
 public Monster(int health,int attack,int movement)
 {
  TOMBSTONE="Here Lies a Dead monster";
  this.health=health;
  this.attack=attack;
  this.movement=movement;
  xPosition = 0;
  yPosition = 0;
  alive = true;
  name="Big Monster";
 }
 public Monster()
 {
	 TOMBSTONE="Here Lies a Dead monster";
	 health =500;
	 attack = 20;
	 movement = 2;
	 xPosition = 0;
	 yPosition = 0;
	 alive = true;
	 name="Big Monster";
}
 public void display()
 {
  System.out.println("Health= "+health+"\nAttack = "+attack+"\nMovement = "+movement);
 }
} 
