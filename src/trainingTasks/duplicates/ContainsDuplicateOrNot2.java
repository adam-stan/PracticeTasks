package trainingTasks.duplicates;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateOrNot2 {

    public static boolean ifCoontainsDuplicate(int[] array) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {

            if(set.contains(array[i])) {
                return true;
            } else {
                set.add(array[i]);
            }
        }
        
    return false;
    }


    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        System.out.println(ifCoontainsDuplicate(array));
    }
    
}
