package hello;

import java.util.Scanner;

public class EX2  {

public static void main(String[] args) {
Scanner a = new Scanner(System.in); //Scanner ����

System.out.println("1�� ���� ������ ���ּ���");
int b = 0; //�Է� ���� ���� Ÿ�԰� ���� ����(���ڸ� �����ű� ������ intŸ���̵�
b = a.nextInt();//�Է� ���� ���� b�� ����


if(b==1){  // true
	
	System.out.println("1�� ���� ä�� 1����");
	int c,d = 0; //�Է� ���� ���� Ÿ�԰� ���� ����(���ڸ� �����ű� ������ intŸ���̵�
	c = a.nextInt();
	System.out.println("1�� ���� ���� 1����");
	d = a.nextInt(); //�Է� ���� ���� b�� ����
	System.out.println("�����Ϸ��� 1�̿��� �� �Է�");
	b = a.nextInt();

	int sum=0;
	int sum1=0; //��հ� �ʱ�ȭ
	int n=0;
	int n1=0;//�Է¹��� ���� ���� �ʱ�ȭ

while(b != 0){ //���� 0�� �ޱ� �������� ���α׷� �ݺ�����
	
	sum += c; //�Է¹��� ���ڸ� ��������sum���� ����
	sum1 += d;
	n++;//�Է¹��� ������ ������ ���α׷��� �� ������ �ϳ��� �߰���
	n1++;
	System.out.println("ä��"+ sum + "����"+ sum1);
	
	System.out.println("1�� ���� ä�� 1����");
	c = a.nextInt() ;
	System.out.println("1�� ���� ���� 1����");
	d = a.nextInt();//�Է��� �ް� ���� ���ڸ� �Է¹��� �غ�
	System.out.println("�����Ϸ��� 1�̿��� �� �Է�");
	b = a.nextInt();
	}
}
}
}