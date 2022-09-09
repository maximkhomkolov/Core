package PACKAGE_NAME;public class Task1 {
  public static void main (String[] args){
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }}
        int max = array[0][0];
        int min = array[0][0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(max < array[i][j])
                    max = array[i][j];
                if(min > array[i][j])
                    min = array[i][j];
                sum += array[i][j];

            }}
        int avg = sum / array.length / array[0].length;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
