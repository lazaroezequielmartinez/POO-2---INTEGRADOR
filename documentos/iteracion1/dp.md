# Trabajo en equipo

### Sosa Ayelen: Tareas
### Silvia Ramirez: Wireframe y Casos de uso
### Martinez Lazaro Ezequiel: Wireframe y Casos de uso
### Duarte Laura: Wireframe y Casos de uso
### Carlos Pereyra: UML - Modelo
### Luciano Lopez: UML 

# Diseño OO

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/Modelo.JPG)

# Wireframe y caso de uso
## Casos de uso extendido

**CU: Inicio de sesión**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/1_CU.JPG)

**Actores:** Personal de atención al público, diseñador gráfico, personal de impresión y administrador.

1. Este caso de uso comienza cuando el usuario desea ingresar al sistema.
2. El usuario ingresa usuario y contraseña.
3. El usuario presiona el boton _Acceder_.
4. El sistema comprueba los datos de inicio de sesión.
5. El usuario accede al sistema.

**Curso alternativo**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/2_CU_1.JPG)

4. El sistema no reconoce los datos ingresados.
5. El sistema devuelve una ventana emergente de alerta de usuario no registrado.

**Curso alternativo**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/3_CU_2.JPG)

4. El usuario no completó todos los campos.
5. El sistema devuelve una ventana emergente de alerta.
6. El usuario completa los campos.
7. El usuario presiona el botón _Acceder_.
8. El usuario accede al sistema.

---

**CU:Registrar cliente.**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/4_CU_RegClie.JPG)

**Actores:** Personal de atención al público.

1. Este caso de uso comienza cuando el usuario desea registrar un  nuevo cliente.
2. El sistema solicita que el usuario complete los campos con los datos del nuevo cliente.
3. El usuario completa los campos con los datos correspondientes.
4. El usuario presiona el boton _Guardar_.
5. El sistema comprueba si los datos del cliente fueron ingresados en el formato correcto.
6. El sistema registra los datos del nuevo cliente.

**Curso alternativo**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/5_CU_RegClie_Alt1.JPG)

5. El sistema verifica que el identificador del cliente ya existe, indica error al registrar cliente, el mismo ya existe en el sistema y finaliza el caso de uso.

**Curso alternativo**

4. El usuario  presiona el boton _Cancelar_.
5. El sistema verifica que el usuario cancela la acción de registrar cliente y finaliza el caso de uso.

**Curso alternativo**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/6_CU_RegClie_Alt2.JPG)

3. El usuario olvidó cargar algún campo.
4. El usuario presiona _Guardar_ 
5. El sistema alerta los campos no rellenados.
6. El usuario carga los datos faltantes.
7. El usuario vuelve a presionar el boton _Guardar_.
8. El sistema registra los datos del cliente.

---
**CU: Modificar datos del cliente.**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/7_CU_Mod_Clie.JPG)

**Actores:** Personal de atención al público.
1.  Este caso de uso comienza cuando el usuario desea modificar los datos del cliente.
2. El usuario se encuentra en la pantalla de _Consultar cliente_.
3. El usuario presiona el boton _Editar_ que se encuentra al lado derecho de cada fila, correspondiente al cliente que se desee modificar. 
4. El sistema habilita la edición de los campos de esa fila. 
5. El usuario modifica los datos deseados.
6. El usuario presiona el boton _Actualizar_.
7. El sistema registra los cambios.

**Curso alternativo:**

6. El usuario  presiona el boton _Cancelar_.
7. El sistema verifica que el usuario cancela la acción de modificar estado del cliente y finaliza el caso de uso.
---

1) **CU: Consultar clientes.**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/8_CU_Cons_Clie.JPG)

**Actores:** Personal de atención al público.
1. Este caso de uso comienza cuando el ususario desea consultar la existencia de un cliente.
2. El ususario ingresa en el buscardor el ID del cliente.
3. El sistema verifica el ID del cliente.
4. El sistema confirma la existencia del cliente devolviendo la información del mismo en una fila.
5.  El usuario cierra la consulta y termina el caso de uso.
   
**Curso alternativo**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/9_CU_Cons_Clie.JPG)

1. El sistema verifica que el identificador del cliente es incorrecto, indica error y finaliza el caso de uso.
2. El sistema verifica que no hay existencia del cliente, indica al usuario el mensaje de _El cliente solicitado no existe_ y finaliza el caso de uso.
---
**CU: Eliminar cliente.**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/10_CU_Elim_Clien.JPG)

**Actores:** Personal de atención al público.

1.  Este caso de uso comienza cuando el usuario desea eliminar los datos del cliente.
2. El usuario se encuentra en la pantalla de _Consultar cliente_.
3. El usuario presiona el boton _Eliminar_ que se encuentra al lado derecho de cada fila, correspondiente al cliente que se desee eliminar. 
4. El sistema muestra una ventana emergente de alerta. 
5. El usuario presiona el boton _Aceptar_.
6. El sistema elimina los datos del cliente.

**Curso alternativo:**

4. El usuario preciona el boton _Cancelar_.
5. El sistema verifica que el usuario cancela la acción de eliminar cliente y finaliza el caso de uso.
---
**CU: Registrar pedido.**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/11_CU_Reg_Ped.JPG)

**Actores:** Personal de atención al público.

1. Este caso de uso comienza cuando el usuario desea registrar un  nuevo pedido.
2. El sistema solicita que el usuario complete los campos con los datos del nuevo pedido.
3. El usuario completa los campos con los datos correspondientes.
4. El usuario presiona el boton _Guardar_.
5. El sistema comprueba el ID del pedido.
6. El sistema registra los datos del nuevo pedido.

**Curso alternativo**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/12_CU_Reg_Ped.JPG)

5. El sistema verifica que el identificador del pedido ya existe, indica error al registrar pedido, el mismo ya existe en el sistema y finaliza el caso de uso.

**Curso alternativo**

4. El usuario  presiona el boton _Cancelar_.
5. El sistema verifica que el usuario cancela la acción de registrar pedido y finaliza el caso de uso.

**Curso alternativo**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/13_CU_Reg_Ped.JPG)

1. El usuario olvidó cargar algún campo.
2. El usuario presiona _Guardar_ 
3. El sistema alerta los campos no rellenados.
4. El usuario carga los datos faltantes.
5. El usuario vuelve a presionar el boton _Guardar_.
6. El sistema registra los datos del pedido.
---
**CU: Modificar pedido.**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/14_CU_Mod_Ped.JPG)

**Actores:** Personal de atención al público.
1.  Este caso de uso comienza cuando el usuario desea modificar los datos del pedido.
2. El usuario se encuentra en la pantalla de _Consultar pedido_.
3. El usuario presiona el boton _Editar_ que se encuentra al lado derecho de cada fila, correspondiente al pedido que se desee modificar. 
4. El sistema habilita la edición de los campos de esa fila. 
5. El usuario modifica los datos deseados.
6. El usuario presiona el boton _Actualizar_.
7. El sistema registra los cambios.

**Curso alternativo**

6. El usuario presiona el boton _Cancelar_.
7. El sistema verifica que el usuario cancela la acción de modificar pedido y finaliza el caso de uso.
---
**CU: Consultar pedido.**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/15_CU_Mod_Ped.JPG)

**Actores:** personal de atención al público.

1. Este caso de uso comienza cuando el ususario desea consultar la existencia de un pedido.
2. El ususario ingresa en el buscardor el ID del pedido.
3. El sistema verifica el ID del pedido.
4. El sistema confirma la existencia del  pedido devolviendo la información del mismo en una lista.
5.  El usuario cierra la consulta y termina el caso de uso.
   
**Curso alternativo**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/16_CU_Mod_Ped.JPG)

1. El sistema verifica que el identificador del pedido es incorrecto, indica error y finaliza el caso de uso.
2. El sistema verifica que no hay existencia del pedido, indica al usuario el mensaje de _El pedido solicitado no existe_ y finaliza el caso de uso.
---
**CU: Eliminar pedido.**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/17_CU_Elim_Ped.JPG)

**Actores:** Personal de atención al público.

1. Este caso de uso comienza cuando el usuario desea eliminar los datos del pedido.
2. El usuario se encuentra en la pantalla de consular pedido.
3. El usuario presiona el boton _Eliminar_ que se encuentra al lado derecho de cada fila, correspondiente al pedido que se desee eliminar. 
4. El sistema muestra una ventana emergente de alerta.
5. El usuario presiona el boton _Aceptar_.
6. El sistema elimina los datos del pedido.

**Curso alternativo:**

1. El usuario preciona el boton _Cancelar_.
2. El sistema verifica que el usuario cancela la acción de eliminar pedido y finaliza el caso de uso.
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
**CU: Consultar estado de diseño**

**Actores:** Encargado de impresión.

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/19_CU_Cons_Estado_Dise%C3%B1o.JPG)

1. El caso de uso inicia cuando el usuario quiera verificar el estado del diseño para iniciar la impresión del mismo.
2. El usuario se encuantra en la pantalla _Visualizar pedido_.
3. Si el _ESTADO_ figura como _Finalizado_, el sistema habilita la opción de _Imprimir_.
4. El usuario presiona el boton _Imprimir_.
5. El sistema inicia la impresión.

**Curso alternativo**

3. Si el _ESTADO_ figura como _No iniciado_ ó _En proceso_, el sistema no habilita la opción de imprimir y termina el caso de uso.
---

**CU: Modificar estado de impresión.**

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/20_CU_Vis_Ped.JPG)

**Actores:** Encargado de impresión.

1. Este caso de uso inicia cuando el usuario desee cambiar el estado impresión.
2. El usuario está en la pantalla _Consultar pedido_.
3. El usuario presiona el botón _Editar_.
4. El sistema habilita la edición del campo _Estado_.
5. El usuario modifica el estado de impresión.
6. El usuario presiona el botón _Actualizar_.
7. El sistema guarda los cambios realizados.

**Curso alternativo:**

6. El usuario  presiona el boton _Cancelar_.
7. El sistema verifica que el usuario cancela la acción de modificar estado de impresión y finaliza el caso de uso.

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


# Backlog de iteraciones


# Tareas
- Para poder realizar estas actividades es necesario tener la base de datos creada y su funcionamiento
- Para poder iniciar sesión debo ser personal de atención al público, diseñador gráfico, personal de impresión y/o administrador; tener usuario y contraseña
- Para poder registrar, modificar, consultar y eliminar un cliente debo ser Personal de atención al público; tener registrados correcamente los datos, verificar que sean correctos
-  Para consultar, modificar y eliminar pedidos debo ser Personal de atención al publico.
- Para visualizar pedidos debo ser diseñador gráfico, tener id del pedido
- Para modificar el estado de diseño debo ser diseñador gráfico, tener sesión iniciada.
- Para consultar estado de diseño debo ser encargado de impresión, tener sesión iniciada
- Para modificar estado de diseño debo ser encargado de impresión, tener sesión iniciada
- Para solicitar informe y acciones de ventas debo ser administrador para tener información de las ventas semanales e informe de stock, tener sesión iniciada
- Para solicitar un informe de clientes habituales debo ser administrador y encargado de impresión para tener un informe de los clientes habituales de los ultimos 30 dias, tener sesión iniciada
#Retrospectiva
