package hello;

public class Main {
	
		 public static void main(String[] args) {
		  int [][]a={{1,11,12,6,5,0},
		       {10, 2, 7, 4, 15,0},
		       {9, 8, 3, 13, 14, 0}};
		  // �����ձ��ϴ� for��
		  for(int i=0;i<3;i++) {
		   int sum=0;

		   for(int j=0;j<5;j++) {  // 2��°���������̴��������ϹǷ� ������ j<3
		    sum+=a[i][j];   // a[i][3]+=a[i][j]; // ���� �� ���ϱ�
		   }
		   a[i][5]=sum;
		  }
		  // �迭����ϴ� for��
		  for(int i=0;i<3;i++) {
		   for(int j=0;j<6;j++) {
		    System.out.print(a[i][j] + "  ");
		   }
		   System.out.println();
		  }

		 }
		}