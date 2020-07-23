public abstract class Instrument {

    private int i;

    public abstract void play(String n);
    public abstract void adjust();

    public String what(){
        return "Instrument";
    }

}
