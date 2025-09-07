public class unique {
    public static void main(String[] args) {
        int[] arr={12,23,34,12,56,23,34,56,90};
        System.out.println(unique1(arr));


    }
    private static int unique1(int[]arr){
        int unique = 0;
        for(int n : arr){
            unique ^=n;
        }
        return unique;
    }
}
