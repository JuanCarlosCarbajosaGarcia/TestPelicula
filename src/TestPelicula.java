public class TestPelicula {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Origen","Christopher Nolan",148);

        System.out.println("Datos pelicula: ");
        pelicula.mostrarInformacion();

        //modificar atributos
        pelicula.setTitulo("Interstellar");
        pelicula.setDirector("Christopher Nolan");
        pelicula.setDuracionMinutos(169);

        System.out.println(pelicula);

        System.out.println("Titulo: "+pelicula.getTitulo());
        System.out.println("Director: "+pelicula.getDirector());
        System.out.println("Duracion minutos: "+pelicula.getDuracionMinutos());

        try {
            pelicula.setTitulo("Alien");
            pelicula.setDirector("Ridley Scott");
            pelicula.setDuracionMinutos(-10);
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }

        pelicula.mostrarInformacion();
    }
}
