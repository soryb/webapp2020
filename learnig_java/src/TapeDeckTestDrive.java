class DrumKit {

    boolean snare = true; // creation du type bool si on le definit dans la fonction main il yaura erreur

    void playTopHat() {
        System.out.println("ding ding da - ding");
    }

    void playSnare() {
        System.out.println("bang bang ba - bang");
    }
}

class DrumKitTestDrive {
    public static void main(String[] args) {


        DrumKit d = new DrumKit();
        d.snare = false;
        d.playSnare();
        d.playTopHat();

        if (d.snare) {// if(d.snare==true)
            d.playSnare();
        }
    }


}
