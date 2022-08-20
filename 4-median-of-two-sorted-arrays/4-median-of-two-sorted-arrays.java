class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        if(arr2.length<arr1.length) return findMedianSortedArrays(arr2,arr1);
        
        int low=0,high=arr1.length,n1=arr1.length,n2=arr2.length;
        while(low<=high)
        {
            int cut1=(low+high)>>1;//mid of first array
            int cut2=(n1+n2+1)/2-cut1;
            //finding l1,l2,r1,and r2
             int l1=(cut1==0)? Integer.MIN_VALUE : (arr1[cut1-1]);               
             int l2=(cut2==0)? Integer.MIN_VALUE : (arr2[cut2-1]); 
            
             int r1=(cut1==n1)? Integer.MAX_VALUE : (arr1[cut1]);                                          int r2=(cut2==n2)? Integer.MAX_VALUE : (arr2[cut2]); 

            //check for validity
            if((l1<=r2) && (l2<=r1))
            {
                if((n1+n2)%2==0)
                
                    return ((Math.max(l1,l2)+Math.min(r1,r2))/2.0);
                
            else  
                return Math.max(l1,l2);
            }
            else if(l1>r2)
                {
                    high=cut1-1;
                }
            else
            
                low=cut1+1;
            
            
            
             

        }
        
        return 0.0;
        
        
        
        
        
        
    }
}