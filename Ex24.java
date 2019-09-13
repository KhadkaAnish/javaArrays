public class Ex24{
   public static void main(String[]args){
       double[] tempForecast={26.0,24.5,22.3};
      double[] tempForecastcopy=new double[3];
       for(int i=0;i<tempForecast.length;i++){ 
           tempForecastcopy[i] = tempForecast[i];
           
            System.out.println("the copied value is"+ tempForecastcopy[i]);
           
    }
 }
}
