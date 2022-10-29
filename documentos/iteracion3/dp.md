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
## En esta iteración, abarcaremos unicamente los casos de uso con sus correspondientes wireframes, respectivo del rol de Encargado de impresión.

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
# Backlog de iteración 3 

![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/BacklogIteracion3_1.JPG)
![](https://github.com/lazaroezequielmartinez/POO-2---INTEGRADOR/blob/main/Imagenes/BacklogIteracion3_2.JPG)

# Tareas
## Lista para esta iteración:
- Para poder realizar estas actividades es necesario tener la base de datos creada y su funcionamiento.
- Para poder iniciar sesión debo ser encargado de impresion; tener usuario y contraseña.
- Para consultar estado de diseño debo ser encargado de impresión, tener sesión iniciada
- Para modificar estado de diseño debo ser encargado de impresión, tener sesión iniciada
- Para solicitar un informe de clientes habituales debo ser administrador y encargado de impresión para tener un informe de los clientes habituales de los ultimos 30 dias, tener sesión iniciada
