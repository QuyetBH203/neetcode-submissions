class Solution {
    public int mySqrt(int x) {
        // int l = 1, r = x;
        // int res = 0;

        // while (l <= r) {
        //     int m = l + (r - l) / 2;
        //     if ((long) m * m > x) {
        //         r = m - 1;
        //     } else if ((long) m * m < x) {
        //         l = m + 1;
        //         res = m;
        //     } else {
        //         return m;
        //     }
        // }

        // return res;
        if(x ==0){
            return 0;
        }
        int res =1;
        for(int i=1;i <= x; i++){
            if((long) i *i > x){
                return res;
            }
            res = i;
        }

        return res;

    }
}