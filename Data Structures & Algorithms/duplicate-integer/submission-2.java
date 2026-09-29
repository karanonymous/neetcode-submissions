class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hm.add(nums[i]);
        }
        
        return !(hm.size()==nums.length);
 
    }
}
