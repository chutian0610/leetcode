package info.victorchu.q6;

public class ZTransformer {
    public String convert(String s, int numRows) {
        if(numRows == 1){return s;}
        int len = s.length();
        StringBuffer sb = new StringBuffer();
        int cyclecount = 2*numRows-2;
        for(int i = 0;i<numRows;i++){
            if(i ==0 || i== numRows-1){
                int begin = i;
                while(begin<len){
                    sb.append(s.charAt(begin));
                    begin = begin + cyclecount;
                }
            }else{
                int begin1 = i;
                int begin2 = cyclecount -i;
                while(begin1<len){
                    sb.append(s.charAt(begin1));
                    if (begin2<len){
                        sb.append(s.charAt(begin2));
                    }
                    begin1 = begin1+cyclecount;
                    begin2 = begin2+cyclecount;
                }
            }
        }
        return sb.toString();

    }
}
