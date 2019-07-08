package app;
import arrayutils.ArrUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myList[] = {"Bozo", "Foobar", "Delta", "Foozball", "Demo", "Money", "Zoo"};
		int foundIndexes[];
		boolean found = false;
		
		
		System.out.println("This is the of the arrayHasExactMatch and indexOfOccurenceInArray methods");
		System.out.println("The array to test contains the following items:");
		for(int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		System.out.println();
		System.out.println("Scenario 1");
		found = ArrUtil.arrayHasExactMatch (myList, "zo", false);
		System.out.println("arrayHasExactMatch " + found);
		System.out.println("Scenario 2");
		found = ArrUtil.arrayHasExactMatch (myList, "zoo", false);
		System.out.println("Scenario 3");
		System.out.println("arrayHasExactMatch " + found);
		System.out.println("Scenario 4");
		found = ArrUtil.arrayHasExactMatch (myList, "zoo", true);
		System.out.println("arrayHasExactMatch " + found);
		System.out.println("Scenario 5");
		found = ArrUtil.arrayHasExactMatch (myList, "foo", true);
		System.out.println("arrayHasExactMatch " + found);
		System.out.println("Scenario 6");
		found = ArrUtil.arrayHasExactMatch (myList, "foo", false);
		System.out.println("arrayHasExactMatch " + found);
		System.out.println("Scenario 7");
		found = ArrUtil.arrayHasExactMatch (myList, "delta", true);
		System.out.println("arrayHasExactMatch " + found);
		System.out.println("Scenario 8");
		found = ArrUtil.arrayHasExactMatch (myList, "Delta", true);
		System.out.println("arrayHasExactMatch " + found);
		
		System.out.println("Scenario 9");
		foundIndexes = ArrUtil.indexOfOccuranceInArray (myList, "zo", false);
		System.out.println("indexOfOccuranceInArray  " + foundIndexes[0]);
		System.out.println("Scenario 10");
		foundIndexes = ArrUtil.indexOfOccuranceInArray (myList, "zoo", false);
		System.out.println("indexOfOccuranceInArray  " + foundIndexes[0]);
		System.out.println("Scenario 11");
		foundIndexes = ArrUtil.indexOfOccuranceInArray (myList, "zoo", true);
		System.out.println("indexOfOccuranceInArray  " + foundIndexes[0]);
		System.out.println("Scenario 12");
		foundIndexes = ArrUtil.indexOfOccuranceInArray (myList, "foo", true);
		System.out.println("indexOfOccuranceInArray  " + foundIndexes[0]);
		System.out.println("Scenario 13");
		foundIndexes = ArrUtil.indexOfOccuranceInArray (myList, "foo", false);
		System.out.println("indexOfOccuranceInArray  " + foundIndexes[0]);
		System.out.println("Scenario 14");
		foundIndexes = ArrUtil.indexOfOccuranceInArray (myList, "delta", true);
		System.out.println("indexOfOccuranceInArray  " + foundIndexes[0]);
		System.out.println("Scenario 15");
		foundIndexes = ArrUtil.indexOfOccuranceInArray (myList, "Delta", true);
		System.out.println("indexOfOccuranceInArray  " + foundIndexes[0]);
		System.out.println("This works");
	}

}
