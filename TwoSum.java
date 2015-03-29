import java.util.HashMap;

public class TwoSum {

    public static void main(String args[]) {
        TwoSum s = new TwoSum();
//        Utils.TreeNode t = new Utils.TreeNode(1);

//        s.maxDepth(t);
    }

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] resultVal = new int[2];
        for(int i = 0; i < numbers.length; i ++) {
            if(map.containsKey(numbers[i])) {
                int index = map.get(numbers[i]);
                if(index < i) {
                    resultVal[0] = index + 1;
                    resultVal[1] = i + 1;
                    break;
                }
            } 
            if(!map.containsKey(numbers[i]))
                map.put(target - numbers[i], i);
        }
    
        return resultVal; 
    }
}
