package info.victorchu.all.q7;

public class ReverseInt {

    public int reverse1(int x) {
        int y = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x/10;
            if (y > Integer.MAX_VALUE/10 || (y == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (y < Integer.MIN_VALUE/10 || (y == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            y = y * 10 + pop;
        }
        return y;
    }

    public int reverse2(int x) {
        if(x == Integer.MIN_VALUE){return 0;}
        int negative=1;
        if( x<0 ) {
            negative = -1;
            x = -x;
        }

        long y = x%10;

        while( x/10 != 0 ) {
            x /= 10;
            y *= 10;
            y += x%10;
        }

        if(y>Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) (negative*y);
        }
    }

}
