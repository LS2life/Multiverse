package chapter07;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;



	class Info {
		String iceA = "���̽� �Ƹ޸�ī��";   //�߿� �������� 
		String hotA = "������ �Ƹ޸�ī��";
		String moca = "���� ��ī";
		String cafu = "īǪġ��";
		String green = "�׸�Ƽ";
		String hotCoco = "������ ���ھ�";
		String hotMil  = "������ ����";
		String choice = "�� �����ϼ̽��ϴ�.";
		String oder = " ���� �ֹ��ϼ̽��ϴ�.";
			
			
		public void num1() {       		 //�ٹ� �޴�
			int count = 1;
				
			System.out.println("�������. �ΰ����� �ٹ� 602ȣ �Դϴ�.");
			System.out.println("�ֹ��Ͻðھ��?");
			System.out.println("      <�޴�>");
			System.out.println(count + ". " + iceA + "	3.0 ");
			System.out.println(++count + ". " + hotA + "	3.5 ");
			System.out.println(++count + ". " + moca + "	4.5 ");
			System.out.println(++count + ". " + cafu + "	4.5 ");
			System.out.println(++count + ". " + green + "		5.0 ");
			System.out.println(++count + ". " + hotCoco + "	5.0 ");
			System.out.println(++count + ". " + hotMil + "	3.5");
		}
		
		public int num2() {       	  //���� ����
			int menu = 0;
			
			System.out.print("�ֹ���ȣ : ");
			
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
				System.out.println("������ ����� �޴��� ������."); 
				System.out.println("ȭ���� �޴��� ������ �ּ���.");
				break ;   //�޴� �� ��ȣ �Է½� �ݺ���� �߰� �ʿ�. 
			}
			
			return menu;
		}
		
		public int count (int serv) {     //���� ����
			int ea = 0;
			
			System.out.print("������ �Է����ּ��� : ");
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
		int defVal = 0; 	//�غ�
		int how = 0;
			
		public int cardCash() {                     //���� ���
			System.out.println("���� ����� �������ּ���.");
			System.out.println("1. ���� ����");
			System.out.println("2. ī�� ����");
			System.out.println("3. ���� ����");
			System.out.println("4. ��Ʈ���� ����");
			System.out.println("5. ��ü���Ⱒ��");
			System.out.println("6. ������, ������");
			
			System.out.print("���� ���� : ");
			Scanner scen = new Scanner(System.in);
			how = scen.nextInt();
			
			switch (how) {
			case 1:
				System.out.println("Cash�� ���� �ӽ�ũ! and I am Ironman. 3000�� �� ���..");
				break;
			case 2:
				System.out.println("3�� �Һ��ϸ� 3����� ���� ���� ���տ�! �ض��� ������ ī�� �� �� ����!");
				break;
			case 3:
				System.out.println("�⸧�����̼̱���!�ܻ� �ص����");
				break;
			case 4:
				System.out.println("�� �� ���� ��̾��? ��~ �� �𸣽ô±���~ �Ѱ��� �ֽø�ǿ�.");
				break;
			case 5:
				System.out.println("�ϴ� ������� �����ϽǰԿ�.");
				break;
			case 6:
				System.out.println("DMZ�� �Ȼ��~");
				break;
			default:
				break ;                                      
			}
			
			return how;
		}
		
		public void pay (int value, int value2) {	//�ֹ� ���� ����
			
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
				
			System.out.println(defVal + "�� ���� ���͵帮�ڽ��ϴ�.");
		}
		
		public int hold(int value) {
			
			if (value <= 4) {
				try {
					System.out.println("���� ���Դϴ�. 5�ʸ� ��ٷ� �ּ���.");
					System.out.println("����.");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("����.");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("��ƾ���.");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("������������.");
					TimeUnit.SECONDS.sleep(3);
					System.out.println("���� �Ϸ�Ǿ����ϴ�.");
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
			System.out.println("���� : " + name);
			System.out.println("�ּ� : " + address);
			System.out.println("������ : " + bloodType);
			System.out.println("��ȭ��ȣ : " + phone);
			System.out.println("�ֹε�Ϲ�ȣ : " + number);
			System.out.println("���� : " + tall);
			System.out.println("��սɹڼ� : " + heartBit);
			System.out.println("���� : " + bloodPressure);
			System.out.println("�÷� : " + vision);
			System.out.println("����ġ : " + liverCount);
			System.out.println("��Ÿ���� : " + otherMedicalHistory);
			System.out.println("����ݾ� : " + amount + '\n');
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
				System.out.println("�������� �����ϼ̽��ϴ�.");
				System.out.println("������ �����ۼ��� �ְڽ��ϴ�.");
				Scanner scen = new Scanner(System.in);
				how = scen.nextInt();
				
			}
		}
public class Cafe {								//���� ����
	public void main(String[] args) {
		int num3 = 0;
		int num4 = 0;
		int market = 0;
		int log = 0;
		
		Info serv = new Info();
		Amount coun = new Amount();
		LogMarket logM = new LogMarket();
		
		serv.num1();                //�޴� ���
		num3 = serv.num2();			//�޴� ���� num3 ����
		num4 = serv.count(num3);	//�������� ���� num4 ����
		coun.pay(num3, num4);		//����
		market = coun.cardCash();	//�������� �Է� market ����
		log = coun.hold(market);			//�������� �Է¿��� ��� ����
		
		
		
	}
}
//    �̿ϼ�

/* �޼ҵ� Method - ��� ü�輺 ü��
 *  main�� �޼ҵ� ����?   {} �߰�ȣ ���� ������� ���� ����ȴ�.
 *  �߰�ȣ ���°� �޼ҵ�
 */

