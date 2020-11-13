import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        if (list1.size() > list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    if (list1.get(i) == list2.get(j)) {
                        return true;
                    }
                }
            }
        }
        else {
            for (int i = 0; i < list2.size(); i++) {
                for (int j = 0; j < list1.size(); j++) {
                    if (list2.get(i) == list1.get(j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        int[] arr = new int[10];

        System.out.println("There are " + countOdd(list) + " odd numbers in your list.");
        if (checkDuplicates(list, list1) == true) {
            System.out.println("There is/are duplicate(s) in your lists.");
        }
        if (checkDuplicates(list, list1) == false) {
            System.out.println("There is/are no duplicate(s) in your lists.");
        }
        System.out.println(convertToArrayList(arr));
    }
}
