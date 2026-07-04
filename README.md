# LlanquihueTourApp

Sistema de gestión de servicios turísticos para la agencia **Llanquihue Tour**, desarrollado en Java como parte del curso Desarrollo Orientado a Objetos I (PRY2202).

## Semana 7 – Aplicando polimorfismo y colecciones genéricas

En esta semana se extendió la jerarquía de clases creada en semanas anteriores (`ServicioTuristico`, `RutaGastronomica`, `PaseoLacustre`, `ExcursionCultural`) para permitir gestionar y recorrer dinámicamente los servicios turísticos desde una colección, aplicando **polimorfismo** y **sobrescritura de métodos**.

### Lo desarrollado esta semana

- Se ajustó la superclase `ServicioTuristico` para que cuente con el método `mostrarInformacion()`, encargado de mostrar los datos base del servicio (nombre, destino, duración y precio).
- Cada subclase (`RutaGastronomica`, `PaseoLacustre`, `ExcursionCultural`) sobrescribe `mostrarInformacion()` usando `@Override`, agregando información específica de su tipo (tipo de cocina, lago y equipo, sitio histórico y guía bilingüe).
- Se creó la clase `GestorServicios` en el paquete `data/`, que declara una colección `List<ServicioTuristico>` y carga seis objetos combinando las tres subclases.
- Se recorre la colección con un bucle `for-each`, invocando `mostrarInformacion()` desde la referencia de tipo `ServicioTuristico` (polimorfismo), sin usar `instanceof`.
- Se incluyó la clase `Main` en el paquete `ui/` como punto de entrada opcional para probar el sistema por consola.

### Estructura del proyecto

```
src/
└── main/java/com/duoc/semana7/
    ├── model/
    │   ├── ServicioTuristico.java     (superclase)
    │   ├── RutaGastronomica.java      (subclase)
    │   ├── PaseoLacustre.java         (subclase)
    │   └── ExcursionCultural.java     (subclase)
    ├── data/
    │   └── GestorServicios.java       (colección polimórfica)
    └── ui/
        └── Main.java                  (punto de entrada, opcional)
```

## Instrucciones para compilar y ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Ubicar el archivo `src/main/java/com/duoc/semana7/ui/Main.java`.
3. Hacer clic derecho sobre el archivo y seleccionar **Run 'Main.main()'**.
4. Revisar la consola: se listará cada servicio turístico registrado, mostrando su información base (nombre, destino, duración, precio) y los datos específicos de su categoría.

## Ejemplo de salida esperada

```
=== Servicio Turístico ===
Nombre: Ruta de los Volcanes
Destino: Puerto Octay
Duración: 6 horas
Precio: $35000.0
Tipo de servicio: Excursión Cultural
Sitio histórico: Volcán Osorno
Incluye guía bilingüe: No
---------------------------------
...
Total de servicios registrados: 6
```

## Autor

Satcha Quispe Parada
