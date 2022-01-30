
public class Activity12 {

	public static void main(String[] args) {
		
		Addable ad = (num1,num2)-> num1+num2;
		System.out.println("addition is:" +ad.add(3, 5));
		
		//2nd Option
		
		Addable ad1 = (int num1, int num2)-> {return (num1+num2);};
		
		System.out.println("addition is:" +ad1.add(7, 8));
		

	}

}
