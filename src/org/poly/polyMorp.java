package org.poly;

public class polyMorp {
	
	private void company(int a) {
		System.out.println(".....int method..");
		System.out.println("company name is "+a);
		
	}
	private void company(String a) {
		System.out.println("....string method...");
		System.out.println("company id is"+a);
		}
	private void company(String a,float b) {
	System.out.println("...string a,float b..");
	System.out.println("company id is "+a);
	System.out.println("company nema is "+b);
	
		}
	private void company(float a,String b) {
		System.out.println("company name is"+a);
		System.out.println("company id is "+b);

	}
	private void company(String a,float b,long c) {
	System.out.println("company id is "+a);
	System.out.println("company name is "+b);
	System.out.println("company moblie no "+c);

	}
      
        public static void main(String[] args) {
			
        	polyMorp f=new polyMorp();
        	
             f.company(456);
             f.company("karthi");
             f.company("karthi", 5583.22f);
             f.company(5583.22f, "karthi");
        	f.company("karthi",5583.22f, 55548488);      			
        	
		}


	}


