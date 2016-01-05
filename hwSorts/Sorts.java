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

    public static void selection(int[] data){
	int minI;
	int minVal;
	for (int i=0; i < data.length; i++){
	    minI = findMin(data,i)
		minVal = data[minI];
	    data[minI] = data[i];
	    data[i] = minVal;
	}

    }

    private static int findMin(int[] data, int startI){
	int min = 0;
	int minI = 0;
	for (int i = startI; i<data.length; i++){
	    if (data[i] < min){
		min = data[i];
		minI = i;
	    }
	}
	return minI;		   
    }

}


    
