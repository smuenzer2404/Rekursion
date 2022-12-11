public class GGT {

    public static void main(String[] args) {
        System.out.println(findGgt(3,2));
        System.out.println(findGgt(4,8));
        System.out.println(findGgt(16,22));
        System.out.println(findGgt(234,567));
        System.out.println(findGgt(56,7));
        System.out.println(findGgt(34,119));
    }


    public static int findGgt(int a, int b) {
        int rest = 0;

        if (b > 0) {
            rest = a % b;
            a = b;
            b = rest;
            return findGgt(a, b);

        } else if (b == 0) ;

        return a;

    }
}


