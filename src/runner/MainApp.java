package runner;

public class MainApp {

	public static void main(String[] args) {
		
		StringBuffer sbstr = new StringBuffer("    123 2312  123 Мой текст с ()ошибками "); // My											// text
		if (sbstr.length() != 0) {
			System.out.println("Введеный Текст - " + sbstr);
			// Удаляем первый символ
			while (!Character.isLetter(sbstr.charAt(0))) {  
				sbstr.deleteCharAt(0);
			}
			// удаляем символы не являющиеся буквами
			for (int i = 0; i < sbstr.length(); i++) {
				if (!Character.isLetter(sbstr.charAt(i)) && !Character.isWhitespace(sbstr.charAt(i))) {
					sbstr.setCharAt(i, ' ');
				}
			}
			System.out.println("Текст только из букв -  " + sbstr);
		} else {
			System.out.println("Текста нет ");
		}
	}
	}

