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
			System.out.println("원하는 사항을 고르시오 ");
			System.out.println("1. 단어 추가");
			System.out.println("2. 단어 삭제");
			System.out.println("3. 단어 수정");
			System.out.println("4. 오늘의 단어");
			System.out.println("5. 단어 게임");
			System.out.println("6. 종료");
			System.out.print("    +------------: ");
			input = scan.nextLine();
			
			if (input.equals("1") || input.equals("단어 추가")) {
				System.out.print("단어: ");
				vocab = scan.nextLine();
				System.out.print("뜻  : ");
				meaning = scan.nextLine();
				
				dictionary.add(vocab);
				description.add(meaning);
				
				System.out.println("추가 되었습니다. ");
				
			} else if (input.equals("2") || input.equals("단어 삭제")) {
				System.out.print("어떤 단어를 삭제할까요?: ");
				vocab = scan.nextLine();
				
				int pos = dictionary.indexOf(vocab);
				dictionary.remove(pos);
				description.remove(pos);
				
				System.out.println("삭제 되었습니다. ");
				
			} else if (input.equals("3") || input.equals("단어 수정")) {
				System.out.print("어떤 단어를 수정할까요?: ");
				vocab = scan.nextLine();
				
				int pos = dictionary.indexOf(vocab);
				
				System.out.print("수정할 단어를 입력하세요: ");
				vocab = scan.nextLine();
				System.out.print("수정할 뜻을 입력하세요  : ");
				meaning = scan.nextLine();
				
				dictionary.set(pos, vocab);
				description.set(pos, meaning);
				
				System.out.println("수정 되었습니다. ");
				
				
			} else if (input.equals("4") || input.equals("오늘의 단어")) {
				int pos = new Random().nextInt(dictionary.size());
				
				System.out.println("오늘의 단어: " + dictionary.get(pos));
				System.out.println("      뜻: " + description.get(pos));
				
			} else if (input.equals("5") || input.equals("단어 게임")) {
				System.out.println("Coming soon .... ");
			} else if (input.equals("6") || input.equals("종료")) {
				break;
			} else {
				continue;
			}
		}
		

 	}

}
