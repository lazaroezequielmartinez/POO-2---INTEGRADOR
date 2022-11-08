# Trabajo en equipo

#### Sosa Ayelen: Tareas
#### Ramirez Silvia: Wireframe y Casos de uso
#### Martinez Lazaro Ezequiel: Wireframe y Casos de uso
#### Duarte Laura: Wireframe y Casos de uso
#### Carlos Pereyra: UML - Modelo
#### Luciano Lopez: UML 

# Diseño OO

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/DocModelo.JPG)

# Wireframe y caso de uso
## En esta iteración, abarcaremos unicamente los casos de uso con sus correspondientes wireframes respectivos a los roles del diseñador gráfico y administrador.  

---
**CU: Visualizar pedido.**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/18_CU_Vis_Ped.JPG)

**Actores:** Diseñador gráfico.

1. Este caso de uso comienza cuando el ususario desea visualizar un pedido.
2. El ususario ingresa en el buscardor el ID del pedido.
3. El sistema verifica el ID del pedido.
4. El sistema confirma la existencia del predido devolviendo la información del mismo en una lista.
5.  El usuario cierra la consulta y termina el caso de uso.
   
**Curso alternativo**


1. El sistema verifica que el identificador del pedido es incorrecto, indica error y finaliza el caso de uso.
2. El sistema verifica que no hay existencia del pedido, indica al usuario el mensaje de _El pedido solicitado no existe_ y finaliza el caso de uso.
---
**CU: Modificar estado de diseño.**

**Actores:** Diseñador gráfico.

1. Este caso de uso inicia cuando el usuario desea modificar el estado de un pedido. 
2. El usuario se encuentra en la pantalla de _Visuazar pedido_. 
3. El usuario presiona el boton _Editar_ que se encuentra al lado derecho de cada fila, correspondiente al pedido que se desee modificar.
4. El sistema habilita la edición del campo _ESTADO_.
5. El usuario selecciona la opción correspondiente del menu desplegable.
6. El usuario presiona el boton _Actualizar_.
7. El sistema registra los cambios.

**Curso alternativo:**

6. El usuario  presiona el boton _Cancelar_.
7. El sistema verifica que el usuario cancela la acción de modificar estado del pedido y finaliza el caso de uso.
---
**CU: Solicitar informe de ventas**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/21_CU_Inform_Ventas.JPG)

**Actores:** Administrador.
1. Este caso de uso inicia cuando el usuario desee obtener un informe de las ventas semanales.
2. El usuario se encuentra en la pantalla de _Inicio_.
3. El usuario presiona el boton de _Informe de ventas_ 
4. El sistema muestra un informe y graficos de las ventas realizadas en la semana. 

**Curso alternativo**

5. El usuario presiona el boton _Imprimir_.
6. El sistema inicia la impresión del informe.

---
**CU: Solicitar informe de stock**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/23_CU_Inform_Ventas.JPG)

**Actores:** Administrador.
1. Este caso de uso inicia cuando el usuario desee obtener un informe de stock.
2. El usuario se encuentra en la pantalla de _Inicio_.
3. El usuario presiona el boton de _Informe de stock_ 
4. El sistema muestra un informe de los materiales en stock y los utilizados en la semana. 

**Curso alternativo**

5. El usuario presiona el boton _Imprimir_.
6. El sistema inicia la impresión del informe.
---
**CU: Solicitar informe de clientes habituales**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/24_CU_Inform_Ventas.JPG)

**Actores:** Administrador y encargado de impresión.

1. Este caso de uso inicia cuando el usuario desee obtener un informe de clientes habituales de los ultimos 30 días.
2. El usuario se encuentra en la pantalla de _Inicio_.
3. El usuario presiona el boton de _Informe de cientes habituales_ 
4. El sistema muestra un informe de los clientes habituales en los ultimos 30 días. 

**Curso alternativo**

5. El usuario presiona el boton _Imprimir_.
6. El sistema inicia la impresión del informe.

---
# Tareas
## Lista para esta iteración:
- Para poder realizar estas actividades es necesario tener la base de datos creada y su funcionamiento.
- Para poder iniciar sesión debo ser personal de atención al público, diseñador gráfico, personal de impresión y/o administrador; tener usuario y contraseña.
- Para visualizar pedidos debo ser diseñador gráfico, tener id del pedido.
- Para modificar el estado de diseño debo ser diseñador gráfico, tener sesión iniciada.
- Para modificar el estado de diseño debo ser diseñador gráfico, tener sesión iniciada.
- Para solicitar informe y acciones de ventas debo ser administrador para tener información de las ventas semanales e informe de stock, tener sesión iniciada.
- Para solicitar un informe de clientes habituales debo ser administrador y encargado de impresión para tener un informe de los clientes habituales de los ultimos 30 dias, tener sesión iniciada.
  
# Restropectiva
## Reflexión: Se avanzó mucho con respecto a la entrega anterior a comparacion de las demás, el trabajo está creciendo de forma exponencial. De acuerdo  con estos resultados consideramos que estamos por buen camino. 
