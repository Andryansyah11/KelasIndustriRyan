public class LatihanS {
    static void LuasPersegi(int sisi) {
        int luas=sisi*sisi;
        System.out.println("luas persegi="+luas);
    }

    static void LuasSegitiga() {
        int alas=5;
        int tinggi=10;
        int LuasSegitiga=(alas*tinggi)/2;
        System.out.println("Luas Segitiga="+LuasSegitiga);
    }
    public static void main(String[] args) {
        LuasPersegi(10 );
        LuasSegitiga();
    }
}