package competition;

import java.util.Scanner;

class boringNo {

	public static void main(String[] args) {
//kickstart
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		for(long i = 1; i<t+1; i++) {
			long l = sc.nextLong();
			long r = sc.nextLong();
			int y = 0;
			
			for(long j = l; j<=r; j++) {
				
				int count = 0;
				long num = j;
				while (num != 0) {
				      num /= 10;
				      ++count;
				    }
				num = j;
				  if(count == 1 && num % 2 == 0 )
					  continue;
				  while(num > 0) {
					  
				int rem = (int) (num % 10);
				num /= 10;
				if(rem % 2 == 0 && count %2 != 0) {
					continue;
				}
				else if(rem % 2 != 0 && count %2 == 0) {
					continue;
				}
				else {
					y++;
				}
				  }
			}
			
			
			
			System.out.println("Case #"+i+": "+y);
		}
		sc.close();
	}

}
