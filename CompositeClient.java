public class CompositeClient {

    public static void main(String[] args) {
        // Crea parti singole
        Componente monitor = new ParteSingola("Monitor LCD");
        Componente tastiera = new ParteSingola("Tastiera italiana");
        Componente processore = new ParteSingola("Processore Intel I7");
        Componente ram = new ParteSingola("16 GB RAM");
        Componente hardDisk = new ParteSingola("1TB SSD Hard Disk");

    // Un Composto con 3 foglie
    Componente mainSystem = new ParteComposta("Main System" );

    try {
        mainSystem.add( processore  );
        mainSystem.add( ram );
        mainSystem.add( hardDisk );
    }
    catch (ParteSingolaException e){
        e.printStackTrace();
    }

    // Un Composto che è una combinazione di un altro Composto e due Foglie
    Componente computer = new ParteComposta("Computer");
    try{
        computer.add( monitor );
        computer.add( tastiera );
        computer.add( mainSystem );
    }
    catch (ParteSingolaException e){
        e.printStackTrace();
    }
  
    System.out.println("**Cerca di descrivere il componente 'monitor'");
    monitor.descrivi();
    System.out.println("**Cerca di descrivere il componente 'main system'");
    mainSystem.descrivi();
    System.out.println("**Cerca di descrivere il componente 'computer'");
    computer.descrivi();

    // Sbagliato: invocazione di add() su una Foglia
    System.out.println( "**Cerca di aggiungere un componente ad una parte singola (foglia)");
    try{
        monitor.add( mainSystem );
    }
        catch (ParteSingolaException e){
        e.printStackTrace();
    }
    }
}