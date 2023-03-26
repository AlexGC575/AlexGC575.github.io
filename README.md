# UParty

## Descripción del proyecto
El proyecto consiste en la realización de una web de gestión de eventos presenciales como bodas, cumpleaños, conciertos,...
Desde esta aplicación el usuario puede crear reservas de eventos
...

## Requisitos del proyecto
En este apartado se detallan los aspectos que debe cumplir la aplicación.

Interacción con el usuario. El usuario una vez inicie sesión, deberá poder gestionar la lista de reservas que está ligada a él en la base de datos, teniendo como restricción no poder modificar de ninguna manera las reservas de otros usuarios. Para llevar a cabo esta interacción se realiza una búsqueda de las reservas de dicho usuario dentro de la base de datos.
De la misma manera el usuario puede gestionar sus direcciones para su uso como dirección del evento previsto.
Otra de las funcionalidades a las que puede acceder el usuario es realizar una reseña de sus reservas.

Se puede acceder a la página web como administrador, que tiene las mismas funcionalidades que el usuario normal y otras extra.
Una de las funcionalidades extra del administrador es la posibilidad de gestionar empresas y los eventos relacionados con estas.
### Diagrama de casos de uso
![UParty_Casosdeuso drawio](https://user-images.githubusercontent.com/114749211/227795838-9628f502-7b0b-4f5c-92d2-4c97af8b56ea.png)
## Esquemas funcionales
### Esquema de flujo
...
### Interacción con la base de datos
Durante el uso de la aplicación se accederá a la base de datos(Operaciones CRUD) mediante la gestión de los siguientes casos de uso:
- Eventos
- Empresas
- Reservas
- Reseñas
Estas interacciones se producen mediante métodos de la clase [NOMBRE DE LA CLASE], accediendo así a la base de datos usando hibernate.
## Diseño de la base de datos
### Diagrama Entidad-Relación
![ENTIDAD-RELACION drawio](https://user-images.githubusercontent.com/114749211/227796237-27f5346e-b3d7-42c4-b84f-0df3093216a0.png)
### Creación de la base de datos[XAMPP/phpMyAdmin]
...
