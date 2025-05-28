    public class computadora {
    private String marca;
    private String modelo;
    private boolean encendido;

    public computadora(String marca, String modelo ){
        this.marca = marca;
        this.modelo = modelo;
        this.encendido = false;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
        }
        public boolean isEncendido() {
            return encendido;
        }
        public void setEncendido(boolean encendido) {
        this.encendido = encendido;
        }
        public void encender(){
        if(!encendido){
            encendido = true;
            System.out.println("Encendido");
        }
        else if (encendido){
            System.out.println("la computadora esta prendida");
        }
        }
        public void apagar(){
        if(encendido){
            encendido = false;
            System.out.println("apagando");
        }
            else if (!encendido){
                System.out.println("la computadora esta apagada");
            }
        }
            }
