public class Test {
    
    // Vår konstruktor i klassen Test
    // En konstruktor är det första som anropas när vi skapar ett objekt, här kan vi lägga till nyttiga
    //funktioner.
    public Test() {
        startTestGame(); // kallar på en annan metod i klassen.


    }

    // en metod som är privat men bara nås av klassen, dvs konstruktorn kallar på den här när objektet skapas
    // och metoden körs.
    private void startTestGame() {

        System.out.println("Welcome to the game");
    }
}
