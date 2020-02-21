public class Sorting {
    public static void main(String[] args) {
        int[]  someNums = {3, 5, 6, 7, 8, 9, 5};
        int temp;
        for (int a = 0; a< someNums.length - 1; ++a){
            for (int b = 0; b < someNums.length - 1; ++b){
                temp = someNums[b];
                someNums[b] = someNums[b + 1];
                someNums[b + 1] = temp;
            }
        }
        System.out.println("Array: ");
        for (int i : someNums) {
            System.out.print(i + " ");
        }
    }
}
