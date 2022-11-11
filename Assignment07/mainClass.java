package Assignment07;


// * First Part of the Assignment 
// * MergeSort an array of integers 

public class mainClass {
  static int counter = 0;

  void Merge(int array[], int left, int middle, int right){

    int array1 = middle - left + 1;
    int array2 = right - middle;

    int leftArray[] = new int [array1];
    int rightArray[] = new int[array2];

    for(int i = 0; i < array1; i++){

      leftArray[i] = array[left + i];
      counter++;
    } 
    for(int j = 0; j < array2; j++) {
      rightArray[j] = array[middle + 1 + j];
      counter++;
    }

    int i = 0;
    int j = 0;
    int k = left;

    while(i < array1 && j < array2){
      if(leftArray[i] <= rightArray[j]){
        array[k] = leftArray[i];
        i++;
        counter++;
      } else{
        array[k] = rightArray[j];
        j++;
        counter++;
      }
      k++;
      counter++;
    }
    
    while( i < array1) {
      array[k] = leftArray[i];
      i++;
      k++;
      counter++;
    }
    while(j < array2) {
      array[k] = rightArray[j];
      j++;
      k++;
      counter++;
    }
  }

  void MergeSort (int array[], int first, int right) {

    if(first < right) {

      int mid = (first + right) / 2;
      counter++;
      MergeSort(array, first, mid);
      counter++;
      MergeSort(array, mid + 1, right);
      counter++;
      Merge(array, first, mid, right);
      counter++;
    }
  }

  static void displayArray(int array[]) {
    int n = array.length;
    for(int i = 0; i < n; ++i) {
      System.out.print(array[i] + " ");
      counter++;
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int myArray[] = {2, 15, 23, 7, 5};
    counter = counter - myArray.length;
    mainClass newSort = new mainClass();

    System.out.println("---------------------------------");
    System.out.println("Original array that was created");
    displayArray(myArray);
    System.out.println("---------------------------------");

    newSort.MergeSort(myArray, 0, myArray.length -1);
    System.out.println("Array after being sorted");
    displayArray(myArray);
    System.out.println("---------------------------------");
    System.out.println("Total number of operations needed to sort the array: "+counter);
  
  }
}
