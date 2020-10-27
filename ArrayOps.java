public class ArrayOps{
  public static int sum(int[] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
      sum+= arr[i];
    }
    return sum;
  }
  public static int largest(int[] arr){
    int greatest = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(arr[i]>greatest){
        greatest = arr[i];
      }
    }
    return greatest;
  }
}
