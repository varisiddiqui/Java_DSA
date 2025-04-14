import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			ArrayList<Integer> a = new ArrayList<>();
			HashMap<Integer, Integer> hm = new HashMap<>();

			boolean has = false;
			for (int i = 0; i < n; i++) {
				int m = sc.nextInt();
				if (m == 0) {
					has = true;
				}
				a.add(m);
				hm.put(m, hm.getOrDefault(m, 0) + 1);
			}
			boolean enter = false;

			int l = 0;
			for (Integer key : hm.keySet()) {
				/* System.out.println("Key: " + key + ", Value: " + hm.get(key)); */

				int freq = hm.get(key);
				if (freq == 1) {
					l++;
				} else {
					if (freq >= 2) {
						enter = true;
						if (freq % 2 != 0) {
							l++;
						}
					}
				}
			}

			if(has) {
				System.out.println(l);
			}
			else if(!has && enter){
				
					l++;
					System.out.println(l);
				
			}
			else{
				System.out.println(l);
			}

			

		}
	}
}