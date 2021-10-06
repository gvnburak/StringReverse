

public class StringReverse {


    public static void main(String[] args) {

        String str = "ABCD";
        String rev = "";

        //method 1
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }
        System.out.println(rev);
    }
}











































































        //method 2
//
//        char a[] = str.toCharArray();
//        for (int i = a.length - 1; i >= 0; i--) {
//            rev = rev + a[i];
//        }
//        System.out.println(rev);
//    }
//}


        //method 3
//        StringBuffer sb = new StringBuffer(str);
//        System.out.println(sb.reverse());
//    }
//
//}

