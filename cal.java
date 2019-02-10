import java.util.Scanner;
public class cal{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
	    float new_numb1= scan.nextFloat();
		float new_numb2= scan.nextFloat();
		System.out.println("Enter your choice for operation");
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println(".Mul");
		System.out.println("Divide");
		System.out.println("Modulo");

		System.out.println("Enter your choice");
		int choice= scan.nextInt();
		switch(choice){
			case 1:
			float add;
			add= new_numb1+new_numb2;
			System.out.println("Addition is:"+add);
			 break;
			  case 2:
			  float sub;
			  if(new_numb1>=new_numb2){
			  	sub= new_numb1-new_numb2;
			  	System.out.println("Subtraction is"+sub);

			  }	
			  else{
			  sub=new_numb1-new_numb2;
			  System.out.println("Subtraction is"+sub);
			}
			break;
			case 3:
			float mul= new_numb1*new_numb2;
			System.out.println("MultiplicATION is"+mul);
			break;


		}

	}
}