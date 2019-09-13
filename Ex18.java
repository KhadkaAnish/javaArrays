import java.util.Arrays;
public class Ex18{
   public static void printArray(String[]shoppingList){
       System.out.print(Arrays.toString(shoppingList));
    }
    public static void main(String[]args){
       String []shoppingList={"Mango","Strawberry","Banana","Avocado","Pineapple"};
       printArray(shoppingList);
 }
}
