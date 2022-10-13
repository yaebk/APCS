public class Driver{
 public static void main(String[]args){
   /**
   *Examples how to call a method from a different java file:
   */
   //store it in a variable
   int x = Functions.test(1);
   //print it
   System.out.println(Functions.test(2));
   //print it with context!
   System.out.println("test(test(4)) =" + Functions.test(Functions.test(4)));
  
  
   /**
   *Example Test Cases:
   *Note that they print the intended output in addition to the actual output.
   */
   System.out.println("makeBricks(1,1,2) should be false result:"+Functions.makeBricks(1,1,2));
   System.out.println("makeBricks(1,1,6) should be true result:"+Functions.makeBricks(1,1,6));
   System.out.println("makeBricks(0,1,1) should be false result:"+Functions.makeBricks(0,1,1));
   System.out.println("makeBricks(1,0,5) should be false result:"+Functions.makeBricks(1,0,5));
   System.out.println("makeBricks(0,0,6) should be false result:"+Functions.makeBricks(0,0,6));
   System.out.println("makeBricks(9,1,7) should be true result:"+Functions.makeBricks(9,1,7));
   System.out.println("makeBricks(0,4,7) should be false result:"+Functions.makeBricks(0,4,7));
   System.out.println("makeBricks(0,0,0) should be true result:"+Functions.makeBricks(0,0,0));
   System.out.println("makeBricks(1,1,1) should be true result:"+Functions.makeBricks(1,1,1));
   System.out.println("makeBricks(7,7,7) should be true result:"+Functions.makeBricks(7,7,7));
   System.out.println("makeBricks(10,10,0) should be true result:"+Functions.makeBricks(10,10,0));
 }
}
