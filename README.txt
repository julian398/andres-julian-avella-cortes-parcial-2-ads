Andres Julian Avella Cortes

1) El programa desarrollado es una aplicacion simple para aprender sobre las figuras tanto 3D como 2D dando
el perimetro, area, volumen de cada uno de estos, esta aplicacion se divide en 2 menus uno para imagenes complejas
(3D) o simples (2D), la persona empieza eligiendo el menu y despues elige la figura que desea ver

-Lenguaje: Java
-IDE: Visial studio code
-No requiere Ninguna indicacion especial solo correr el main

2)
    a.Factory method
    b.Escogi el factory method ya que sabia que iva a crear varias figuras que tenian elementos en comun y
    metodos similares pero los tipos serian diferentes, ademas si en el futuro quiero añadir nuevas figuras
    es mucho mas facil, por ende factory seria el mejor
    c.Todos los archivos dentro de la carpeta Shapes se extienden de shape y utilizan el mismo builder
    cambiando las funciones necesarias cuando se llama cada una de las figuras

3)
    a.Template method
    b.Sabia que necesitaba por lo menos 2 menus para mi aplicacion dividiendo las figuras 2D y 3D y talvez
    en el futuro quiero entrar en figuras mas complejas, el proceso de ingresar las nuevas operaciones y
    el orden en que se realizan la muestra de estos menus es muy similar pero tiene cambios minimos dentro
    de este en las funciones, para esto usar el template method me dejaria crear mas en el futuro sin tener
    que volver a crear su estructura y orden
    c.Se evidencia dentro de "AbstractMenu" de los que se extienden "SimpleShapeMenu" y "ComplexShapeMenu"