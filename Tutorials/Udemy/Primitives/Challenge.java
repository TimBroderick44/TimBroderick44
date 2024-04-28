public class Challenge {
    public static void main(String[] args){
    byte myByte = 10;
    short myShort = 20;
    int myInt = 50;

    long myLong = 50_000L + (10L * (myByte + myInt + myShort));

    System.out.println(myLong);
    }
}
