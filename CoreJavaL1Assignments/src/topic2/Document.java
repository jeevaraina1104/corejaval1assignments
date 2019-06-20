package topic2;

public class Document {

	private String text ;

	public Document(String message_text){
	set_value(message_text);
	}	

	public String toString(){
	return text;
	}

	public void set_value(String settext){
	text = settext;
	}
}
