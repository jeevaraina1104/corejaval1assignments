package topic1;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long minutes = Long.parseLong("100000");

		long years = minutes / 525600;

		long remaining_minutes = minutes % 525600;

		long days = remaining_minutes/1440;

		System.out.println( minutes + " minutes is converted to " + years + " years " +days + " days "  );

	}

}
