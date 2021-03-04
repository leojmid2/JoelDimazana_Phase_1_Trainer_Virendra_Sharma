package practice4;

import java.util.ArrayList;

/*
 * Find longest increasing subsequent numbers where n < 100
 * @author Joel Dimazana
 *
 */
public class SubsequentNumbers {
	
	static int[] num = {1,2,4,5,6,9,100,10,11,12,13,14,1}; 
	static ArrayList<Integer> temp =  new ArrayList<Integer>();
	static ArrayList<Integer> longest =  new ArrayList<Integer>();

	public static void main(String[] args) {
		int count = 1;
		int highest =0;
		int next =1;
		
			for (int i=0;i<num.length;i++) {
				if (num[i] >= 100 ) { //only validate the number < 100
					next++;
					continue;
				}	
				if(next<num.length && (num[i]+1)==num[next]) {
					count+=1;
					temp.add(num[i]);
				}
				else { 
					if (count > highest) {
						 highest = count;
						 temp.add(num[i]); //to get the last data
						 longest.clear();
						 longest.addAll(temp);
						 temp.clear(); 
					}
					count=1;
				}	
				next++;
			}
		System.out.println("Total count of increasing subsequent number: " +highest);
		System.out.println("Longest increasing subsequent number:" + longest.toString());
		}
	}
	
