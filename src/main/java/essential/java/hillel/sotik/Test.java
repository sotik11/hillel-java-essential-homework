package essential.java.hillel.sotik;

class Test {

    public static void main(String[] args) {
        String str = "Леша на полке клопа нашел";
//        String strTemp = str.toUpperCase().replace(" ", "");
//        int n = 1;
        compare(str);
//        recurseCompare(strTemp, n);
    }

    static void compare(String str) {
        String strTemp = str.toUpperCase().replace(" ", "");
        String strTempReverse = new StringBuffer(strTemp).reverse().toString();
        int result = strTemp.compareTo(strTempReverse);
        if (result == 0) {
            System.out.println("yes");
        } else {
            System.out.println("false");
        }
    }
}
