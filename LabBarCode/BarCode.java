
public class BarCode implements Comparable {
    // instance variables
    private String _zip;
    private int _checkDigit;
    private static final String[] ref = {"||:::",":::||","::|:|","::||:",":|::|",
					 ":|:|:",":||::","|:::|","|::|:","|:|::"};
    

    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.

    public BarCode(String zip) {
	if (zip.length()!=5){
	    throw new RuntimeException();
	}
	_zip = zip;
        int _checkDigit = checkSum();        	    
    }
    
    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
	_zip = x._zip;
	_checkDigit = x._checkDigit;
    }


    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int sum = 0;
	for (int i=0; i<_zip.length(); i++){
	    sum += (int)_zip.charAt(i);
	}
	return sum;
    }
    
    
    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      

    public String toString(){
	String retString = _zip + _checkDigit + " |";
	int i = 0;
	while (i<5){
	    retString += ref[(int)_zip.charAt(i)];
	    i++;
	}
	retString+=ref[_checkDigit] + "|";
			     
	return retString;
    }

    
    public boolean equals(Object other){
	BarCode b = (BarCode) other;
        return _checkDigit==b._checkDigit &&_zip.equals(b._zip);
    }
    
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.

  
    public int compareTo(Object other){
	if (other instanceof BarCode ){
	    BarCode b = (BarCode)other;
	    int stringCmpResult =  this._zip.compareTo(b._zip);
	    if ( stringCmpResult != 0 ){
		return stringCmpResult;
	    }else{
		return (this._checkDigit - b._checkDigit);
	    } 	
	}
	else{
	    throw new RuntimeException("Cannot comppare incompatible objects");
	}	
    }
    // postcondition: compares the zip + checkdigit 
 
}
