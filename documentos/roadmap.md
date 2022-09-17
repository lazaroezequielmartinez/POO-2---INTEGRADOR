# Sección 1
## Planificación del sistema MINERVA.

## Historias de usuario.
---
## Actores del sistema
###  1.Administrador: El rol de administrador se encarga de ver/solicitar informes de ventas y de stock.  
### 2. Diseñador Gráfico:  El rol de diseñador gráfico se encarga de visualizar los pedidos y modificar el estado del diseño.  
### 3. Encargado de Impresión: el encargado de impresión se encarga de consultar y visualizar el estado del diseño, modificar el estado de impresión, consultar el estado del pedido, consultar insumos y confirmar la impresión.  
---
## HU1: Solicitar informe de ventas,
### Actores: Administrador.
**como**: Usuario admistrador del sistema.

**quiero**: Visualizar un resumen semanal de las ventas hechas, ganancias y pérdidas.

**para**: Llevar a cabo un control y no tener más pérdidas de las que podamos cubrir. 

---

## HU2: Solicitar informe de stock.
## Actores: administrador.
**como**: Usuario administrador del sistema.

**quiero**: Visualizar un informe diario del stock restante.

**para**: No quedarnos sin insumos.

---

## HU3: Visualizar pedidos.
### Actores: Diseñador gráfico.
**como**: Usuario diseñador grafico.

**quiero**: Visualizar todos los pedidos.

**para**: Optimizar el tiempo y no atrazarnos con ningun pedido.

---

## HU4: Modificar el estado de diseño.
### Actores: Diseñador Gráfico.
**como**: Usuario diseñador gráfico.

**quiero**: Modificar el estado del pedido.

**para**: Luego imprimirse.

---

## HU5: Consultar el estado de diseño.
### Actores: Encargado de impresión.
**como**: Usuario encargado de impresión.

**quiero**: Poder ver que el estado de diseño haya finalizado.

**para**: Iniciar la impresión.

---

## HU6: Modificar el estado de impresión.
### Actores: Encargado de impresión. 
**como**: Usuario Encargado de ipresión.

**quiero**: Modificar el estado de impresión.

**para**: Avisar que el trabajo se ha terminado.

---

## HU7: Visualizar el estado del pedido.
### Actores: Encargado de impresión.
**como**: Usuario Encargado de impresión.

**quiero**: Ver en qué estado se encuentran los pedidos y a que clientes pertenecen. 

**para**: Saber si el trabajo ha sido finalizado y saber a quienes entregar los pedidos.

---

## HU8: Consultar Insumos.
### Actores: Encargado de impresión.
**como**: Usuario Encargado de impresión.

**quiero**: Verificar que existan los insumos.

**para**: Realizar un pedido.

---

## HU9: Confirmar impresión. 
### Actores: Encargado de impresión. 
**como**: Usuario Encargado de impresión.

**quiero**: Saber que el pedido ya ha pasado por los demás estados y está listo para imprimirse y entregarse.

**para**: Iniciar la impresión.

---

## HU10: Registrar clientes.
### Actores: Personal de atención al público.
**como**: Usuario Personal de atención al público.

**quiero**: Cargar en el sistema un cliente nuevo.

**para**: Validar que no exista el cliente en el 
sistema.

---

## HU11: Modificar datos  cliente.
### Actores: Personal de atención al público.
**como**: Usuario Personal de atención al público.

**quiero**: Realizar cambios en los datos de un cliente.

**para**:  El cliente debe existir en la base de datos.

---

## HU12: Consultar clientes.
### Actores: Personal de atención al público.
**como**: Usuario Personal de atención al público.

**quiero**: Consultarlos datos del pedido.

**para**:  Necesito que el cliente esté registrado.

---

## HU13: Eliminar Clientes.
### Actores: Personal de atención al público.
**como**: Usuario Personal de atención al público.

**quiero**: Elimar un cliente.

**para**:  Validar que exista el pedido en el sistema.

---

## HU14: Registrar pedidos.
### Actores: Personal de atención al público.
**como**: Usuario atención al público.

**quiero**: Cargar en el sistema un pedido nuevo.

**para**: tener un nuevo pedido cargado en el sistema.

---

## HU15: Modificar datos del  pedido.
### Actores: Personal de atención al público.
**como**: Usuario atención al público.

**quiero**: Realizar cambios en los datos de un pedido.

**para**: modificar los datos de un pedido.

---

## HU16: Consultar pedido.
### Actores: Personal de atención al público.
**como**: Usuario atención al público.

**quiero**: Consultar el estado actual en el que se encuentra un pedido, si se encuentra en diseño, impresión o está terminado.  

**para**: actualizar la consulta del cliente.

---

## HU17: Eliminar pedido.
### Actores: Personal de atención al público.
**como**: Usuario atención al público.

**quiero**: eliminar un pedido.

**para**: por cancelación. 
