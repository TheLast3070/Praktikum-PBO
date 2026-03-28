public class percobaan2 {
    int a, b;
    char aritmatika;
    
    percobaan2(int a, int b, char aritmatika) {
        this.a = a;
        this.b = b;
        this.aritmatika = aritmatika;
    }

    void hitung() {
        switch (aritmatika) {
            case '+':
                System.out.println("Hasil : " + (a + b));
                break;
            case '-':
                System.out.println("Hasil : " + (a - b));
                break;
            case '*':
                System.out.println("Hasil : " + (a * b));
                break;
            case '/':
                System.out.println("Hasil : " + (a / b));
                break;
            default:
                System.out.println("aritmatik tak jelas");
                break;
        }
}
    public static void main(String[] args) {
        percobaan2 percobaan = new percobaan2(7, 8, '*');
        percobaan.hitung();
    }
}