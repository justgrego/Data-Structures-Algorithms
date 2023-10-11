class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx >= sx && ty >= sy) {
           
            if (tx > ty) {
                if (sy == ty) {
                    return (tx - sx) % ty == 0;
                }
             
                tx %= ty;
                
            }
            else {
                if (tx == sx) {
                    return (ty - sy) % tx ==0;
                }
                else {
                    ty %= tx;
                }
            }
        }
        return false;
    }
   
}