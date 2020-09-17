public class Generator {
    static int rndNumberInRange(int min, int max){
        return (int)(Math.random() * (max - min)) + min;
    }
}
