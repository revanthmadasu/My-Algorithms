import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
public class ExecuteMonster 
{
	public static void main(String args[])
	{
		MonsterTwo.buildBattleBoard();
		MonsterTwo Monsters[] = new MonsterTwo[4];
		Monsters[0]=new MonsterTwo(1000, 20, 1, "Frank");
		Monsters[0]=new MonsterTwo(500, 40, 2, "Drac");
		Monsters[0]=new MonsterTwo(1000, 20, 1, "Paul");
		Monsters[0]=new MonsterTwo(1000, 20, 1, "George");
		MonsterTwo.redrawBoard();
		for (MonsterTwo m : Monsters)
		{
			 if(m.getAlive())
			 {
				 int arrayItemIndex = ArrayUtils.indexOf(Monsters, m);
				 m.moveMonster(Monsters, arrayItemIndex);
			 }
		}
		MonsterTwo.redrawBoard();
	}
}
