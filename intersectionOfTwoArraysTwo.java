class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();

        // 统计数组1中每个数字出现的次数
        for(int n : nums1){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        // 交集部分
        List<Integer> list = new ArrayList<>();
        // 循环第二个数组
        for(int n:nums2){
            // 查看当前数字在map中的个数
            int count=map.getOrDefault(n,0);
            // 如果个数大于0，说明数组1中也包含该数字
            if(count>0){
                // 将该数字加入交集集合
                list.add(n);
                // 同时将该数字出现次数减一
                map.put(n,count-1);
            }
        }
        // 将list转为数组返回
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
/*
Test results

Runtime: 2 ms, faster than 93.60% of Java online submissions for Intersection of Two Arrays II.
Memory Usage: 39.2 MB, less than 75.94% of Java online submissions for Intersection of Two Arrays II.
*/
