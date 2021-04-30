package excepciones;

public class Verificador {
    int numeroActual;

    public Verificador() {
        this.numeroActual = 1;
    }
    
    public void verificar(int num){
        if(this.numeroActual != 0){
            try{
                esIgual(num);
                if(this.numeroActual < 3) this.numeroActual++;
                else reiniciar();
            }
            catch(IndexOutOfBoundsException e){
                this.numeroActual = 0;
            }
        }
    }
    
    private void esIgual(int num){
        if(this.numeroActual != num) throw new IndexOutOfBoundsException();
    }
    
    public void reiniciar(){
        this.numeroActual = 1;
    }
}
