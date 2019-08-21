package sanitization;

public class SpecialCharacterSanitize {

	public String htmlSanitazi(String param) {
		param = param.replaceAll("[^U+0020 a-zA-Z0-9]","");
		return param;
	}
}
