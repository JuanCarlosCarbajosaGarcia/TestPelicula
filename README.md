1. Pelicula 
Crea la clase Pelicula con los atributos privados titulo, director y duracionMinutos. 
2.  •Constructor con los tres atributos que use los setters. Así la validación se escribe una sola vez y nunca existe una película en estado inválido. 
3. •Getters y setters de los tres atributos. 
4. • setTitulo y setDirector no admiten valores nulos ni vacíos. setDuracionMinutos solo admite valores mayores que 0. 
5. • Un valor inválido lanza IllegalArgumentException con un mensaje claro. 
6. • toString() y un método mostrarInformacion(). Clase de prueba: TestPelicula. 
7. Crea una película, muéstrala, modifica sus atributos y comprueba que un valor inválido lanza la excepción (captúrala con try-catch y muestra el mensaje).