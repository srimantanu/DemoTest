import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class KeyMapper {
	Map<String,String> keyValueMapper  = new HashMap<String, String>();
	Map<String,String> dateValueMapper = new HashMap<String, String>();
	
	public String getDateMonthValue(String key)
	{
		keyValueMapper.put("00", "A");
		keyValueMapper.put("01", "B");
		keyValueMapper.put("02", "C");
		keyValueMapper.put("03", "D");
		keyValueMapper.put("04", "E");
		keyValueMapper.put("05", "F");
		keyValueMapper.put("06", "G");
		keyValueMapper.put("07", "H");
		keyValueMapper.put("08", "I");
		keyValueMapper.put("09", "J");
		keyValueMapper.put("10", "K");
		keyValueMapper.put("11", "L");
		keyValueMapper.put("12", "M");
		keyValueMapper.put("13", "N");
		keyValueMapper.put("14", "O");
		keyValueMapper.put("15", "P");
		keyValueMapper.put("16", "Q");
		keyValueMapper.put("17", "R");
		keyValueMapper.put("18", "S");
		keyValueMapper.put("19", "T");
		keyValueMapper.put("20", "U");
		keyValueMapper.put("21", "V");
		keyValueMapper.put("22", "W");
		keyValueMapper.put("23", "X");
		keyValueMapper.put("24", "Y");
		keyValueMapper.put("25", "Z");
		keyValueMapper.put("26", "a");
		keyValueMapper.put("27", "b");
		keyValueMapper.put("28", "c");
		keyValueMapper.put("29", "d");
		keyValueMapper.put("30", "e");
		keyValueMapper.put("31", "f");
		return keyValueMapper.get(key);
	}
	
	public String getYearValue(String key)
	{
		
		dateValueMapper.put("00", "AB");
		dateValueMapper.put("01", "BB");
		dateValueMapper.put("02", "CJ");
		dateValueMapper.put("03", "Dk");
		dateValueMapper.put("04", "Em");
		dateValueMapper.put("05", "F1");
		dateValueMapper.put("06", "GO");
		dateValueMapper.put("07", "HL");
		dateValueMapper.put("08", "IT");
		dateValueMapper.put("09", "Jj");
		dateValueMapper.put("10", "KB");
		dateValueMapper.put("11", "LS");
		dateValueMapper.put("12", "MT");
		dateValueMapper.put("13", "NA");
		dateValueMapper.put("14", "OB");
		dateValueMapper.put("15", "PC");
		dateValueMapper.put("16", "QD");
		dateValueMapper.put("17", "RE");
		dateValueMapper.put("18", "SF");
		dateValueMapper.put("19", "TG");
		dateValueMapper.put("20", "UH");
		dateValueMapper.put("21", "VI");
		dateValueMapper.put("22", "WJ");
		dateValueMapper.put("23", "XK");
		dateValueMapper.put("24", "YL");
		dateValueMapper.put("25", "ZM");
		dateValueMapper.put("26", "aN");
		dateValueMapper.put("27", "bO");
		dateValueMapper.put("28", "cP");
		dateValueMapper.put("29", "dQ");
		dateValueMapper.put("30", "er");
		dateValueMapper.put("31", "fS");
		dateValueMapper.put("32", "gT");
		dateValueMapper.put("33", "hU");
		dateValueMapper.put("34", "iV");
		dateValueMapper.put("35", "jW");
		dateValueMapper.put("36", "kX");
		dateValueMapper.put("37", "ly");
		dateValueMapper.put("38", "mz");
		dateValueMapper.put("39", "n1");
		dateValueMapper.put("40", "o2");
		dateValueMapper.put("41", "p3");
		dateValueMapper.put("42", "q4");
		dateValueMapper.put("43", "r5");
		dateValueMapper.put("44", "s6");
		dateValueMapper.put("45", "t7");
		dateValueMapper.put("46", "u8");
		dateValueMapper.put("47", "v9");
		dateValueMapper.put("48", "44");
		dateValueMapper.put("49", "45");
		dateValueMapper.put("50", "46");
		dateValueMapper.put("51", "47");
		dateValueMapper.put("52", "48");
		dateValueMapper.put("53", "49");
		dateValueMapper.put("54", "50");
		dateValueMapper.put("55", "51");
		dateValueMapper.put("56", "52");
		dateValueMapper.put("57", "53");
		dateValueMapper.put("58", "54");
		dateValueMapper.put("59", "55");
		dateValueMapper.put("60", "56");
		dateValueMapper.put("61", "57");
		dateValueMapper.put("62", "58");
		dateValueMapper.put("63", "59");
		dateValueMapper.put("64", "60");
		dateValueMapper.put("65", "61");
		dateValueMapper.put("66", "62");
		dateValueMapper.put("67", "63");
		dateValueMapper.put("68", "64");
		dateValueMapper.put("69", "65");
		dateValueMapper.put("70", "66");
		dateValueMapper.put("71", "67");
		dateValueMapper.put("72", "68");
		dateValueMapper.put("73", "69");
		dateValueMapper.put("74", "70");
		dateValueMapper.put("75", "71");
		dateValueMapper.put("76", "72");
		dateValueMapper.put("77", "73");
		dateValueMapper.put("78", "74");
		dateValueMapper.put("79", "75");
		dateValueMapper.put("80", "76");
		dateValueMapper.put("81", "77");
		dateValueMapper.put("82", "78");
		dateValueMapper.put("83", "79");
		dateValueMapper.put("84", "80");
		dateValueMapper.put("85", "81");
		dateValueMapper.put("86", "82");
		dateValueMapper.put("87", "83");
		dateValueMapper.put("88", "84");
		dateValueMapper.put("89", "85");
		dateValueMapper.put("90", "86");
		dateValueMapper.put("91", "87");
		dateValueMapper.put("92", "88");
		dateValueMapper.put("93", "89");
		dateValueMapper.put("94", "90");
		dateValueMapper.put("95", "9A");
		dateValueMapper.put("96", "9B");
		dateValueMapper.put("97", "9C");
		dateValueMapper.put("98", "9D");
		dateValueMapper.put("99", "9E");
		return dateValueMapper.get(key);
	}
	
	
	public  String getDateMonth(String value) {
		keyValueMapper.put("00", "A");
		keyValueMapper.put("01", "B");
		keyValueMapper.put("02", "C");
		keyValueMapper.put("03", "D");
		keyValueMapper.put("04", "E");
		keyValueMapper.put("05", "F");
		keyValueMapper.put("06", "G");
		keyValueMapper.put("07", "H");
		keyValueMapper.put("08", "I");
		keyValueMapper.put("09", "J");
		keyValueMapper.put("10", "K");
		keyValueMapper.put("11", "L");
		keyValueMapper.put("12", "M");
		keyValueMapper.put("13", "N");
		keyValueMapper.put("14", "O");
		keyValueMapper.put("15", "P");
		keyValueMapper.put("16", "Q");
		keyValueMapper.put("17", "R");
		keyValueMapper.put("18", "S");
		keyValueMapper.put("19", "T");
		keyValueMapper.put("20", "U");
		keyValueMapper.put("21", "V");
		keyValueMapper.put("22", "W");
		keyValueMapper.put("23", "X");
		keyValueMapper.put("24", "Y");
		keyValueMapper.put("25", "Z");
		keyValueMapper.put("26", "a");
		keyValueMapper.put("27", "b");
		keyValueMapper.put("28", "c");
		keyValueMapper.put("29", "d");
		keyValueMapper.put("30", "e");
		keyValueMapper.put("31", "f");
		String key = "";
		for (Entry<String, String> entry : keyValueMapper.entrySet()) {
            if (entry.getValue().equals(value)) {
                key = entry.getKey();
                break;
            }
        }
		
		return key;
	}
	
	public  String getYear(String value) {
		dateValueMapper.put("00", "AB");
		dateValueMapper.put("01", "BB");
		dateValueMapper.put("02", "CJ");
		dateValueMapper.put("03", "Dk");
		dateValueMapper.put("04", "Em");
		dateValueMapper.put("05", "F1");
		dateValueMapper.put("06", "GO");
		dateValueMapper.put("07", "HL");
		dateValueMapper.put("08", "IT");
		dateValueMapper.put("09", "Jj");
		dateValueMapper.put("10", "KB");
		dateValueMapper.put("11", "LS");
		dateValueMapper.put("12", "MT");
		dateValueMapper.put("13", "NA");
		dateValueMapper.put("14", "OB");
		dateValueMapper.put("15", "PC");
		dateValueMapper.put("16", "QD");
		dateValueMapper.put("17", "RE");
		dateValueMapper.put("18", "SF");
		dateValueMapper.put("19", "TG");
		dateValueMapper.put("20", "UH");
		dateValueMapper.put("21", "VI");
		dateValueMapper.put("22", "WJ");
		dateValueMapper.put("23", "XK");
		dateValueMapper.put("24", "YL");
		dateValueMapper.put("25", "ZM");
		dateValueMapper.put("26", "aN");
		dateValueMapper.put("27", "bO");
		dateValueMapper.put("28", "cP");
		dateValueMapper.put("29", "dQ");
		dateValueMapper.put("30", "er");
		dateValueMapper.put("31", "fS");
		dateValueMapper.put("32", "gT");
		dateValueMapper.put("33", "hU");
		dateValueMapper.put("34", "iV");
		dateValueMapper.put("35", "jW");
		dateValueMapper.put("36", "kX");
		dateValueMapper.put("37", "ly");
		dateValueMapper.put("38", "mz");
		dateValueMapper.put("39", "n1");
		dateValueMapper.put("40", "o2");
		dateValueMapper.put("41", "p3");
		dateValueMapper.put("42", "q4");
		dateValueMapper.put("43", "r5");
		dateValueMapper.put("44", "s6");
		dateValueMapper.put("45", "t7");
		dateValueMapper.put("46", "u8");
		dateValueMapper.put("47", "v9");
		dateValueMapper.put("48", "44");
		dateValueMapper.put("49", "45");
		dateValueMapper.put("50", "46");
		dateValueMapper.put("51", "47");
		dateValueMapper.put("52", "48");
		dateValueMapper.put("53", "49");
		dateValueMapper.put("54", "50");
		dateValueMapper.put("55", "51");
		dateValueMapper.put("56", "52");
		dateValueMapper.put("57", "53");
		dateValueMapper.put("58", "54");
		dateValueMapper.put("59", "55");
		dateValueMapper.put("60", "56");
		dateValueMapper.put("61", "57");
		dateValueMapper.put("62", "58");
		dateValueMapper.put("63", "59");
		dateValueMapper.put("64", "60");
		dateValueMapper.put("65", "61");
		dateValueMapper.put("66", "62");
		dateValueMapper.put("67", "63");
		dateValueMapper.put("68", "64");
		dateValueMapper.put("69", "65");
		dateValueMapper.put("70", "66");
		dateValueMapper.put("71", "67");
		dateValueMapper.put("72", "68");
		dateValueMapper.put("73", "69");
		dateValueMapper.put("74", "70");
		dateValueMapper.put("75", "71");
		dateValueMapper.put("76", "72");
		dateValueMapper.put("77", "73");
		dateValueMapper.put("78", "74");
		dateValueMapper.put("79", "75");
		dateValueMapper.put("80", "76");
		dateValueMapper.put("81", "77");
		dateValueMapper.put("82", "78");
		dateValueMapper.put("83", "79");
		dateValueMapper.put("84", "80");
		dateValueMapper.put("85", "81");
		dateValueMapper.put("86", "82");
		dateValueMapper.put("87", "83");
		dateValueMapper.put("88", "84");
		dateValueMapper.put("89", "85");
		dateValueMapper.put("90", "86");
		dateValueMapper.put("91", "87");
		dateValueMapper.put("92", "88");
		dateValueMapper.put("93", "89");
		dateValueMapper.put("94", "90");
		dateValueMapper.put("95", "9A");
		dateValueMapper.put("96", "9B");
		dateValueMapper.put("97", "9C");
		dateValueMapper.put("98", "9D");
		dateValueMapper.put("99", "9E");
		
		String key = "";
		for (Entry<String, String> entry : dateValueMapper.entrySet()) {
            if (entry.getValue().equals(value)) {
                key = entry.getKey();
                break;
            }
        }
		
		return key;
	}
}