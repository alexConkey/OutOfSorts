public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */

  public static void bubbleSort(int[] data){
  boolean swapped = true;
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
  public static void selectionSort(int[] data){
    int size = data.length;
    for(int i = 0; i < size-1; i++){
      int smallest = i;
      for (int j = i+1; j < size; j++){
        if (data[smallest]>data[j]){
          smallest = j;
        }
      }
      int temp = data[smallest];
      data[smallest] = data[i];
      data[i] = temp;
    }
  }
}
