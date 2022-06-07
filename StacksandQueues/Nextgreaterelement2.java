//TC -> O(n)
//SC -> O(n)
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1;i<nums.length;i++){
            while(st.size()>0 && nums[st.peek()]<nums[i]){
                res[st.pop()] = nums[i];
            }
            st.push(i);
        }
        for(int i=0;i<nums.length-1;i++){
            while(st.size()>0 && nums[st.peek()]<nums[i]){
                res[st.pop()] = nums[i];
            }
        }
        while(st.size()>0){
            res[st.pop()] = -1;
        }
        return res;
    }
}
