import java.util.*;

public class comparator {
    static class Student {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("Varis", 28));
        al.add(new Student("Rehan", 23));
        al.add(new Student("Imran", 28));

        // descending
        // Comparator<Student> byAge = Comparator.comparingInt((Student s) -> s.age).reversed();

        // ascending
        // Comparator<Student> byAge = Comparator.comparingInt(s -> s.age);

        // descending
        // Comparator<Student> byName = Comparator.comparing((Student s) -> s.name).reversed();

        // for tie
        /*
         * Collections.sort(al, Comparator.comparingInt((Student s) -> s.age)
         * .thenComparing((Student s) -> s.name));
         */

        // for tie in reverseOrder
        Collections.sort(al, Comparator.comparingInt((Student s) -> s.age).reversed()
                .thenComparing((Student s) -> s.name, Comparator.reverseOrder()));

        // Comparator<Student> byName = Comparator.comparing(s -> s.name);

        // Collections.sort(al, byName);
        for (Student st : al) {
            System.out.println(st.name + " " + st.age);
        }

        // for 2-d array
        int arr[][] = { { 0, 1 }, { 3, 2 }, { 3, 4 }, { 6, 7 }, { 8, 4 } };

        // ascending first-col
        // Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        // descending first-col
        Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));

        // when tie
        /*
         * Arrays.sort(arr, (a, b) -> {
         * if(a[0] != b[0]) return b[0]-a[0];
         * else return a[1]-b[1];
         * });
         */

        // sort asc on row sum elements
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0] + a[1]));

        // sort desc on row elements
        Arrays.sort(arr, (a, b) -> Integer.compare(b[0] + b[1], a[0] + a[1]));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0]);
        }
    }
}
