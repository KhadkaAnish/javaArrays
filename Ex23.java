public class Ex23{
   public static void main(String[]args){
       int[]numbers1={1,2,3};
       int[]numbers2=new int[numbers1.length];
       for(int i=0;i<numbers1.length;i++){ 
           numbers2[i]=numbers1[i];
           numbers1[i]*=2;
            System.out.println("the multipied value  is "+ numbers1[i]++);
           
    }
 }
}
