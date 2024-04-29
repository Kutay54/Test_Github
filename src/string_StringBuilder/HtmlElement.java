package string_StringBuilder;

public class HtmlElement {

	public static String htmlElement(String tag, String body) {
		if(tag == null || tag.isEmpty()) {
			return body;
		}
		if(body == null) {
			return "";
		}
		
		return "<" + tag + ">" + body + "</" + tag + ">";
	}
	
	public static String strong(String str) {
		return htmlElement ("strong", str);
	}
	
	public static String emphasized(String str) {
		return htmlElement ("em", str);
	}
	
	
	public static void main(String[] args) {
		System.out.println(htmlElement("strong", "strong is bold"));
		System.out.println(strong("BABA"));
		System.out.println(emphasized("jxgdhf"));
	}

}
