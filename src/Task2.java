package PACKAGE_NAME;public class Task2 {
  public static void main(String[] args) {
        int[] array = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        for (int i = 0; i < array.length; i++) {
            int position = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    position = j;
                    min = array[j];
                }
            }
            array[position] = array[i];
            array[i] = min;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
