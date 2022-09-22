public class Array {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Rafi";
        stringArray[1] = "Khalish";
        stringArray[2] = ":)";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[2] = ":(";
        System.out.println(stringArray[2]);

        String[] stringArray2 = new String[3];

        String[] namaNama = {
                "Rafi", " ", "Khalish"
        };

        namaNama[0] = null;

        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Rafi", "Khalish"},
                {"Riznida", "Nida"},
                {"Budi"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
