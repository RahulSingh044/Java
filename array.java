
class Student {

    int rollno;
    String name;
    int marks;
}

public class array {

    public static void main(String[] args) {

        // 1D array 
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        // Multi Dimensional Array 
        int multiArray[][] = new int[4][3];
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray.length; j++) {
                // Generate random number between 1 and 100
                int random = (int) (Math.random() * 100) + 1;
                multiArray[i][j] = random;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged Array
        int ARRAY[][] = new int[3][];
        ARRAY[0] = new int[2];
        ARRAY[1] = new int[3];
        ARRAY[2] = new int[4];
        for (int i = 0; i < ARRAY.length; i++) {
            for (int j = 0; j < ARRAY[i].length; j++) {
                // Generate random number between 1 and 100
                int random = (int) (Math.random() * 100) + 1;
                ARRAY[i][j] = random;
            }
        }
        for (int i[] : ARRAY) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 3D Array
        int array1[][][] = new int[3][3][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                for (int k = 0; k < array1.length; k++) {
                    // Generate random number between 1 and 100
                    int random = (int) (Math.random() * 100) + 1;
                    array1[i][j][k] = random;
                }
            }
        }
        for (int i[][] : array1) {
            for (int j[] : i) {
                for (int k : j) {
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }

        // Array of object
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Rahul";
        s1.marks = 55;

        Student s2 = new Student();
        s2.rollno = 56;
        s2.name = "jay";
        s2.marks = 98;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Govind";
        s3.marks = 88;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int i = 0; i < students.length; i++) {
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }
        // enhanced for loop
        for (Student stud : students) {
            System.out.println(stud.name + ":" + stud.marks);
        }

    }
}
