package hello;

import java.util.Scanner;

public class EX2_3 {

public static void main(String[] args) {
Scanner a = new Scanner(System.in); //Scanner 생성

System.out.println("숫자를 입력해 주세요.");
int b = 0; //입력 받을 값의 타입과 변수 선언(숫자를 받을거기 때문에 int타입이됨
b = a.nextInt(); //입력 받은 값을 b에 저장

int sum=0; //평균값 초기화
int n=0; //입력받은 숫자 갯수 초기화

while(b != -1) { //숫자 0을 받기 전까지는 프로그램 반복실행
sum += b; //입력받은 숫자를 차곡차곡sum값에 저장
n++; //입력받은 숫자의 갯수는 프로그램이 돌 때마다 하나씩 추가됨
b = a.nextInt(); //입력을 받고 다음 숫자를 입력받을 준비
}
System.out.println("평균은"+(double)sum/n);
} //0이 입력되는 순간 while을 빠져나와서 윗 문장 출력, 그리고 평균을 계산

}