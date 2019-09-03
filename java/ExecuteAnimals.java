
public class ExecuteAnimals {

	public ExecuteAnimals() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cat tom = new Cat();
        tom.getDetails();
        tom.display();
        System.out.println(tom.getClass());
        Animal tom1=new Cat();
        ((Cat) tom1).getDetails();
        ((Cat)tom1).display();
        System.out.println(((Cat)tom1).getClass());
        System.out.println(((Cat)tom1).favFood);
	}

}
