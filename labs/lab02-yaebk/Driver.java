public class Driver{
 public static void main(String[]args){
  System.out.print(StringMethods.myIndexOf("Hard","a") + "expecting 1");  
  System.out.print(StringMethods.myIndexOf("Hard","ard") + "expecting 1");
  System.out.print(StringMethods.myIndexOf("GooGooGaGa","go") + "expecting 0"); 
  System.out.print(StringMethods.myIndexOf("GooGooGaGa","Ga") + "expecting 6"); 
  System.out.print(StringMethods.myCompareTo("Hard","hard") + "expecting -1"); 
  System.out.print(StringMethods.myCompareTo("hard","Hard") + "expecting 1"); 
  System.out.print(StringMethods.myCompareTo("GooGooGaGa","GooGooGaGa") + "expecting 0"); 
  System.out.print(Stringmethods.myParseInt("123") + "expecting 123"); 
  System.out.print(Stringmethods.myParseInt("-123") + "expecting -123"); 
  System.out.print(Stringmethods.myParseInt("0") + "expecting 0"); 
 }
}
