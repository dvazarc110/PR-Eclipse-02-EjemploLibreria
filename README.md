# Reflexión final
## ¿Qué pasaría si exporto el proyecto a un .zip y se lo paso a un amigo o me lo llevo al ordenador de casa? ¿Funcionaría? Razona la respuesta.
Depende de cómo estén configuradas las librerías del proyecto:

- Si las librerías (.jar) están dentro del proyecto (por ejemplo, en una carpeta lib/) y añadidas con “Add JARs…”,
  Sí funcionará, porque Eclipse guarda rutas relativas. Al descomprimir el .zip en otro ordenador, el proyecto mantiene la misma estructura y Eclipse encuentra las librerías sin problema.

- En cambio, si las librerías se añadieron con “Add External JARs…”,
  No funcionará, porque Eclipse guarda una ruta absoluta. En otro ordenador esa ruta no existirá, así que el proyecto dará errores de compilación (“missing JARs”).
  
## ¿Qué pasaría si eliminas el archivo .jar de la carpeta lib? (puedes moverla a otro directorio para probarlo) ¿Qué ha pasado y por qué?
Si mueves o borras ese .jar de lib/:

- Eclipse ya no encuentra la librería

- Aparecen errores en las clases que la usan (por ejemplo, importaciones no resueltas o métodos desconocidos).
  Esto ocurre porque el .jar contiene el código compilado (clases y métodos) que el proyecto necesita.

## Y si agrego la librería con Add External JARs.... ¿Observas alguna diferencia en la configuración del Build Path? ¿Crees que si lo exporto a .zip y se lo paso a un compañero le funcionaría?
Sí, hay una diferencia clara:

- En el Build Path aparece una ruta absoluta completa hasta el .jar.

- Si exportas el proyecto y se lo pasas a otra persona, no le funcionará, porque esa ruta solo existe en tu ordenador.

## ¿Por qué no es recomendable usar Add External JARs… en proyectos que vas a compartir?
- Porque genera rutas absolutas dependientes del ordenador donde se configuró.
- Al compartir el proyecto, los demás usuarios no tendrán el mismo directorio, y Eclipse marcará errores al no poder encontrar la librería.
En resumen: pierdes portabilidad y compatibilidad.
