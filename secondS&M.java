import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } 
            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println(secondSmallest + " " + secondLargest);

        sc.close();
    }
}













// class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         Arrays.sort(arr);

//         int smallest = arr[0];
//         int secondSmallest = -1;

//         for (int i = 1; i < n; i++) {
//             if (arr[i] != smallest) {
//                 secondSmallest = arr[i];
//                 break;
//             }
//         }

//         int largest = arr[n - 1];
//         int secondLargest = -1;

//         for (int i = n - 2; i >= 0; i--) {
//             if (arr[i] != largest) {
//                 secondLargest = arr[i];
//                 break;
//             }
//         }

//         System.out.println(secondSmallest + " " + secondLargest);

//         sc.close();
//     }
// }