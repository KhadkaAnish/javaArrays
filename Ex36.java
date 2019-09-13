import java.util.Random;
import java.util.Arrays;
public class Ex36{
   public static void main(String[]args){
       int numbers=100;
       int[]scores=randomArrays(numbers);
       System.out.println(Arrays.toString(scores));
    }
    public static int[]randomArrays(int size){
        Random random =new Random();
        int[]scores=new int[size];
       for(int i=0;i<scores.length;i++){ 
           scores[i]=random.nextInt(100);
       }
 
         return scores;
   }
}