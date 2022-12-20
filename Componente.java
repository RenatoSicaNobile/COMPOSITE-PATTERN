public abstract class Componente {

    public String nome;

    public Componente(String ilNome){
        nome = ilNome;
    }

    public abstract void descrivi();

        public void add(Componente c) throws ParteSingolaException {
        if (this instanceof ParteSingola)
            throw new ParteSingolaException( );
        }

        public void remove(Componente c) throws ParteSingolaException{
        if (this instanceof ParteSingola)
            throw new ParteSingolaException( );
        }

        public Componente getFiglio(int n){
            return null;
        }
}

