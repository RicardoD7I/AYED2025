b.- ¿Por qué procesarMovimientos es tan ineficiente? Tenga en cuenta que pueden existir millones de movimientos diarios que abarquen gran parte de las cuentas bancarias.

El método tiene una complejidad temporal de O(N * M), donde N es la cantidad de consultas y M es el promedio del tamaño de los rangos de cuentas afectadas por cada consulta, y en el caso que haya muchas consultas o los rangos sean grandes, este algoritmo sería totalmente ineficiente.
Además, el algoritmo posee bucles anidados, que aumentan la complejidad de este y pueden hacerlo más difícil de entender, como también un gran uso de los recursos a la hora de iterar sobre el arreglo de cuentas.


c.- ¿En qué se diferencia procesarMovimientosOptimizado? Observe las operaciones que se realizan para cada consulta.

La diferencia principal entre ambos algoritmos es que, en el optimizado, se hace un único recorrido tanto en el arreglo de consultas como el de cuentas. Esto es así, gracias a la ayuda de un arreglo auxiliar previamente creado en donde se registran los cambios que deben aplicarse a las cuentas (en el anterior algoritmo, los cambios se realizaban directamente dentro del bucle anidado), para luego recorrerlo y actualizar las cuentas sumando sus valores correspondientes.