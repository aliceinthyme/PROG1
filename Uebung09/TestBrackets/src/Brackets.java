public class Brackets {

    public static void main(String[] args) throws Exception {
        String s = args[0];
        if(testBrackets(s)) {
            System.out.println("Correct expression");
        } else {
            System.out.println("False expression");
        }
    }
    public static boolean testBrackets(String s) {
        int rBr = 0;
        int sBr = 0;
        int cBr = 0;
        for(int i = 0; i < s.length(); i++) {
            System.out.println("i: "+i);
            char a = s.charAt(i);
            switch (a) {    //checks amount of brackets
                case '(':
                    rBr += 1;
                    break;
                case ')':
                    rBr -= 1;
                    if(!checkOpen(s, '(', i)) {
                        return(false);
                    }
                    break;
                case '[':
                    sBr += 1;
                    break;
                case ']':
                    sBr -= 1;
                    if(!checkOpen(s, '[', i)) {
                        return(false);
                    }
                    break;
                case '{':
                    cBr += 1;
                    break;
                case '}':
                    cBr -= 1;
                    if(!checkOpen(s, '{', i)) {
                        return(false);
                    }
                    break;
            }
        }
        if(rBr == 0 && cBr == 0 && sBr == 0) {
            return(true);
        } else {
            return(false);
        }
    }
    public static boolean checkOpen(String s, char a, int b) {
        b--;
        int rBr = 0;
        int sBr = 0;
        int cBr = 0;
        while(s.charAt(b) != a) {
            char bchar = s.charAt(b);
            System.out.println(bchar);
            switch (bchar) {    
                case '(':
                    rBr -= 1;
                    break;
                case ')':
                    rBr += 1;
                    break;
                case '[':
                    sBr -= 1;
                    break;
                case ']':
                    sBr += 1;
                    break;
                case '{':
                    cBr -= 1;
                    break;
                case '}':
                    cBr += 1;
                    break;
            }
            b--;
            System.out.println(rBr+" "+sBr+" "+cBr);
        }
        if(rBr == 0 && cBr == 0 && sBr == 0) {
            return(true);
        } else {
            return(false);
        }
    }
}

/*
    ((([ )))]
 */