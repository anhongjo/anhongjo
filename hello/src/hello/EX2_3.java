package hello;

import java.util.Scanner;

public class EX2_3 {

public static void main(String[] args) {
Scanner a = new Scanner(System.in); //Scanner ����

System.out.println("���ڸ� �Է��� �ּ���.");
int b = 0; //�Է� ���� ���� Ÿ�԰� ���� ����(���ڸ� �����ű� ������ intŸ���̵�
b = a.nextInt(); //�Է� ���� ���� b�� ����

int sum=0; //��հ� �ʱ�ȭ
int n=0; //�Է¹��� ���� ���� �ʱ�ȭ

while(b != -1) { //���� 0�� �ޱ� �������� ���α׷� �ݺ�����
sum += b; //�Է¹��� ���ڸ� ��������sum���� ����
n++; //�Է¹��� ������ ������ ���α׷��� �� ������ �ϳ��� �߰���
b = a.nextInt(); //�Է��� �ް� ���� ���ڸ� �Է¹��� �غ�
}
System.out.println("�����"+(double)sum/n);
} //0�� �ԷµǴ� ���� while�� �������ͼ� �� ���� ���, �׸��� ����� ���

}