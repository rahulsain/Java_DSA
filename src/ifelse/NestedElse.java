package ifelse;

public class NestedElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myBday = 2002 ;
		if(myBday>=1900 && myBday < 2001)
		{
			
		System.out.println("your bday year is " + myBday);
		}
		else if(myBday == 2001) 
		{
			System.out.println(myBday);
		}
		else
		{int i=0;
			while(i<10) {
				System.out.println("error "+ ++i);
				
		}
			}

	}

}
