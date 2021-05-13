package hello;

public class Sum10 {
	public static void main(String args[]) { 
		int s = 0, k = 0;
		int x[] = {2,4,6,8,1,3,5,7,9,0};
		while (k<10) {
			s = s+x[k];
			k= k+1;
		}
		System.out.println(s);
		System.out.println(k);
	}
}