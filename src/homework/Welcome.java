package homework;

public class Welcome {
	public static void main (String[] args) {
	
	String[] strArr = new String [3];
	
	strArr[0] = "homework.Welcome to Core Java";
	strArr[1] = "by Cay Hortsmann";
	strArr[2] = "and Gray Cornell";

	for (String g : strArr)
		System.out.println(g);
	
	}
}