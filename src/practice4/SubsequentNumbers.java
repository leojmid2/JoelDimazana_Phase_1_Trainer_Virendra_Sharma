package practice4;


/*
 * Find longest increasing subsequent numbers where n < 100
 * @author Joel Dimazana
 *
 */
public class SubsequentNumbers {
	
	static int[] num = {1,2,4,5,6,9,100,10,11,12,13,14,1}; 

	public static void main(String[] args) {
		int count = 1;
		int highest =0;
		int next =1;
		
			for (int i=0;i<num.length;i++) {
				System.out.println("i " +i);
				if (num[i] >= 100 ) {
					System.out.println(">100");
					next++;
					continue;
				}	

				if(next<num.length && (num[i]+1)==num[next]) {
					count+=1;
				}
				else { 

					if (count > highest) {
						 highest = count;
					}
					count=1;
				}	
				next++;
				
			}
		System.out.println("The longes increasing subsequent number is " +highest);
		}
	}
	
