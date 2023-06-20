package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int [] ans = new int[n];
        Arrays.fill(ans, -1);

        long sum = 0;
        int length = 2*k+1;
        if(length>n) return ans;
        for(int i = 0;i<length;i++){
            sum+=nums[i];
        }
        ans[k] = (int)(sum/length);
        int start = 0 ;
        for(int last = length;last<n;last++){
            sum = sum - nums[start]+ nums[last];
            start++;
            ans[last-k] = (int)(sum/length);
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
