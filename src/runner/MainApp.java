package runner;

public class MainApp {

	public static void main(String[] args) {
		
		StringBuffer sbstr = new StringBuffer("    123 2312  123 ��� ����� � ()�������� "); // My											// text
		if (sbstr.length() != 0) {
			System.out.println("�������� ����� - " + sbstr);
			// ������� ������ ������
			while (!Character.isLetter(sbstr.charAt(0))) {  
				sbstr.deleteCharAt(0);
			}
			// ������� ������� �� ���������� �������
			for (int i = 0; i < sbstr.length(); i++) {
				if (!Character.isLetter(sbstr.charAt(i)) && !Character.isWhitespace(sbstr.charAt(i))) {
					sbstr.setCharAt(i, ' ');
				}
			}
			System.out.println("����� ������ �� ���� -  " + sbstr);
		} else {
			System.out.println("������ ��� ");
		}
	}
	}

