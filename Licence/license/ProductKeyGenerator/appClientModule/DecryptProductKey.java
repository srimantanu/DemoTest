
public class DecryptProductKey 
{

	StringBuilder strBuilder = new StringBuilder();
	
	public void splitValues() {
		String userInput = "TDJP-4e43-BBTG-fMTG-3035-3033"; // encrypted string
		String[] splitted = userInput.split("-");

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
						int newNumber = asciiNumber + 1;
						ch = (char) newNumber;
					} else {
						int newNumber = asciiNumber - 1;
						ch = (char) newNumber;
					}
				}
				else if (ascii.equals("Z") || ascii.equals("Y") || ascii.equals("z") || ascii.equals("y")) 
				{
					int newNumber = asciiNumber + 2;
					ch = (char) newNumber;
				} 
				else {
					int newNumber = asciiNumber - 2;
					ch = (char) newNumber;
				}
				generateFirstKey.append(String.valueOf(ch));

			}
			strBuilder.append(generateFirstKey + " ");
		}
		
		if (index == 2) {
			for (int k = 0; k < childString.length() -1; k+=2) {
				String output = childString.substring(k, (k + 2));
				int decimal = Integer.parseInt(output, 16);
				
				generateSecondKey.append((char)decimal);

			}
			strBuilder.append(generateSecondKey + " ");
		}
		
		if (index == 3) {
			String ascii1 = childString.substring(0, 1);
			String ascii2 = childString.substring(1, 2);
			String ascii3 = childString.substring(2, 4);
			KeyMapper map = new KeyMapper();
			generateThirdKey.append(map.getDateMonth(ascii1)   + map.getDateMonth(ascii2) + map.getYear(ascii3));
			strBuilder.append(generateThirdKey + " ");
		}

		if (index == 4) {
			String ascii1 = childString.substring(0, 1);
			String ascii2 = childString.substring(1, 2);
			String ascii3 = childString.substring(2, 4);
			KeyMapper map = new KeyMapper();
			generateForthKey.append(map.getDateMonth(ascii1) + map.getDateMonth(ascii2) + map.getYear(ascii3));
			strBuilder.append(generateForthKey + " ");
		}

		if (index == 5) {
			for (int k = 0; k < childString.length() -1; k+=2) {
				String output = childString.substring(k, (k + 2));
				int decimal = Integer.parseInt(output, 16);
				
				generateFifthKey.append((char)decimal);

			}
			strBuilder.append(generateFifthKey + " ");
		}
		
		if (index == 6) {
			for (int k = 0; k < childString.length() -1; k+=2) {
				String output = childString.substring(k, (k + 2));
				int decimal = Integer.parseInt(output, 16);
				
				generateSixthKey.append((char)decimal);

			}
			strBuilder.append(generateSixthKey);
		}
	}
	
	public String generateFinalKey() {
		return strBuilder.toString();
	}
	
	public static void main(String[] args) {
		DecryptProductKey dp = new DecryptProductKey();
		dp.splitValues();
		System.out.println(dp.generateFinalKey());
	}

}
