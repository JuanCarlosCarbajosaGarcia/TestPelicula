public class Pelicula {

    private String titulo;
    private String director;
    private int duracionMinutos;

    //constructor
    public Pelicula(String titulo, String director, int duracionMinutos) {
        this.titulo = titulo;
        this.director = director;
        this.duracionMinutos = duracionMinutos;
    }

    //getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El titulo no puede ser nulo ni estar vacio");
        }
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
        if(director == null || director.trim().isEmpty()) {
            throw new IllegalArgumentException("El director no puede ser nulo ni estar vacio");
        }
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        if (duracionMinutos <= 0) {
            throw new IllegalArgumentException("La duracion debe ser mayor que 0 minutos");
        }
        this.duracionMinutos = duracionMinutos;
    }

    //metodo mostrar informacion
    public void mostrarInformacion(){
        System.out.println(toString());
    }

    //Override de toString
    @Override
    public String toString() {
        return "Pelicula ["+
                "Titulo = '"+titulo+'\''+
                ", director = '"+director+'\''+
                ", duracionMinutos = "+duracionMinutos+" Minutos"+
                ']';
    }
}
