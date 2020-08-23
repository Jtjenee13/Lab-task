package bank;

public class Account {
int accountNumber;
String accountHolderName;
double balance;
Account(){
	
}
Account(int accountNumber,String accountHolderName,double balance){
	this.accountNumber=accountNumber;
	this.accountHolderName=accountHolderName;
	this.balance=balance;
}
void setaccountNumber(int accountNumber) {
	this.accountNumber=accountNumber;
}
void setaccountHolderName(String accountHolderName) {
	this.accountHolderName=accountHolderName;
}
void setbalance(double balance) {
	this.balance=balance;
}
 int getaccountNumber() {
	 return this.accountNumber;
 }
 String getaccountHolderName() {
	 return this.accountHolderName;
 }
 double getbalance() {
	 return this.balance;
 }
 void deposit(double amount) {
	 if(amount!=0) {
		 balance=balance+amount;
		 System.out.println("the amount has been deposited");
	 }
 }
 void withdraw(double amount) {
	 if(amount>0) {
		balance= balance-amount;
		System.out.println("the amount has benn withdrawn");
	 }
	
 }
 
 void show() { 
	 System.out.println("acoountNumber="+getaccountNumber());
	 System.out.println("accountHoldername="+getaccountHolderName());
	 System.out.println("balance="+getbalance());
 }
}
