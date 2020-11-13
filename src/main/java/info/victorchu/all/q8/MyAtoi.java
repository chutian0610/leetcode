package info.victorchu.all.q8;

public class MyAtoi {
    /**
     * 简单状态机
     *
     * 一个二维数组，
     * 每行表示一个状态，每列表示一种输入，其中值填写为跳转状态。
     */
     int[][] states = new int[][]{
        // start-index:0
        {0,1,2,3},
        // signed-index:1
        {3,3,2,3},
        // number-index:2
        {3,3,2,3},
        // end-index:3
        {3,3,3,3}
    };

    /**
     * 输入状态判断函数
     * <pre>
     *   分为四种情况:
     *      1. 空白字符
     *      2. 正负号
     *      3. 数字
     *      4. 异常
     * </pre>
     *
     *
     * @param c 字符
     * @return
     */
     int getCharType(Character c){
        if (Character.isWhitespace(c)) {
            return 0;
        }
        if (c == '+' || c == '-') {
            return 1;
        }
        if (Character.isDigit(c)) {
            return 2;
        }
        return 3;
    }

    boolean push(Character c){
        int tranform  = getCharType(c);
        // 迁移状态
        state = states[state][tranform];
        if (state == 2) {
            // 注意 Integer.valueof(c) 返回的是ASCLL值
            result = result * 10 + (c-'0');
            if(sign ==1){
                if(result > Integer.MAX_VALUE){
                    return false;
                }
            }else {
                if (result * sign < Integer.MIN_VALUE) {
                    return false;
                }
            }
        }
        else if (state == 1) {
            sign = c == '+' ? 1 : -1;
        }
        return true;
    }
     /**
      * 结果
      */
     Long result = 0L;

    /**
     * 1 正 (默认是正)
     * -1 负
     */
    int sign = 1;

    /**
     * 当前状态
     */
     int state =0;


    public int myAtoi(String str) {

        for (Character c : str.toCharArray()){
            if(!this.push(c)){
                // 溢出中断
                return sign==1 ? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
        }
        return ( sign*result.intValue());
    }
}