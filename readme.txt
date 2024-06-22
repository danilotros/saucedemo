Instrucciones de Instalación y Ejecución

Requisitos de Instalación:
- Java version 17
- Gradle 8.4
- Google Chrome (versión más reciente)

Configuración del Entorno:
1. Instalar Java version 17: Descarga e instala Java JDK 17 desde el sitio web oficial de Oracle o desde tu proveedor preferido.
2. Instalar Gradle 8.4: Descarga e instala Gradle 8.4 desde el sitio web oficial de Gradle o mediante tu gestor de paquetes preferido.
3. Instalar Google Chrome: Descarga e instala la versión más reciente de Google Chrome desde el sitio web oficial.

Configuración de Variables de Entorno:
- Configura las variables de entorno JAVA_HOME y GRADLE_HOME para apuntar a las ubicaciones de instalación de Java y Gradle, respectivamente.

Ejecución del Aplicativo:
1. Asegúrate de haber realizado la instalación y configuración de las variables de entorno de Java y Gradle de acuerdo a las versiones especificadas anteriormente, así como tener instalado Google Chrome.
2. Abre una terminal o línea de comandos en el directorio donde se encuentra el proyecto.
3. Ejecuta el siguiente comando para compilar, ejecutar las pruebas y generar reportes: gradle clean test aggregate
Este comando limpiará el proyecto, ejecutará las pruebas y generará los reportes utilizando Gradle.

4. Posteriormente se ejecutará Google Chrome para visualizar los resultados.

Visualización de Resultados:
1. Después de ejecutar el comando anterior, Google Chrome se abrirá automáticamente.
2. Navega hasta la siguiente ruta en el proyecto: target/site/serenity/index.html
3. Abre el archivo index.html en Google Chrome para visualizar los resultados detallados de las pruebas.


¡Disfruta de tu aplicación y tus pruebas automatizadas
