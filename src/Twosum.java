public class Twosum {

  int  fun(int [] nums,int target){

      int out =-1;
         for (int i =0;i<nums.length;i++){
             for(int j=i+1;j< nums.length;j++){

                 if(nums[i]+nums[j]==target){
                     System.out.println(nums[i]+""+nums[j]);
                    return out =2;

                 }


             }


         }


      return out;
  }

    public static void main(String[] args) {
        Twosum t= new Twosum();

        int []nums = {2,7,11,15};
        int target = 13;
        int ll = t.fun(nums, target);
        System.out.println(ll);


    }


}
