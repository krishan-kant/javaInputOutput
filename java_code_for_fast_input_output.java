
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;

class MyClass
{
    
    void solve()throws IOException
    {        
        /**************** write your code here ***********************/
        
        // taking integer as input
        int a = ni();
        
        // taking long as input
        long l = nl();
        
        // taking double as input
        double d = nd();
        
        // taking char as input
        char c = nc(); 
        
        // taking integer array as input
        int size = 5;  //size of array
        int[] arr = na(size);
        
        // taking a string as input
        String s = ns(); //it reads continuous set of character until separated by space or newline
                         //it doesn't read complete line
        
        System.out.println(a);
        System.out.println(l);
        System.out.println(d);
        System.out.println(c);
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
        System.out.println(s);
        
        
        /*
         * Note that above functions are user-defined functions(see their definition below, just in case you are interested
         * The inputs can have any number of spaces and newlines between them, above function does not read them
         * A sideeffect of this is that nc() or ns() cannot be used to store whitespaces
         */
        
        /*********** Sample Input 1 ***********/
        /*
        12 143      323.3242   e      1     2 3   4   5 sdfsadfsdf  akfdfd
         */
        
        /*********** Sample Input 2 ***********/
        /* 
        12
              143
         
        323.3242
        
                            e
        1   2    3
        
        4   
        
        5
        
        sdfdsafdsd    sfsadfd
         */
    }
    
    
    public static void main(String[] args)throws IOException
    {
        new MyClass().solve();
    }   
    
    private byte[] inbuf = new byte[1024];
    public int lenbuf = 0, ptrbuf = 0;     
    InputStream is=System.in;
    private int readByte() {
        if (lenbuf == -1) {
            throw new InputMismatchException();
        }
        if (ptrbuf >= lenbuf) {
            ptrbuf = 0;
            try {
                lenbuf = is.read(inbuf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (lenbuf <= 0) {
                return -1;
            }
        }
        return inbuf[ptrbuf++];
    }

    private boolean isSpaceChar(int c) {
        return !(c >= 33 && c <= 126);
    }

    private int skip() {
        int b;
        while ((b = readByte()) != -1 && isSpaceChar(b));
        return b;
    }

    private double nd() {
        return Double.parseDouble(ns());
    }

    private char nc() {
        return (char) skip();
    }

    private String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while (p < n && !(isSpaceChar(b))) {
            buf[p++] = (char) b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    private char[][] nm(int n, int m) {
        char[][] map = new char[n][];
        for (int i = 0; i < n; i++) {
            map[i] = ns(m);
        }
        return map;
    }

    private int[] na(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ni();
        }
        return a;
    }

    private int ni() {
        int num = 0, b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if (b == '-') {
            minus = true;
            b = readByte();
        }

        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if (b == '-') {
            minus = true;
            b = readByte();
        }

        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
}