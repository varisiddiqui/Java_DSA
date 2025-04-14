public class freq {
    public static void print(int arr[]) {
        int arr1[] = new int[10];
        int c = 0;
        for (int i = 0; i < 10; i++) {
            c = 0;
            for (int j = 0; j < arr.length; j++) {
                int ch = arr[j];
                if (i == ch) {
                    c++;
                }
            }
            arr1[i] = c;
        }
        int cnt = 0;
        for (int i = 0; i < arr1.length; i++) {
            int ch = arr1[i];
            if (ch > 0) {
                cnt = 0;
                for (int j = 0; j < arr1.length; j++) {
                    if (ch == arr1[j]) {
                        cnt++;
                    }
                }
                if (cnt > 1) {
                    System.out.print("false" + " ");
                } else {
                    System.out.print("true" + " ");
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 1, 1, 3};
        print(arr);

    }
}