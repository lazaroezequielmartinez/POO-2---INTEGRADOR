# Trabajo en equipo

# Diseño OO

# Wireframe y caso de uso
# Casos de uso extendido
https://www.figma.com/file/BYrQy0NhVxjJSADnU4cPcu/iteracion1pantallas?node-id=41%3A9278
**CU:Registrar cliente.**

**Actores:** Personal de atención al público.

1. Este caso de uso comienza cuando el usuario desea registrar un  nuevo cliente.
2. El sistema solicita que el usuario complete los campos con los datos del nuevo cliente.
3. El usuario completa los campos con los datos correspondientes.
4. El usuario presiona el boton _Guardar_.
5. El sistema comprueba el ID del cliente.
6. El sistema registra los datos del nuevo cliente.

**Curso alternativo**

5. El sistema verifica que el identificador del cliente ya existe, indica error al registrar cliente, el mismo ya existe en el sistema y finaliza el caso de uso.

**Curso alternativo**

4. El usuario  presiona el boton _Cancelar_.
5. El sistema verifica que el usuario cancela la acción de registrar cliente y finaliza el caso de uso.

**Curso alternativo**

3. El usuario olvidó cargar algún campo.
4. El usuario presiona _Guardar_ 
5. El sistema alerta los campos no rellenados.
6. El usuario carga los datos faltantes.
7. El usuario vuelve a presionar el boton _Guardar_.
8. El sistema registra los datos del cliente.

---
**CU: Modificar datos del cliente.**

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

**CU: Consultar clientes.**

**Actores:** Personal de atención al público.

---
**CU: Eliminar cliente.**

**Actores:** Personal de atención al público.

1.  Este caso de uso comienza cuando el usuario desea eliminar los datos del cliente.
2. El usuario se encuentra en la pantalla de _Consular cliente_.
3. El usuario presiona el boton _Eliminar_ que se encuentra al lado derecho de cada fila, correspondiente al cliente que se desee eliminar. 
4. El sistema muestra una ventana emergente de alerta. 
5. El usuario presiona el boton _Aceptar_.
6. El sistema elimina los datos del cliente.

**Curso alternativo:**

4. El usuario preciona el boton _Cancelar_.
5. El sistema verifica que el usuario cancela la acción de eliminar cliente y finaliza el caso de uso.
---
**CU: Registrar pedido.**

**Actores:** Personal de atención al público.

1. Este caso de uso comienza cuando el usuario desea registrar un  nuevo pedido.
2. El sistema solicita que el usuario complete los campos con los datos del nuevo pedido.
3. El usuario completa los campos con los datos correspondientes.
4. El usuario presiona el boton _Guardar_.
5. El sistema comprueba el ID del pedido.
6. El sistema registra los datos del nuevo pedido.

**Curso alternativo**

5. El sistema verifica que el identificador del pedido ya existe, indica error al registrar pedido, el mismo ya existe en el sistema y finaliza el caso de uso.

**Curso alternativo**

4. El usuario  presiona el boton _Cancelar_.
5. El sistema verifica que el usuario cancela la acción de registrar pedido y finaliza el caso de uso.

**Curso alternativo**

1. El usuario olvidó cargar algún campo.
2. El usuario presiona _Guardar_ 
3. El sistema alerta los campos no rellenados.
4. El usuario carga los datos faltantes.
5. El usuario vuelve a presionar el boton _Guardar_.
6. El sistema registra los datos del pedido.
---
**CU: Modificar pedido.**

**Actores:** Personal de atención al público.
1.  Este caso de uso comienza cuando el usuario desea modificar los datos del pedido.
2. El usuario se encuentra en la pantalla de _Consular pedido_.
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

**Actores:** personal de atención al público.

1. Este caso de uso comienza cuando el ususario desea consultar la existencia de un pedido.
2. El ususario ingresa en el buscardor el ID del pedido.
3. El sistema verifica el ID del pedido.
4. El sistema confirma la existencia del   pedido devolviendo la información del mismo en una lista.
5.  El usuario cierra la consulta y termina el caso de uso.
   
**Curso alternativo**
1. El sistema verifica que el identificador del pedido es incorrecto, indica error y finaliza el caso de uso.
2. El sistema verifica que no hay existencia del pedido, indica al usuario el mensaje de _El pedido solicitado no existe_ y finaliza el caso de uso.
---
**CU: Eliminar pedido.**

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

**Actores:** Diseñador gráfico.

1. Este caso de uso comienza cuando el ususario desea visualizar un pedido.
2. El ususario ingresa en el buscardor el ID del pedido.
3. El sistema verifica el ID del pedido.
4. El sistema confirma la existencia del   predido devolviendo la información del mismo en una lista.
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

# Backlog de iteraciones

# Tareas

# Retrospectiva
