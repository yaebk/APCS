public class Functions{
 public static int test(int x){
  return x+1; 
 }
  
 public static boolean makeBricks(int small, int big, int goal){
  return ( (goal - small <= 0) || (big != 0) && (goal % (big * 5) - small <= 0) );
  // return ( (big * 5 + small == goal) || ((big * 5 + small > goal) && (goal % 5 <= small)) );
 }
}
