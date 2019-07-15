class Generics {
	// Determine if the contents of two arrays are the same.
	static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
	// If array lengths differ, then the arrays differ.
	if(x.length != y.length) {
		return false;
	}
	for(int i=0; i < x.length; i++) {
		if(!x[i].equals(y[i])) {
			return false; // arrays differ	
		}
	}
	return true; // contents of arrays are equivalent
}
	
	public static <T> void swap(T[] array, int left, int right){
        T temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }
}