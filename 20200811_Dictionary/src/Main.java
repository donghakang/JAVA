import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> dictionary = new ArrayList<>();
		ArrayList<String> description = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		String input;
		String vocab, meaning;
		
		while (true) {
			System.out.println("���ϴ� ������ ���ÿ� ");
			System.out.println("1. �ܾ� �߰�");
			System.out.println("2. �ܾ� ����");
			System.out.println("3. �ܾ� ����");
			System.out.println("4. ������ �ܾ�");
			System.out.println("5. �ܾ� ����");
			System.out.println("6. ����");
			System.out.print("    +------------: ");
			input = scan.nextLine();
			
			if (input.equals("1") || input.equals("�ܾ� �߰�")) {
				System.out.print("�ܾ�: ");
				vocab = scan.nextLine();
				System.out.print("��  : ");
				meaning = scan.nextLine();
				
				dictionary.add(vocab);
				description.add(meaning);
				
				System.out.println("�߰� �Ǿ����ϴ�. ");
				
			} else if (input.equals("2") || input.equals("�ܾ� ����")) {
				System.out.print("� �ܾ �����ұ��?: ");
				vocab = scan.nextLine();
				
				int pos = dictionary.indexOf(vocab);
				dictionary.remove(pos);
				description.remove(pos);
				
				System.out.println("���� �Ǿ����ϴ�. ");
				
			} else if (input.equals("3") || input.equals("�ܾ� ����")) {
				System.out.print("� �ܾ �����ұ��?: ");
				vocab = scan.nextLine();
				
				int pos = dictionary.indexOf(vocab);
				
				System.out.print("������ �ܾ �Է��ϼ���: ");
				vocab = scan.nextLine();
				System.out.print("������ ���� �Է��ϼ���  : ");
				meaning = scan.nextLine();
				
				dictionary.set(pos, vocab);
				description.set(pos, meaning);
				
				System.out.println("���� �Ǿ����ϴ�. ");
				
				
			} else if (input.equals("4") || input.equals("������ �ܾ�")) {
				int pos = new Random().nextInt(dictionary.size());
				
				System.out.println("������ �ܾ�: " + dictionary.get(pos));
				System.out.println("      ��: " + description.get(pos));
				
			} else if (input.equals("5") || input.equals("�ܾ� ����")) {
				System.out.println("Coming soon .... ");
			} else if (input.equals("6") || input.equals("����")) {
				break;
			} else {
				continue;
			}
		}
		

 	}

}
