# taller03-SOLID
## Integrantes
- César Carlier
- Aaron Carrasco
- José Jaramillo
- Enrique Yugcha
- Joselyne Torres

**Explicación**
1. Debido a que la clase Helado y Pastel se comportan de manera similar, se viola el LSP así que se implementa una clase padre llamada Postre ya que tanto Pastel como Helado son clases que puden extender de Postre sin afectar la lógica del programa.

2. Los métodos anadirquitaraderezos impiden que se pueda agregar otro tipo de postre sin necesidad de modificarlo así que se esta violando el OCP,por lo tanto se decidió colocar un método más general en la clase padre Postre para solucionarlo.

3. Se esta violando el SRP ya que las clases Helado y Pastel utilizando los métodos calcularPrecioFinal() y showPrecioFinal() están teniendo más de una responsabilidad, así que dado que estos métodos se relacionan se crea una clase nueva llamada ManejadorDePrecio.

4. La clase Aderezos solo contenía una enumeración los diferentes aderezos lo que provocaba que deba instanciarse varias veces en otras clases como Helado y Pastel creando dependendencias innecesarias y violando DIP, así que se la convirtió a una clase abstracta logrando que no existan dependencias entre clases sino de una abstracción.

5. Al cambiar el tipo de leche se generaba una excepción que no permitía cambiar la leche aquí se viola el LSP ya que las clases hijas LecheDeslactosada y LecheDescremada no se pueden comportar como su clase padre LecheEntera dado que se producen errores, por lo tanto se procede a utilizar el método usar() en la clase padre LecheEntera para que las hijas lo puedan usar sin errores.
