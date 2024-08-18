class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        
        int sum = 0;
        for(int i= 0; i<arr.length; i++){
            sum += arr[i];
        }
        
        int nsum = 0;
        
        for(int i = 0; i<arr.length; i++){
            sum = sum - arr[i];
            nsum = nsum + arr[i];
            
            if(sum == nsum){
                return true;
            }
            
        }
        return false;
    }
}
