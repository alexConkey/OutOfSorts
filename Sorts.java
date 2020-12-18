public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  boolean swapped = true;
  public static void bubbleSort(int[] data){
    while (swapped){
      swapped = false;
      for(int i = 0; i < data.length-1; i++){
        int temp;
        if (data[i]>data[i+1]) {
          temp = data[i+1];
          data[i+1] = data[i];
          data[i] = temp;
          swapped = true;
        }
      }
    }
  }
}
