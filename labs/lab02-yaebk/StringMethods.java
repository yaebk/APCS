public class StringMethods{

  //return the index of s that contains the first occurence of target, 
  //or -1 if it is not present. Obviously do not use indexOf().
  public static int myIndexOf(String s, String target){
    //length of string we want to know the index of 
    int strLength = target.length();
	  
    //for loop checking if a substring of 's' has 'target' and returns first index of that substring
    for (int i = 0; i < s.length() - strLength; i++) {
      if (s.substring(i, i + strLength).equals(target)) {
        return i;
      }
    }
    return -1;
  }
  
  //return 0 if the strings are equal
  //return a positive number if other is less than s
  //return a negative number if other is greater than s
  public static int myCompareTo(String s, String other){
    //if the strings are equal, returns 0 
    if (s.equals(other)) {
      return 0;
    }
	  
    //intializes as length of 's'
    int lengthBig = s.length();
	  
    //check if other.length > s.length. if so, replace value of lengthBig
    if (s.length() < other.length()) {
      lengthBig = other.length();
    }
    
    //checks if string is bigger, smaller
    for (int i = 0; i < lengthBig; i++) {
      if (i > other.length() - 1) {
        return 1;
      }
      if (i > s.length() - 1) {
        return -1;
      }
      if (s.charAt(i) != other.charAt(i)) {
        return s.charAt(i) - other.charAt(i);
      }
    }
    return 0;
  }
  }
	
  //returns number given String, assuming String is formatted as a valid integer
  public static int myParseInt(String s, String number){
      //intialize variables 
      boolean negative = false;
      int number = 0;      
	  
      //check if number is negative
      if (s.charAt(0)=='-') {
         negative = true;            
      }
	  
      //number = first number - '0' (0 is ascii value 48, subtract by that to convert str to int)
      else {
         number = number * 10 + s.charAt(0) - '0';
      }
	  
      //continuously multiply by 10 to allow for the next digit to be added and increase in size each digit it increases
      for (int i = 1; i < s.length(); i++) {
         number = number * 10 + s.charAt(i) - '0';           
      }
	  
      //makes it negative
      if (negative) {
         number = 0 - number;
      }
	  
      //return output
      return number;
}
