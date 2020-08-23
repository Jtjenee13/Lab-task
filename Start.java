package bank;

public class Start {

	public static void main(String[] args) {
try {
	Account ac1[]=new Account[5];
	ac1[1]=new Account(34,"bnml",20000);
ac1[1].show();
ac1[2]=new Account(34,"bnml",20000);
ac1 [2].deposit(500);
ac1[2].show();
ac1[3]=new Account(34,"bnml",20000);
ac1 [3].withdraw(1000);
ac1 [3].show();
ac1[6]=new Account(34,"bnml",20000);
ac1[6].show();
}
catch(Exception e) {
	System.out.println(e);
	System.out.println("Exception caught");
}
finally {
	
}
		
	}

}
