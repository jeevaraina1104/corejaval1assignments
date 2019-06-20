package topic3;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("How was your day today");
		String c1 = "a";
		int lengthOfString = s1.length();
		int occurences_without_a = (s1.replaceAll(c1,"")).length();
		int occurences_with_a = lengthOfString - occurences_without_a;
		System.out.println("The number of occurences of a " +occurences_with_a);
	}

}
