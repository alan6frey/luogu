package week5;

public class p81 {
	public boolean search(int[] nums, int target) {
        int R=nums.length-1;
        while(R>0&&nums[R]==nums[0]) R--;
        if(R==0) return nums[0]==target;

        int l=0,r=R;
        while(l<r){
            int mid=(l+r+1)>>1;
            if(nums[mid]>=nums[0]) l=mid;
            else r=mid-1;
        }

        if(target>=nums[0]) l=0;
        else{
            l++;
            r=R;
        }

        while(l<r){
            
        }
    }
}
