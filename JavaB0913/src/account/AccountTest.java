package account;

import java.util.Scanner;

class Account {
	private String accountNumber;
	private String accountHolder;
	private int balance;

	// 생성자 객체를 초기화
	public Account(String accountNumber, String accountHolder, int initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = initialDeposit;
	}

	// getter와 setter 객체가 생성된 후 속성 값을 가져오거나 수정할때 사용
	// accountNumber과 accountHolder는 변경되면 안되서 get으로만 만들어보았다.
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
		if (amount > 0) {
			this.balance += amount;
		}
	}

	public boolean withdraw(int amount) {
		if (amount > 0 && this.balance >= amount) {
			this.balance -= amount;
			return true;
		} else {
			return false;
		}
	}
}

public class AccountTest {

	static Account[] accounts = new Account[100];
	static int accountCount = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("[계좌생성 실행 결과]");
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택>");
			int a = sc.nextInt();
			sc.nextLine();
			System.out.println("------------------");


			switch (a) {
			case 1:
				createAccount(sc);
				break;
			case 2:
				showAccounts();
				break;
			case 3:
				deposit(sc);
				break;
			case 4:
				withdraw(sc);
				break;
			case 5:
				run=false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println();
			}
		}
	}

	// 1.계좌생성
	private static void createAccount(Scanner sc) {
		System.out.println("[계좌생성]");
		System.out.print("계좌번호 :");
		String accountNumber = sc.nextLine();
		System.out.print("계좌주:");
		String accontHolder = sc.nextLine();
		System.out.print("초기 입금액:");

		int initialDeposit = Integer.parseInt(sc.nextLine());

		accounts[accountCount] = new Account(accountNumber, accontHolder, initialDeposit);
		accountCount++;
		System.out.println("결과:계좌가 생성되었습니다.");
	}

	// 2.목록
	private static void showAccounts() {
		System.out.println("[계좌 목록]");
		for (int i = 0; i < accountCount; i++) {
			Account acc = accounts[i];
			System.out.println(
					"계좌번호:" + acc.getAccountNumber() + " 계좌:" + acc.getAccountHolder() + " " + acc.getBalance());
		}
	}

	// 4.출금
	private static void withdraw(Scanner sc) {
		System.out.println("출금할 계좌번호:");
		String accountNumber = sc.nextLine();
		System.out.println("출금액");
		int amount = sc.nextInt();

		Account acc = findAccount(accountNumber);
		if (acc != null) {
			if (acc.getBalance() >= amount) {
				// acc.setBalance() -= amount;
				// setBalance는 메서드라
				// 직접할 수 없다.
				acc.setBalance(acc.getBalance() - amount);
				System.out.println(acc.getBalance()); 

				// int newBalance =acc.getBalance()-amount;
				// acc.setBalance(newBalance);

			} else {
				System.out.println("잔액부족");
			}

		} else {
			System.out.println("계좌를 찾을 수 없음 ");
		}
	}

	// 3.예금
	private static void deposit(Scanner sc) {
		System.out.println("입금할 계좌번호:");
		String accountNumber = sc.nextLine();
		System.out.println("입금액:");
		int amount = sc.nextInt();
		sc.nextLine();

		Account acc = findAccount(accountNumber);

		if (acc != null) {
			acc.setBalance(acc.getBalance() + amount);
			System.out.println("입금완료 현재잔액" + acc.getBalance());

		}else {
			System.out.println("계좌를 찾을 수 없음");

	}

	}

	// 5.찾기
	private static Account findAccount(String accountNumber) {
		for (int i = 0; i < accountCount; i++) {
			if (accounts[i].getAccountNumber().equals(accountNumber)) {
				// accounts[i].accountNumber().equals(accountNumber)
				return accounts[i];
			}
		}
		return null;

		// account객체를 반환해서 account로 작성
	}

	// 5.종료

}
