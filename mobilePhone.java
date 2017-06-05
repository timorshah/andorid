package PhoneContact;

import java.util.ArrayList;
import java.util.Scanner;

public class mobilePhone {

	public static ArrayList<contacts> contact = new ArrayList<contacts>();
	static boolean qouit;
	static int chos = 0;
	public static Scanner in = new Scanner(System.in);
	public static contacts con;
	

	public static void add(String name, long num) {

	   ;
		contact.add(new contacts(name, num));
		

	}

	public static void print() {
		if(contact.size()>=0){
			for (int i = 0; i < contact.size(); i++) {
				System.out.println(" " + (1 + i) + "." + contact.get(i));
			}

		}else{
			System.out.println(" list is empety");
		}
		
	}

	public static void ins() {
		System.out.println("1 for instraction");
		System.out.println("2 for add        ");
		System.out.println("3 for print       ");
		System.out.println("4 for update      ");
		System.out.println("5 for remove      ");
		System.out.println("6 for search      ");
		System.out.println("7 for qouit       ");
	}

	public static void update() {
		System.out.println("inter nuber of contact to update");
		int up = in.nextInt();
		System.out.println(" add name and new number ");
		

		 String	n = in.next();
		long N = in.nextLong();
		

		contact.set((up - 1),new contacts(n, N));
		
	}

	public static void remove(int num) {

		System.out.println("item number  " + (num + 1) + "." + contact.get(num) + " removed");
		contact.remove(num);
	}

	public static void search() {
		if(contact.size()>0){
		System.out.println(" inter iteme name or Number  to found");
		String f = in.nextLine();
		int ind =0;
		for(int i =0;i<contact.size();i++){
			if(contact.get(i).toString().contains(f)){
				
				ind=i;
			}else{
				System.out.println(" not found");
			}
		}
			
		
		
		System.out.println("Yes the name is found in "+(contact.get(ind)));
		
	}
		else{
			System.out.println("list is empety");
		}
	}	 



	public static void qu() {
		qouit = true;

	}

	public static void main(String[] args) {
		ins();
		while (!qouit) {
			System.out.println("plz choce an action ");
			chos = in.nextInt();
			in.nextLine();

			switch (chos) {
			case 1:
				ins();
				break;
			case 2:
				System.out.println("how much contact do you wanto add ");
				int how = in.nextInt();
				for (int i = 0; i < how; i++) {
					System.out.println(" add name " + (i + 1));
					String n = in.next();
					System.out.println(" add number " + (i + 1));
					long N = in.nextLong();
					add(n, N);
				}
				System.out.println("contact add");

				break;
			case 3:
				print();
				break;

			case 4:
				update();
				break;

			case 5:
				System.out.println(" which number you want to remove");
				int r = in.nextInt() - 1;
				remove(r);
				break;
			case 6:
				search();
				break;
			case 7:

				qu();
				break;

			}

		}
	}

}
