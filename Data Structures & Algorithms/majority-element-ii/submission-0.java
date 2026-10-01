class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int m=nums.length/3;
        List<Integer> result=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>m){
                result.add(e.getKey());
            }
        }
        return result;
    }
}