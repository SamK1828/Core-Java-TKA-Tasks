package dailytasks;

public class StringTask {
	public static void main(String[] args) {

		StringBuilder s = new StringBuilder("Samarth@28082003");
		String name = s.substring(0, s.indexOf("@"));
		System.out.println("Name: "+name);
		String Birthdate = s.substring(s.indexOf("@") + 1, s.indexOf("@") + 3);
		System.out.println("BirthDate: "+Birthdate);

		String BirthMonth = s.substring(s.indexOf("@") + 3, s.indexOf("@") + 5);
		System.out.println("BirthMonth: "+BirthMonth);

		String BirthYear = s.substring(s.indexOf("@") + 5, s.length());
		System.out.println("BirthYear: "+BirthYear);
	}
}
