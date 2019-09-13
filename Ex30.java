import java.util.Arrays;
public class Ex30{
   public static void main(String[]args){
       String [] studentList={"Kalam","Jose","Jani","Ahmed"};
       String studentName ="Kalam";
       search(studentList,studentName);
    }
    public static String search(String[]studentList,String name){
       for(int i=0;i<studentList.length;i++){ 
           if(studentList[i]==name){
           System.out.println("Found Value is "+ studentList[i]);
           
    }
 }
  return "Not Found";
}
}