package sanitization;

public class Sanitizer {

	public static String htmlSanitize(String param) {
		param = param.replaceAll("[^U+0020 a-zA-Z0-9]","");
		return param;
	}
}
