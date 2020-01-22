# LATAN_test
TEst latan api rest + frontEnd

# Requisitos Previos 

Tener instalado y asignadas con las variables de entorno correspondiente:
- Maven
- Java 8
- Servidor Apache web ( VertrigoServ) Solo web
- Postgresql 9 o superior
 
# Configuracion Inicial

Antes de comenzar los pasos siguientes, es necesario ejecutar los siguientes comando el la carpeta source (src) para bajar dependencias necesario y copilar:
mvn clean install

Si desea saltar test:
mvn clean install -DskipTests

# Pasos a seguir

Primer paso: realizar es crear una base de datos en tu Postgresql llamada employees para realizar las persistencias de datos y almacenamientos de estos, ejemplo:

Segundo paso: Configrar Application.properti con el usuario y password de nuestro postgresql para si autenticar la conexion jdbc del Spring ejemplo:

(importante) Ejecutar comando para inicar el Backend Springboot: 
mvn spring-boot:run 

Desde el jar java -jar target/myapplication-0.0.1-SNAPSHOT.jar

# FrontEnd
Para realizar el despliege del frontend unicamente se tiene que ejecutar el servidor Apache web y alojar el contenido de la carpeta  FrontEnd-AngularJs ubicado en este proyecto en la carpeta www del apache.







