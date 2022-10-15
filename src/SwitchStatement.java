public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "F";

        switch (nilai){
            case "A":
                System.out.println("Wow nilai anda luar biasa");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda lulus");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }
    }
}
