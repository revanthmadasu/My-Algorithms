
public class stringcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 382398482;
		String a1=Integer.toString(a);
		int b = Integer.parseInt(a1);
		System.out.println(a+" " + a1 + " " + b);
        float c = 84.4977f;
        String c1 = Float.toString(c);
        float c2 = Float.parseFloat(c1);
        System.out.println(c+" " + c1 + " " + c2);
        boolean d= true;
        String d1 = Boolean.toString(d);
        // int d2 = Boolean.toInt(d); this doesnt exist
        //int d2 = Integer.parseInt(d1); this gives error because in the string it has true and it cannot be represented in integers
        boolean d3 = Boolean.parseBoolean(d1);
        String d5 = "false";
        boolean d4 = Boolean.parseBoolean(d5);
        System.out.println(d+" " +d1+" "+d3+" "+ d5);
        
	}

}
