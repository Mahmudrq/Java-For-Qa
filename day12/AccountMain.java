package day12;

public class AccountMain {

	public static void main(String[] args) {
		Account acc = new Account ();
		
		acc.setAccno(101);
		acc.setAccname("Mike");
		acc.setAmount(12221.12);
		
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getAccname());
		System.out.println(acc.getAmount());

	}

}
