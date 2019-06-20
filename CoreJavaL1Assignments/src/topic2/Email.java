package topic2;

public class Email extends Document {
	
	
	String sender;
	String recipient;
	String title;

	public Email(String message_text, String email_sender, String email_recipient, String email_title){
	super(message_text);
	 sender = email_sender ;
	 recipient = email_recipient;
	 title = email_title;
	 }

	public String getsender(){
	return sender;
	}

	public String getrecipient(){
		return recipient;
	}

	public String gettitle(){
		return title;
	}

	public void setsender(String newsender){
		sender = newsender;
	}
	public void setrecipient(String newrecipient){
		recipient = newrecipient;
	}

	public void settitle(String newtitle){
		title = newtitle;
	}

	public String toString(){
		return "\nSender: " + sender + "\nRecipient: " + recipient + "\nTitle: " + title + "\nmessage_body: " + super.toString() ;
	}

	public static void main(String args[]){
		
		String text1 = "Content that need to be displayed";
		Email e1 = new Email( text1, "Jeeva" , "Vinay", "Java Coding");
		String concatenated_string = e1.toString();
		System.out.println("The concatenated string is" +concatenated_string);
	}
}
