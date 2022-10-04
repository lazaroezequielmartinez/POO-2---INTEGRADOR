# Trabajo en equipo
![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/grupo%20de%20trabajo%20I2.jpeg)

# Diseño OO

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/DocModelo.JPG)

# Wireframe y caso de uso
## En esta iteración, abarcaremos unicamente los casos de uso con el wareframe respectivo del rol de Personal de atención al público.

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

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/CU_ConsultarPedido_AtencionPublico.JPG)

**Actores:** Personal de atención al público.

1. Este caso de uso comienza cuando el usuario desea eliminar los datos del cliente.
2. El usuario se encuentra en la pantalla de _Consultar cliente_.
3. El usuario presiona el boton _Eliminar_ que se encuentra al lado derecho de cada fila, correspondiente al cliente que se desee eliminar. 
4. El sistema muestra una ventana emergente de alerta. 
5. El usuario presiona el boton _Si_.
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

4. El usuario  presiona el boton _No_.
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
5. El usuario presiona el boton _Si_.
6. El sistema elimina los datos del pedido.

**Curso alternativo:**

1. El usuario preciona el boton _No_.
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
# Backlog de iteración 2 

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/BacklogIT2_1.JPG)
![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/BacklogIT2_2.JPG)
![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/BacklogIT2_3.JPG)

# Tareas
## Lista para esta iteración:
- Para poder realizar estas actividades es necesario tener la base de datos creada y su funcionamiento.
- Para poder iniciar sesión debo ser personal de atención al público; tener usuario y contraseña.
- Para poder registrar, modificar, consultar y eliminar un cliente debo ser Personal de atención al público; tener registrados correcamente los datos, verificar que sean correctos.
- Para consultar, modificar y eliminar pedidos debo ser Personal de atención al publico.

# Retrospectiva
