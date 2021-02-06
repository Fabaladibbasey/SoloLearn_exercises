package exercise;
import java.util.*;

public class DriveLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int result = timeSpent(scan);
		System.out.println(result);
	}

 public static int timeSpent(Scanner scan) {
	 
	 String yourName = scan.next();
	 int agents = scan.nextInt();
	 String othersName = scan.nextLine();
	 othersName = scan.nextLine();
	 int timeTook = 0;
	 String[] othersNames = othersName.split(" ");
	 List<String> names = new ArrayList<String>();
	 names.add(yourName);
	 for(int i = 0; i < othersNames.length; i++) {
		 names.add(othersNames[i]);
	 }
	 
	 System.out.println(names);
	 
	 Collections.sort(names);
	 System.out.println(names);
	int stop = names.indexOf(yourName) + 1;;
	for(int j = agents; j <= stop ; j += agents) {
			System.out.println(j);
			System.out.println(stop);
			timeTook += 20;
	}
	 return timeTook;
	 
 }
}
