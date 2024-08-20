import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String uname="anitha@gmail.com";
        String pwd="12345";
        System.out.print("Welcome to Github");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username");
        String uname1=sc.next();
        System.out.print("Enter password");
        String pwd1=sc.next();
        if(uname.equals(uname1)&&pwd.equals(pwd1)) {
        	System.out.print("Login Successfull");
        }
        else {
        	System.out.print("Login Failed");
        }
	}

}
