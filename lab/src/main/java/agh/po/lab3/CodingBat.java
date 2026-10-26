package agh.po.lab3;

public class CodingBat {
    public boolean array123(int[] nums) {
        for (int i=0; i< nums.length-2; i++)
        {
            if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
        }
        return false;
    }
    public int sum67(int[] nums) {
        boolean czysumowac=true;
        int suma=0;
        for (int i=0; i< nums.length; i++)
        {
            if(nums[i]==6) czysumowac=false;
            if(czysumowac==true) suma=suma+nums[i];
            if(nums[i]==7) czysumowac=true;

        }
        return suma;
    }

}
