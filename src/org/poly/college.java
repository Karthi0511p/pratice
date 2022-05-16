package org.poly;

public class college extends Univerity {
	
     @Override
       public void ug() {
  		System.out.println("ug ece");
				
					}
        @Override
          public void pg() {
          System.out.println("pg css");
          
            }
            public void exam() {
				System.out.println("exam mark");

			}
            public static void main(String[] args) {
            	Univerity u=new Univerity();
            	u.ug();
            	u.pg();
            	college i=new college();
            	i.ug();
            	i.pg();
            	i.exam();
            	
            	Univerity j=new college();
            	j.ug();
            	j.pg();
			}
	}


