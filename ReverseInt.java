public class ReverseInt {

    public int reverse(int x) {
        boolean nega=false;
        if (x<0) {
            nega = true;
            x = -x;
        }
        long out = 0; 
        while(x/10 != 0){
            out = out*10 + x%10;
            x = x/10;
        }
        out = out*10 + x%10;
        
        if(out>0x7FFFFFFF) return 0;
        if(nega == true) return -(int)out;
        return (int)out;
    }
}
