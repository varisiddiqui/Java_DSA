public class sortedSearch {
    public static void search(int arr[][]) {// its my logic bro
        int r = 0;
        int c = arr[0].length - 1;
        int key =63;
        int cellValue = arr[0][arr[0].length - 1];

        while (cellValue != key) {
            if (key < cellValue) {
                c--;
                if (r > arr.length - 1 || c < 0) {
                    System.out.println(key + " is not found in the array");
                    System.exit(0);
                }

                cellValue = arr[r][c];
            } else {
                r++;
                if (r > arr.length - 1 || c < 0) {
                    System.out.println(key + " is not found in the array");
                    System.exit(0);
                }

                cellValue = arr[r][c];
            }

        }
        System.out.println(key + " found at index " + r + "," + c);
    }

    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 },
                         { 15, 25, 35, 45 }, 
                         { 27, 29, 37, 48 },
                         { 32, 33, 39, 50 } };
        search(arr);
    }
}