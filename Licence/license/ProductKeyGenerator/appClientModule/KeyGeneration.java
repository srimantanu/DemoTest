import java.util.ArrayList;
import java.util.List;

public class KeyGeneration {

	StringBuilder strBuilder = new StringBuilder();

	public void splitValues() {
		String userInput = "ABND NC 010819 010820 99 03"; //original string
		String generatedKey = "TDJP-4e43-BBTG-fMTG-3035-3033"; // encrypted string
		String[] splitted = userInput.split(" ");

		for (int j = 0; j < splitted.length; j++) {
			transform(splitted[j], j + 1);
		}
	}

	private void transform(String childString, int index) {
		StringBuilder generateFirstKey = new StringBuilder();
		StringBuilder generateSecondKey = new StringBuilder();
		StringBuilder generateThirdKey = new StringBuilder();
		StringBuilder generateForthKey = new StringBuilder();
		StringBuilder generateFifthKey = new StringBuilder();
		StringBuilder generateSixthKey = new StringBuilder();
		if (index == 1) {
			char ch;
			for (int k = 0; k < childString.length(); k++) {
				String ascii = childString.substring(k, k + 1);
				int asciiNumber = ascii.charAt(0);
				if (k % 2 == 0) {
					if (ascii.equals("Z") || ascii.equals("Y") || ascii.equals("z") || ascii.equals("y")) {
						int newNumber = asciiNumber - 1;
						ch = (char) newNumber;
					} else {
						int newNumber = asciiNumber + 1;
						ch = (char) newNumber;
					}
				} else if (ascii.equals("Z") || ascii.equals("Y") || ascii.equals("z") || ascii.equals("y")) {
					int newNumber = asciiNumber - 2;
					ch = (char) newNumber;
				} else {
					int newNumber = asciiNumber + 2;
					ch = (char) newNumber;
				}
				generateFirstKey.append(String.valueOf(ch));

			}
			strBuilder.append(generateFirstKey + "-");
		}
		if (index == 2) {
			for (int k = 0; k < childString.length(); k++) {
				String ascii = childString.substring(k, k + 1);
				char c = ascii.charAt(0);
				int i = (int) c;
				String hexofchar = Integer.toHexString(i);
				generateSecondKey.append(hexofchar);
			}
			strBuilder.append(generateSecondKey + "-");
		}

		if (index == 3) {
			String ascii1 = childString.substring(0, 2);
			String ascii2 = childString.substring(2, 4);
			String ascii3 = childString.substring(4, 6);
			KeyMapper map = new KeyMapper();
			generateThirdKey.append(map.getDateMonthValue(ascii1) + map.getDateMonthValue(ascii2) + map.getYearValue(ascii3));
			strBuilder.append(generateThirdKey + "-");
		}

		if (index == 4) {
			String ascii1 = childString.substring(0, 2);
			String ascii2 = childString.substring(2, 4);
			String ascii3 = childString.substring(4, 6);
			KeyMapper map = new KeyMapper();
			generateForthKey.append(map.getDateMonthValue(ascii1) + map.getDateMonthValue(ascii2) + map.getYearValue(ascii3));
			strBuilder.append(generateForthKey + "-");
		}

		if (index == 5) {
			for (int k = 0; k < childString.length(); k++) {
				String ascii = childString.substring(k, k + 1);
				char c = ascii.charAt(0);
				int i = (int) c;
				String hexofchar = Integer.toHexString(i);
				generateFifthKey.append(hexofchar);
			}
			strBuilder.append(generateFifthKey + "-");
		}

		if (index == 6) {
			for (int k = 0; k < childString.length(); k++) {
				String ascii = childString.substring(k, k + 1);
				char c = ascii.charAt(0);
				int i = (int) c;
				String hexofchar = Integer.toHexString(i);
				generateSixthKey.append(hexofchar);
			}
			strBuilder.append(generateSixthKey);
		}
	}

	public String generateFinalKey() {
		return strBuilder.toString();
	}

	public static void main(String[] args) {
		KeyGeneration kg = new KeyGeneration();
		kg.splitValues();
		System.out.println(kg.generateFinalKey());
	}
}
