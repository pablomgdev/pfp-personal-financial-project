<!-- todo: translate the README.md file: https://github.com/jonatasemidio/multilanguage-readme-pattern?tab=readme-ov-file -->

<h1 align=center>PFP</h1>
<p align=center>Personal Financial Project</p>

> [!WARNING]
> Los enlaces que no funcionen deberían ser arreglados.

## Descripción
> [!NOTE]
> Pendiente añadir descripción.

## Funcionalidades
### Operaciones
Una operación es el ingreso/gasto de un usuario.
#### General
- El usuario puede añadir ingresos y gastos.
- El usuario puede eliminar ingresos y gastos.
- El usuario puede consultar sus ingresos y gastos (cantidad, [categoría](), descripción, fecha...).
- El usuario puede filtrar sus ingresos y gastos para acotar sus búsquedas (por [categoría](), fecha, fondo...).
#### Periodicas
- El usuario puede crear una operación periódica para añadir sus ingresos/gastos mensuales, semanales...
- El usuario puede eliminar una operación periódica para añadir sus ingresos/gastos mensuales, semanales...
- El usuario puede modificar una operación periódica de manera puntual o permanente.
### Categorías
Una categoría es una etiqueta que se asocia a una [operación]() para clasificarla y poder realizar acciones, como filtros o cálculos, en base a esta.
#### General
- El usuario puede crear categorías para sus ingresos y gastos.
- El usuario puede eliminar categorías para sus ingresos y gastos.
- El usuario puede consultar sus categorías.
- El usuario puede recategorizar sus ingresos y gastos.
#### Periodicidad
- El usuario puede categorizar la cantidad de una [operación periódica]() al momento de crearla para indicar a qué categorías afecta. Puede indicar qué porcentaje/cantidad de esa operación se destinará a unas categorías y qué porcentaje/cantidad se destinará a otras categorías.
- El usuario puede cambiar la categorización establecida para una [operación periódica]() de manera puntual o permanente.
### Fondos
Un fondo es un registro con la cantidad de dinero de la que dispone un usuario y que es afectado por las [operaciones]() realizadas sobre una o más [categorías]() concretas.
#### General
- El usuario puede crear fondos.
- El usuario puede eliminar fondos.
- El usuario puede relacionar sus fondos con sus [categorías](). Los ingresos/gastos añadidos a dichas [categorías]() afectarán a la cantidad del fondo.
- El usuario puede consultar la cantidad de sus fondos.
- El usuario puede consultar la cantidad gastada/ingresada de una categoría en un fondo.
- El usuario puede consultar la cantidad que tenía un fondo en una fecha concreta.
- El usuario puede cambiar directamente la cantidad que tiene en un fondo indicando su cantidad total.
  - Esta opción añadirá una [operación](), sobre el fondo en cuestión, con una categoría interna e imborrable del sistema llamada "rectificación de fondo" (o similar).
#### Fondo Global
- El usuario debe disponer de un fondo global para saber de dinero dispone entre todos sus fondos.
### Traspasos
> [!NOTE]
> Podría ser una [operación]() pero que implique la adición de dos registros en base de datos (uno para quitar y otro para añadir una cantidad en un [fondo]()). Pensar.
Un traspaso es una cantidad de dinero que un usuario decide mover de un [fondo]() a otro.
- El usuario puede traspasar una cantidad de un [fondo]() a otro.
- El usuario puede deshacer un traspaso previamente realizado.
- El usuario puede añadir una descripción a sus traspasos.
### Deuda
Una deuda es una cantidad negativa generada por una [operación]() o un [traspaso]() en un [fondo]().
- El usuario puede consultar la cantidad de su [fondo global]() teniendo en cuenta la deuda para saber cuánto dinero tiene.
- El usuario puede consultar la cantidad de su [fondo global]() sin tener en cuenta la deuda para saber de cuánto dispondría sin ella.
### Importar/exportar datos
- El usuario puede importar sus datos en diferentes formatos como JSON, Excel, CSV...
- El usuario puede exportar sus datos en diferentes formatos como JSON, Excel, CSV...
