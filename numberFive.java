
import java.util.Arrays;
import java.util.stream.IntStream;
 
class Main {
    public static void main(String[] args)
    {
      int array[] = {10, 20, 25, 63, 96, 57};
      int size = array.length;
      Arrays.sort(array);
      System.out.println("sorted Array :"+Arrays.toString(array));
      int max = array[size-1];
      System.out.println("largest element is :"+max);
}
}