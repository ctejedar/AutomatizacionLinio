# AutomatizacionLinio
Se automatizo primer version de la pagina Linio 

Pautas
------

1.- se creo la aplicacion bajo los siguiente entornos : java, selenium, eclipse , manejador de dependencias gradle
2.- se instalaron las siguientes dependencias 
2.1 dependencies {
    // Use JUnit test framework.
    testImplementation 'junit:junit:4.13'

    // This dependency is exported to consumers, that is to say found on their compile classpath.
    api 'org.apache.commons:commons-math3:3.6.1'

    // This dependency is used internally, and not exposed to consumers on their own compile classpath.
    implementation 'com.google.guava:guava:29.0-jre'
    
    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '3.141.59'
 2.2 se creo tres archivos fundamentales
    2.2.1  FileBase.java = clase que me permitira tener todo mis metodos wue serviran para duplicar codigo dentro de la automatizacion.
    2.2.2  NavegarxLaptop = me permitira consummir estos metodos para ejecutarlos dentro de mi clase . esta ultima clase extiende la clase filebase.
    2.2.3  ComprarLaptop_Test = clase tipo Junit la cual organiza a traves del before,test y after para poder correo mi prueba automatizada.
    
 2.3 se creo como recurso una carpeta llamada chromedriver para poder guardar el archvo que emulara el browser.
 2.4 puntos abordados
 
 1- Entrar a Linio
 2- Buscar laptops
 3- Seleccionar APPLE
 4- Seleccionar notebooks
 5- Imprimir el número de resultados
 6- Ordenar por precio ascendente
 7- Asegurar la compra de los 3 primeros resultados
 8- Imprimir en consola los productos seleccionados en el punto 7
 9- Ordenar e imprimir los productos por nombre (ascendente)
 10- Ordenar e imprimir los productos por precio (descendente)
 
    
       
    
}
