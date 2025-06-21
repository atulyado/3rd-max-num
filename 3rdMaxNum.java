import java.util.TreeSet;

class Solution {
    public int thirdMax(int[] nums) {
       TreeSet<Integer> set = new TreeSet<>();// store the number in ascending order (smallest to biggest)

       for(int num : nums){
        set.add(num);//store all the number in set
        if(set.size() > 3){//if the set size is more then 3 it's remove the first number is the smallest
            set.remove(set.first());
        }
       }
        if(set.size() < 3){//if the set size less than 3 then return the last one which is the largest one 
            return set.last();

       }
       return set.first();//this return the 3rd largest number which is what we want
       }
       }
