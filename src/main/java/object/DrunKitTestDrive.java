package object;

public class DrunKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.playHat();

        d.snare = false;
        if (d.snare == true) {
            d.playSnare();
        }


    }
}
