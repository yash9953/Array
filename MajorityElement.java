package ArrayHomeWork;

public class MajorityElement {
          //Boyer Moore Algorithm
          static int majority(int nums[]){
                    int majority_element=0,count=0;
                    for(int i=0;i<nums.length;i++){
                              if(count==0){
                                        majority_element=nums[i];
                              }
                              if(majority_element==nums[i]){
                                        count++;
                              }else{
                                        count--;
                              }
                    }
                    return majority_element;
          } 

          // Element Occurs More than n/2 times where n=arr.length
          static int naivesol(int nums[]){
                    int n=nums.length;
                    int count=0;
                    for(int i=0;i<n;i++){
                              count=1;
                              for(int j=i+1;j<n;j++){
                                        if(nums[i]==nums[j]){
                                                  count++;
                                        }
                                        if(count>n/2&&n%2!=0){
                                                  return nums[i];
                                        }
                                        else if(count>=n/2&&n%2==0){
                                                  return nums[i];
                                        }
                              }
                    }
                    return -1;      
          }
          public static void main(String[] args) {
                    // int nums[]= {2,2,1,1,1,2,2};
                    // int nums[]={3,1,3};
                    int nums[]={1,2,1,2};
                    // O(n^2) by traversing array in 2-d
                    //System.err.println(naivesol(nums));

                    // O(nlog(n)) by using hashmap

                    // Boyer Moore O(n)
                    System.out.println(majority(nums));
          }
}
