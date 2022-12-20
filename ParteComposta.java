import java.util.Vector;

public class ParteComposta extends Componente {
    private Vector figli ;
    public ParteComposta(String ilNome) {
    super(ilNome);
    figli = new Vector();
}

public void descrivi(){
    System.out.println("Componente: " + nome);
    System.out.println("Composto da:");
    System.out.println("{");
    int lunghezzaVettore = figli.size();
    for( int i=0; i< lunghezzaVettore ; i ++ ) {
        Componente c = (Componente) figli.get( i );
        c.descrivi();
    }
    System.out.println("}");
}

public void add(Componente c) throws ParteSingolaException {
    figli.addElement(c);
}

public void remove(Componente c) throws ParteSingolaException{
    figli.removeElement(c);
    }

    public Componente getFiglio(int n) {
        return (Componente)figli.elementAt(n);
    }
}
