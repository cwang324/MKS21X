public class Sorts{
    
    public static void printArray(int[] data){
	System.out.print("[");
	for (int i = 0; i < data.length-1; i++){
	    if (i < data.length-1){
		System.out.print(data[i] + ", ");
	    }else{
		System.out.print(data[i]);
	    }
	}
	System.out.print("]");     
    }

   
    
    public static void insertionSort(int[] data){
	for (int nextI = 1; nextI < data.length; nextI++){
	    int curI = nextI;
	    while ( curI > 0 && data[curI-1] > data[curI] ) {
		// swap data[curI=i] and data[curI]
		int copy = data[curI-1];
		data[curI-1]  = data[curI];
		data[curI]=copy;
		curI = curI -1;       
	    }	
	}

    }    
}
    
