package chapter07;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;



	class Info {
		String iceA = "아이스 아메리카노";   //중요 정보없음 
		String hotA = "따뜻한 아메리카노";
		String moca = "까페 모카";
		String cafu = "카푸치노";
		String green = "그린티";
		String hotCoco = "따뜻한 코코아";
		String hotMil  = "따뜻한 우유";
		String choice = "를 선택하셨습니다.";
		String oder = " 잔을 주문하셨습니다.";
			
			
		public void num1() {       		 //다방 메뉴
			int count = 1;
				
			System.out.println("어서오세요. 인공지능 다방 602호 입니다.");
			System.out.println("주문하시겠어요?");
			System.out.println("      <메뉴>");
			System.out.println(count + ". " + iceA + "	3.0 ");
			System.out.println(++count + ". " + hotA + "	3.5 ");
			System.out.println(++count + ". " + moca + "	4.5 ");
			System.out.println(++count + ". " + cafu + "	4.5 ");
			System.out.println(++count + ". " + green + "		5.0 ");
			System.out.println(++count + ". " + hotCoco + "	5.0 ");
			System.out.println(++count + ". " + hotMil + "	3.5");
		}
		
		public int num2() {       	  //음료 선택
			int menu = 0;
			
			System.out.print("주문번호 : ");
			
			Scanner scen = new Scanner(System.in);
			menu = scen.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println(iceA + choice);
				break;
			case 2:
				System.out.println(hotA + choice);
				break;
			case 3:
				System.out.println(moca + choice);
				break;
			case 4:
				System.out.println(cafu + choice);
				break;
			case 5:
				System.out.println(green + choice);
				break;
			case 6:
				System.out.println(hotCoco + choice);
				break;
			case 7:
				System.out.println(hotMil + choice);
				break;
			default:
				System.out.println("오늘은 스페셜 메뉴가 없내요."); 
				System.out.println("화면의 메뉴를 선택해 주세요.");
				break ;   //메뉴 외 번호 입력시 반복기능 추가 필요. 
			}
			
			return menu;
		}
		
		public int count (int serv) {     //음료 수량
			int ea = 0;
			
			System.out.print("수량을 입력해주세요 : ");
			Scanner scen = new Scanner(System.in);
			ea = scen.nextInt();
			
			switch (serv) {
			case 1:
				System.out.println(iceA + "  " +  ea + oder);
				break;
			case 2:
				System.out.println(hotA + "  " + ea + oder);
				break;
			case 3:
				System.out.println(moca + "  " + ea + oder);
				break;
			case 4:
				System.out.println(cafu + "  " + ea + oder);
				break;
			case 5:
				System.out.println(green + "  " +  ea + oder);
				break;
			case 6:
				System.out.println(hotCoco + "  " + ea + oder);
				break;
			case 7:
				System.out.println(hotMil + "  " + ea + oder);
				break;
			default:
				break;
			}
			
			return ea;
		}
	}
	class Amount {
		int defVal = 0; 	//준비
		int how = 0;
			
		public int cardCash() {                     //결제 방법
			System.out.println("결제 방법을 선택해주세요.");
			System.out.println("1. 현금 결제");
			System.out.println("2. 카드 결제");
			System.out.println("3. 골드바 결제");
			System.out.println("4. 비트코인 결제");
			System.out.println("5. 신체포기각서");
			System.out.println("6. 집문서, 땅문서");
			
			System.out.print("결제 선택 : ");
			Scanner scen = new Scanner(System.in);
			how = scen.nextInt();
			
			switch (how) {
			case 1:
				System.out.println("Cash는 역시 머스크! and I am Ironman. 3000만 좀 어떻게..");
				break;
			case 2:
				System.out.println("3년 할부하면 3년뒤의 돈이 지금 내손에! 극락과 나락은 카드 한 장 차이!");
				break;
			case 3:
				System.out.println("기름국분이셨구나!외상도 해드려요");
				break;
			case 4:
				System.out.println("몇 년 전에 사셨어요? 아~ 잘 모르시는구나~ 한개만 주시면되요.");
				break;
			case 5:
				System.out.println("일단 신장부터 결제하실게요.");
				break;
			case 6:
				System.out.println("DMZ는 안사요~");
				break;
			default:
				break ;                                      
			}
			
			return how;
		}
		
		public void pay (int value, int value2) {	//주문 음료 가격
			
			switch(value) {
			case 1:
				defVal = 3000 * value2;
				break;
			case 2:
				defVal = 3500 * value2;
				break;
			case 3:
				defVal = 4500 * value2;
				break;
			case 4:
				defVal = 4500 * value2;
				break;
			case 5:
				defVal = 5000 * value2;
				break;
			case 6:
				defVal = 5000 * value2;
				break;
			case 7:
				defVal = 3500 * value2;
				break;
			default:
				break;
			}
				
			System.out.println(defVal + "원 결제 도와드리겠습니다.");
		}
		
		public int hold(int value) {
			
			if (value <= 4) {
				try {
					System.out.println("결제 중입니다. 5초만 기다려 주세요.");
					System.out.println("오초.");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("사초.");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("사아암초.");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("이이이이이초.");
					TimeUnit.SECONDS.sleep(3);
					System.out.println("결제 완료되었습니다.");
				}
			
				catch (InterruptedException e) {
					System.err.format("IOException: %s%n", e);
				}
			}
			
			return value;
				
		}
	class LogMarket {
			private String name;
			private String address;
			private char bloodType;
			private int phone;
			private int number;
			private int tall;
			private int heartBit;
			private int bloodPressure;
			private float vision;
			private int liverCount;
			private int otherMedicalHistory;
			private int amount;
			
		public LogMarket(String na, String add, char bT, int pho, int num, int tal, int hea, int bP, float vis, int lc, int omh, int amo) {
			name = na;
			address = add;
			bloodType = bT;
			phone = pho;
			number = num;
			tall = tal;
			heartBit = hea;
			bloodPressure = bP;
			vision = vis;
			liverCount = lc;
			otherMedicalHistory = omh;
			amount = amo;
		}
			
		public int personalInfomation() {
			System.out.println("성명 : " + name);
			System.out.println("주소 : " + address);
			System.out.println("혈액형 : " + bloodType);
			System.out.println("전화번호 : " + phone);
			System.out.println("주민등록번호 : " + number);
			System.out.println("신장 : " + tall);
			System.out.println("평균심박수 : " + heartBit);
			System.out.println("혈압 : " + bloodPressure);
			System.out.println("시력 : " + vision);
			System.out.println("간수치 : " + liverCount);
			System.out.println("기타병력 : " + otherMedicalHistory);
			System.out.println("정산금액 : " + amount + '\n');
			return amount;
		}
			
		public int deposit (int value) {
			amount += value;
			return amount;
		}
			
		public int withdraw(int value) {
			amount -= value;
			return amount;
			
		}
			
		public int memo(int value) {
			if (value == 5) {
				System.out.println("신포서를 선택하셨습니다.");
				System.out.println("간단한 서류작성이 있겠습니다.");
				Scanner scen = new Scanner(System.in);
				how = scen.nextInt();
				
			}
		}
public class Cafe {								//실행 메인
	public void main(String[] args) {
		int num3 = 0;
		int num4 = 0;
		int market = 0;
		int log = 0;
		
		Info serv = new Info();
		Amount coun = new Amount();
		LogMarket logM = new LogMarket();
		
		serv.num1();                //메뉴 출력
		num3 = serv.num2();			//메뉴 선택 num3 리턴
		num4 = serv.count(num3);	//선택음료 수량 num4 리턴
		coun.pay(num3, num4);		//가격
		market = coun.cardCash();	//결제수단 입력 market 리턴
		log = coun.hold(market);			//결제수단 입력에른 출력 변경
		
		
		
	}
}
//    미완성

/* 메소드 Method - 방법 체계성 체계
 *  main이 메소드 였어?   {} 중괄호 내의 문장들이 순차 실행된다.
 *  중괄호 쓰는게 메소드
 */

