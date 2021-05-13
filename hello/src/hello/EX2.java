package hello;

import java.util.Scanner;

public class EX2  {

public static void main(String[] args) {
Scanner a = new Scanner(System.in); //Scanner 생성

System.out.println("1을 눌러 전원을 켜주세요");
int b = 0; //입력 받을 값의 타입과 변수 선언(숫자를 받을거기 때문에 int타입이됨
b = a.nextInt();//입력 받은 값을 b에 저장


if(b==1){  // true
	
	System.out.println("1을 눌러 채널 1증가");
	int c,d = 0; //입력 받을 값의 타입과 변수 선언(숫자를 받을거기 때문에 int타입이됨
	c = a.nextInt();
	System.out.println("1을 눌러 음량 1증가");
	d = a.nextInt(); //입력 받은 값을 b에 저장
	System.out.println("종료하려면 1이외의 값 입력");
	b = a.nextInt();

	int sum=0;
	int sum1=0; //평균값 초기화
	int n=0;
	int n1=0;//입력받은 숫자 갯수 초기화

while(b != 0){ //숫자 0을 받기 전까지는 프로그램 반복실행
	
	sum += c; //입력받은 숫자를 차곡차곡sum값에 저장
	sum1 += d;
	n++;//입력받은 숫자의 갯수는 프로그램이 돌 때마다 하나씩 추가됨
	n1++;
	System.out.println("채널"+ sum + "음량"+ sum1);
	
	System.out.println("1을 눌러 채널 1증가");
	c = a.nextInt() ;
	System.out.println("1을 눌러 음량 1증가");
	d = a.nextInt();//입력을 받고 다음 숫자를 입력받을 준비
	System.out.println("종료하려면 1이외의 값 입력");
	b = a.nextInt();
	}
}
}
}