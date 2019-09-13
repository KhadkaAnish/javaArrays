public class Ex11{
   public static void main(String[]args){
       int[]numbers={2,4,6,8,10};
       for(int i=0;i<5;i++){
           System.out.print(numbers[i]);
           numbers[i]+=1;
           System.out.println("+1 is equal to "+ numbers[i]++);
    }
 }
}
