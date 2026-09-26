class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int i=0, j = n-1;
        int result =0;
        while(i<j){
            if(people[i] + people[j] <= limit){
                i++;
                j--;
                result++;
            }else{
                j--;
            }
            
        }

        return result+(n-result*2);

    }
}