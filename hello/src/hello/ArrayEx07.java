package hello;

public class ArrayEx07 {
public static void main(String[] args) {
	int[][] score = { { 1, 11, 12, 6, 5 }, 
					  { 10, 2, 7, 4, 15 }, 
					  { 9, 8, 3, 13, 14 }}; 
					  
				
	int[] Arr = new int[3]; 
	int[] col = new int[5];
	
	String[] stuName = {"1, 11, 12, 6, 5", "10, 2, 7, 4, 15", "9, 8, 3, 13, 14"};
	

	for (int i = 0; i < Arr.length; i++) {
		for (int j = 0; j < col.length; j++) {
			Arr[i] += score[i][j]; // 학생별 총점 계산
		}
		System.out.println(stuName[i] + " 합계 : " + Arr[i]);
	}
}
}