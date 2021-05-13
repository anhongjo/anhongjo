package hello;

public class Main {
	
		 public static void main(String[] args) {
		  int [][]a={{1,11,12,6,5,0},
		       {10, 2, 7, 4, 15,0},
		       {9, 8, 3, 13, 14, 0}};
		  // 행의합구하는 for문
		  for(int i=0;i<3;i++) {
		   int sum=0;

		   for(int j=0;j<5;j++) {  // 2번째열까지합이더해져야하므로 조건은 j<3
		    sum+=a[i][j];   // a[i][3]+=a[i][j]; // 행의 합 구하기
		   }
		   a[i][5]=sum;
		  }
		  // 배열출력하는 for문
		  for(int i=0;i<3;i++) {
		   for(int j=0;j<6;j++) {
		    System.out.print(a[i][j] + "  ");
		   }
		   System.out.println();
		  }

		 }
		}