import java.util.Arrays;
public class Ex32{
   public static void main(String[]args){
       int [] values={1,2,3,4,5};
       int total=0;
       reduce(values,total);
    }
    public static int reduce(int[]Arrays,int total){
       for(int i=0;i<Arrays.length;i++){ 
           total=total + Arrays[i];
           System.out.println("Reduce value is : " + total);
    
    }
 
         return total;
}
}