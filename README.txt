Andres Julian Avella Cortes

1) El programa desarrollado es una aplicación simple para aprender sobre las figuras tanto 3D como 2D dando
el perímetro, área, volumen de cada uno de estos, esta aplicación se divide en 2 menús uno para imágenes complejas
(3D) o simples (2D), la persona empieza eligiendo el menú y después elige la figura que desea ver

-Lenguaje: Java
-IDE: Visial studio code
-Requiere descargar el JDK de java y extensión de visual studio o usar el IDE de preferencia que soporte java

2)
    a.Factory method
    Escogí el factory method ya que sabia que iba a crear varias figuras que tenían elementos en común y
    métodos similares pero los tipos serian diferentes, además si en el futuro quiero añadir nuevas figuras
    es mucho mas fácil, por ende factory seria el mejor
    c.Todos los archivos dentro de la carpeta Shapes se extienden de shape y utilizan el mismo builder
    cambiando las funciones necesarias cuando se llama cada una de las figuras

3)
    a.Template method
    Sabia que necesitaba por lo menos 2 menús para mi aplicación dividiendo las figuras 2D y 3D y talvez
    en el futuro quiero entrar en figuras mas complejas, el proceso de ingresar las nuevas operaciones y
    el orden en que se realizan la muestra de estos menús es muy similar pero tiene cambios mínimos dentro
    de este en las funciones, para esto usar el template method me dejaría crear mas en el futuro sin tener
    que volver a crear su estructura y orden
    c.Se evidencia dentro de "AbstractMenu" de los que se extienden "SimpleShapeMenu" y "ComplexShapeMenu"