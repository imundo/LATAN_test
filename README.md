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

<img src="https://github.com/imundo/LATAN_test/blob/master/img/img4.PNG">


Segundo paso: Configrar Application.propertie con el usuario y password de nuestro postgresql para si autenticar la conexion jdbc del Spring ejemplo:

<img src="https://github.com/imundo/LATAN_test/blob/master/img/img1.PNG">

(importante) Ejecutar comando para inicar el Backend Springboot: 
mvn spring-boot:run 

Desde el jar java -jar target/myapplication-0.0.1-SNAPSHOT.jar

# Test
El comando para realizar el test es mvn test: el test se cuentra ubicado en la ruta siguiente 

<img src="https://github.com/imundo/LATAN_test/blob/master/img/img3.PNG">

# FrontEnd
Para realizar el despliege del frontend unicamente se tiene que ejecutar el servidor Apache web y alojar el contenido de la carpeta  FrontEnd-AngularJs ubicado en este proyecto en la carpeta www del apache.


<img src="https://github.com/imundo/LATAN_test/blob/master/img/img2.PNG">


# PostMan 

Lista de Apis: 

AGREGAR EMPLEADO Cumpleaños POST: 

http://localhost:8080/api/v1/birthDay

<img src="https://github.com/imundo/LATAN_test/blob/master/img/img6.PNG">
Listar Empleados cumpleaños GET: 

http://localhost:8080/api/v1/birthDay

<img src="https://github.com/imundo/LATAN_test/blob/master/img/img7.PNG">

Buscar por ID GET:

http://localhost:8080/api/v1/birthDay/birthDay/{id}




