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
  public static int[] sumRows(int[][] matrix){
    int[] finalArr = new int[matrix.length];
    for(int i = 0; i < finalArr.length; i++){
      finalArr[i] = sum(matrix[i]);
    }
    return finalArr;
  }
  public static int[] largestInRows(int[][] matrix){
    int[] finalArr = new int[matrix.length];
    for(int i = 0; i < finalArr.length; i++){
      finalArr[i] = largest(matrix[i]);
    }
    return finalArr;
  }
  public static int sum(int[][] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        sum += arr[i][j];
      }
    }
    return sum;
  }
}
