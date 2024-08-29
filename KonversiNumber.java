public class KonversiNumber {
    public static void main(String[] args) {
        //Widening
        byte tipeDataByte = 10;
        short tipeDataShort = tipeDataByte;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;
        float tipeDataFloat = tipeDataLong;
        double tipeDataDoubel = tipeDataFloat;

        //Narrowing
        int tipeDataint2 = 127;
        byte tipeDatabyte2 =(byte) tipeDataint2;
        System.out.println(tipeDatabyte2);
    }
}
