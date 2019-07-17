package basicSorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numArr[] = { 10, 3, 4, 15, 7, 9, 1, 21 };
		
		String strArr[] = {"claude", "Phil", "lois", "clark", "Arthur", "Mera", "bruce"};
		
		IntegerSort intSort = (array, order) -> {
			Integer[] list = Arrays.stream( numArr ).boxed().toArray( Integer[]::new );
			// true == ascending
			if(order) {
				Generics.selectionSort(list);
				System.out.print("\nSorted ASC: ");
				Generics.printArray(list);
			}else {
				Generics.selectionSortDecending(list);
				System.out.print("\nSorted DESC: :");
				Generics.printArray(list);
			}
			return list;
		};
		
		StringSort stringSort = (string, order, sensitive) -> {
			
			if(order & sensitive) {
				Generics.selectionSortCaseSensitive(string);
				System.out.print("\nSorted ASC and Case Sensitive On: ");
				Generics.printArray(string);
			}else if(order & !sensitive) {
				Generics.selectionSortCaseInsensitive(string);
				System.out.print("\nSorted ASC and Case Sensitive Off: ");
				Generics.printArray(string);
			}else if(!order & sensitive) {
				Generics.selectionSortDecendingCaseSensitive(string);
				System.out.print("\nSorted DESC and Case Sensitive On: ");
				Generics.printArray(string);
			}else if(!order & !sensitive) {
				Generics.selectionSortDecendingCaseInsensitive(string);
				System.out.print("\nSorted DESC and Case Sensitive Off: ");
				Generics.printArray(string);
			}
			return  string;
		};
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + ", ");
		}
		System.out.println();
		System.out.println(intSort.sort(numArr, true));
		System.out.println(intSort.sort(numArr, false));
		System.out.println();
		Generics.printArray(strArr);
		System.out.println();
		System.out.println(stringSort.sort(strArr, true, true));
		System.out.println(stringSort.sort(strArr, true, false));
		System.out.println(stringSort.sort(strArr, false, true));
		System.out.println(stringSort.sort(strArr, false, false));

	}

}
