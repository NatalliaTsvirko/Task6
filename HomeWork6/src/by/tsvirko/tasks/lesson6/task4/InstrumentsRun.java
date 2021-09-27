package by.tsvirko.tasks.lesson6.task4;

public class InstrumentsRun {
    public static void main(String[] args) {

        Guitar guitar = new Guitar(6);
        Guitar guitarTwo = new Guitar(7);
        Drum drum = new Drum(168);
        Drum drumTwo = new Drum(200);
        Pipe pipe = new Pipe(11);
        Pipe pipeTwo = new Pipe(30);


        Instruments[] instruments = new Instruments[6];
        instruments[0] = guitar;
        instruments[1] = drum;
        instruments[2] = pipe;
        instruments[3] = guitarTwo;
        instruments[4] = drumTwo;
        instruments[5] = pipeTwo;

        for (Instruments instrument : instruments) {
            instrument.play();
        }
    }
}
