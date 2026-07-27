class Solution {
    public int[] searchRange(int[] arr, int target) {
        int first=first(arr,target);
        int last=last(arr,target);
        return new int []{first,last} ;
    }
    public int first(int [] arr,int target){
        int left=0,right=arr.length-1,ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>target){
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                ans=mid;
                right=mid-1;
            }
        }
        return ans;
    }
    public int last(int []arr,int target){
         int left=0,right=arr.length-1,ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>target){
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                ans=mid;
                left=mid+1;
            }
        }
        return ans;
    }
}