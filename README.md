El proyecto consta de un menú principal dónde pregunta al usuario si desea continuar en la aplicación o si desea salir, donde el usuario tendrá que insertar 1 para continuar o 0 para salir, si el usuario ingresa 0 el programa termina, si presiona 1 lo lleva al menú de selección de su moneda, el cual le presenta 4 opciones de divisas, Córdobas, Dólares Estado Unidenses, Dólares Canadienses o Bolivianos de Bolivia, al elegir uno tendra que elegir la cantidad que desea convertir, luego se le presenta nuevamente el menú de selección de moneda con la diferencia que no se presentará la elección que tomó anteriormente, esos datos se envian a una funcion que consume el API EXHANGE para obtener un JSON, esos datos se envian para ser convertidos en un objeto de tipo moneda con las carácteristicas de una moneda, como son, el código, el valor y el país, una vez con los datos convertidos de json a monedase hace la conversión del valor proporcionado por el usuario a la divisa destino seleccionada multiplicando el valor de esta que se obtuvo al hacer el consumo de la API, luego todos estos datos se imprimen por pantalla con sus respectivos nombres y explicación, una vez terminada la conversión y muestra de los datos por pantalla el programa vuelve a iniciar para preguntar nuevamente si desea salir o continuar en la aplicación.
Pasos para usarlo:
  1. Ingrese lo que desea hacer:
       1- Para continuar
       0- Para salir
  2. Selecione la moneda que desea convertir y la cantidad
  3. Seleccione la moneda a la cual desea convertir su primera moneda
  4. El programa vuelve a iniciar para hacer otra conversión o para salir si lo desa.

Para ayuda pueden contactarme al:
      email: donaldo.nv.2000@gmail.com

Elaborado por:
      Donaldo Antonio Núñez Velásquez 
      con la instrucción de Alura Latam y el programa ONE.
Gracias por ver mi trabajo :)
