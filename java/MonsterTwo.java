import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
public class MonsterTwo {
	static char[][] battleBoard = new char [10][10];
	static int numOfMonsters;
	static int maxXBoardSpace;
	static int maxYBoardSpace;
	public static void buildBattleBoard()
	{
		for(char[] t:battleBoard) Arrays.fill(t,'*');
	}
	public static void redrawBoard()
	{
		for(int i=0;i<30;i++) System.out.print('-');
		for(char[] t:battleBoard)
		{
			for(char t1:t) System.out.print('|'+t1+'|');
			System.out.println();
		}
		for(int i=0;i<30;i++) System.out.print('-');
		System.out.println();
	}
	public final String TOMBSTONE;
	private int health ;
    private int attack;
	private int movement ;
	private int xPosition ;
	private int yPosition ;
	private boolean alive ;
	public String name ;
	public char nameChar1;
	public int getAttack()
	   {
	       return attack;
	   }
	public int getHealth()
	{
	 return health;
    }
	public int getMovement()
	{
		return movement;
	}
    public void setHealth(int decreaseHealth)
	{
	  health=health-decreaseHealth;
	  if(health<0)
	   alive=false;
	}
	public void setHealth(double decreaseHealth)
	{
	  int t1 = (int)decreaseHealth;
	  health=health-t1;
	  if(health<0)
	   alive=false;
	}
	public boolean getAlive() { return alive; }
	public MonsterTwo(int health,int attack,int movement,String name)
	{
	 TOMBSTONE="Here Lies a Dead monster";
	 this.health=health;
	 this.attack=attack;
	 this.movement=movement;
	 xPosition = 0;
	 yPosition = 0;
	 alive = true;
	 this.name=name;
	 maxXBoardSpace=battleBoard.length-1;
	 maxYBoardSpace=battleBoard[0].length-1;
     int randNumX,randNumY;
     do
     {
    	 randNumX=(int)(Math.random()*maxXBoardSpace);
    	 randNumY=(int)(Math.random()*maxYBoardSpace);
     }while(battleBoard[randNumX][randNumY]!='*');
     this.xPosition=randNumX;
     this.yPosition=randNumY;
     this.nameChar1=this.name.charAt(0);
     battleBoard[this.yPosition][this.xPosition]=this.nameChar1;
     ++numOfMonsters;
	}
	public MonsterTwo()
	{
	 TOMBSTONE="Here Lies a Dead monster";
	 health =500;
	 attack = 20;
	 movement = 2;
	 xPosition = 0;
	 yPosition = 0;
	 alive = true;
	 name="Big Monster";
	 ++numOfMonsters;
	}
	 public void display()

	 {
	  System.out.println("Health= "+health+"\nAttack = "+attack+"\nMovement = "+movement);
	 }
	 public void moveMonster(MonsterTwo[] monster, int arrayItemIndex)
	 {
		 boolean isSpaceOpen = true;
		 while(isSpaceOpen)
		 {
			 int randMoveDirection = (int) (Math.random() * 4);
		        int randMoveDistance = (int) (Math.random() * (this.getMovement() + 1));
		        System.out.println(randMoveDistance + " " + randMoveDirection);
		        battleBoard[this.yPosition][this.xPosition] = '*';
		        if(randMoveDirection == 0)
		        {
		        	if((this.yPosition - randMoveDistance) < 0)
		        	{
		        		this.yPosition = 0;
		        	}  else {
		        		this.yPosition = this.yPosition - randMoveDistance;
		        	}
		        }else if(randMoveDirection == 1) {
		        	 if((this.xPosition + randMoveDistance) > maxXBoardSpace)
		        		 this.xPosition = maxXBoardSpace;
		        	 else this.xPosition = this.xPosition + randMoveDistance;
		        }else if (randMoveDirection == 2) {
		        	if((this.yPosition + randMoveDistance) > maxYBoardSpace)
		        		this.yPosition = maxYBoardSpace;
		        	else this.yPosition = this.yPosition + randMoveDistance;
		        }else {
		        	if((this.xPosition - randMoveDistance) < 0)
		        		this.xPosition = 0;
		        	else this.xPosition = this.xPosition - randMoveDistance;
		        }
		        for (int i = 0; i < monster.length; i++)
		        {
		        	 if (i == arrayItemIndex) continue;
		        	 if(onMySpace(monster, i, arrayItemIndex))
		        	 {
		        		 isSpaceOpen = true;
		        		 break;
		        	 }else isSpaceOpen=false;
		        	 
		        }
		 }
		 battleBoard[this.yPosition][this.xPosition] = this.nameChar1;  
	 }
	 public boolean onMySpace(MonsterTwo[] monster, int indexToChk1, int indexToChk2)
	 { 
		 if((monster[indexToChk1].xPosition==monster[indexToChk2].xPosition)&&(monster[indexToChk1].yPosition==monster[indexToChk2].yPosition)) return true;
		 else return false;
	 }
	 public static void main(String args[]){}
}
