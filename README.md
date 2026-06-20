````markdown
# Use Case Modeling, Specification and Validation Environment

Este repositorio contiene el proyecto desarrollado para el Trabajo de Fin de Grado **"Use Case Modeling, Specification and Validation Environment"**.

El objetivo principal del proyecto es crear un entorno integrado en Eclipse para el modelado, especificación y validación de diagramas de casos de uso. La herramienta permite crear diagramas de casos de uso de forma gráfica, asociar descripciones textuales estructuradas a cada caso de uso, validar la consistencia entre ambas representaciones y generar documentación a partir de la información introducida.

## Tecnologías utilizadas

El proyecto está desarrollado sobre el ecosistema de modelado de Eclipse, utilizando principalmente las siguientes tecnologías:

- **EMF (Eclipse Modeling Framework)**: utilizado para definir el metamodelo de los diagramas de casos de uso.
- **Sirius**: utilizado para crear el editor gráfico de diagramas.
- **Xtext**: utilizado para definir el lenguaje textual de descripción de casos de uso.
- **Java**: utilizado para implementar servicios, validaciones, integración entre editores y generación documental.
- **Eclipse Plug-in Development Environment**: utilizado para desarrollar y empaquetar la herramienta como plugin de Eclipse.

## Funcionalidades principales

La herramienta permite realizar las siguientes acciones:

- Crear diagramas de casos de uso dentro de Eclipse.
- Añadir actores y casos de uso al diagrama.
- Crear relaciones de tipo:
  - Association
  - Include
  - Extend
  - Generalization
- Editar los nombres de actores y casos de uso directamente desde el editor gráfico.
- Crear o abrir una descripción textual asociada a un caso de uso.
- Generar automáticamente una plantilla inicial para la descripción textual.
- Validar la estructura interna de las descripciones.
- Validar la consistencia entre el diagrama gráfico y las descripciones textuales.
- Exportar las descripciones de casos de uso a un documento Word.
- Empaquetar la herramienta como plugin instalable en Eclipse.

## Estructura general del proyecto

El proyecto está dividido en varios plugins de Eclipse:

- `org.usecase`: contiene el metamodelo EMF y el código generado a partir de él.
- `org.usecase.design`: contiene la especificación Sirius del editor gráfico y los servicios Java asociados.
- `org.usecase.xtext`: contiene la gramática Xtext, el lenguaje textual y sus validadores.
- `org.usecase.xtext.ui`: contiene la integración del editor textual con la interfaz de Eclipse.
- Proyectos de `feature` y `repository`: utilizados para empaquetar e instalar la herramienta como plugin.

## Editor gráfico

El editor gráfico permite construir diagramas de casos de uso de forma visual. Está basado en el metamodelo definido con EMF y permite crear tanto los elementos principales del diagrama como las relaciones entre ellos.

Los elementos creados en el editor no son únicamente figuras visuales, sino instancias del modelo EMF. Esto permite que posteriormente puedan ser utilizados por las validaciones, la integración con Xtext y la generación documental.

## Lenguaje textual

Cada caso de uso puede tener asociada una descripción textual estructurada. Esta descripción sigue una plantilla definida mediante Xtext e incluye secciones como:

- Nombre del caso de uso.
- Actor principal.
- Stakeholders and goals.
- Preconditions.
- Postconditions.
- Main flow.
- Extensions.
- Special requirements.
- Technology and data variations.
- Frequency of occurrence.
- Open issues.

El uso de una estructura fija facilita la escritura de las descripciones y permite aplicar validaciones sobre su contenido.

## Validaciones

La herramienta incluye diferentes tipos de validaciones:

### Validaciones gráficas

Se aplican sobre el diagrama de casos de uso. Algunos ejemplos son:

- Evitar relaciones duplicadas.
- Evitar relaciones de un elemento consigo mismo.
- Comprobar que `include` y `extend` solo se creen entre casos de uso.
- Comprobar que las generalizaciones solo se creen entre elementos del mismo tipo.
- Detectar ciclos en relaciones de generalización.

### Validaciones textuales

Se aplican sobre las descripciones creadas con Xtext. Algunos ejemplos son:

- Comprobar que el caso de uso tiene nombre.
- Comprobar que existe un actor principal.
- Comprobar que el flujo principal contiene pasos.
- Detectar campos pendientes marcados como `TODO`.
- Comprobar que la numeración de los pasos es coherente.

### Validaciones cruzadas

Comparan la descripción textual con el diagrama gráfico. Algunos ejemplos son:

- Comprobar que el caso de uso descrito existe en el diagrama.
- Comprobar que el actor principal existe en el modelo gráfico.
- Comprobar que los actores mencionados en la descripción están asociados al caso de uso correspondiente.

## Generación de documentación

La herramienta incluye una funcionalidad de exportación a Word. Esta funcionalidad reutiliza la información introducida en el diagrama y en las descripciones textuales para generar un primer documento de especificación de casos de uso.

El documento generado puede incluir:

- La imagen del diagrama de casos de uso.
- Las descripciones textuales de los casos de uso.
- Las secciones principales de cada especificación.

## Instalación y ejecución

Para trabajar con el proyecto en un entorno de desarrollo se recomienda utilizar Eclipse con soporte para desarrollo de plugins y tecnologías de modelado.

Requisitos principales:

- Eclipse IDE con Plug-in Development Environment.
- Java 17.
- EMF.
- Sirius.
- Xtext.

Una vez importados los proyectos en Eclipse, la herramienta puede ejecutarse mediante una configuración de lanzamiento de tipo **Eclipse Application**, lo que abre una instancia runtime de Eclipse con el plugin cargado.

También se puede generar un update site a partir de los proyectos de feature y repository para instalar la herramienta en otra instancia de Eclipse mediante la opción:

```text
Help > Install New Software
````

## Uso básico

El flujo principal de uso de la herramienta es el siguiente:

1. Crear un nuevo modelo de casos de uso.
2. Abrir el editor gráfico Sirius.
3. Añadir actores, casos de uso y relaciones.
4. Seleccionar un caso de uso y crear o abrir su descripción textual.
5. Completar la plantilla textual generada.
6. Ejecutar o revisar las validaciones.
7. Exportar la información a un documento Word.

## Contexto académico

Este proyecto está especialmente orientado a un contexto académico. La herramienta busca ayudar a estudiantes o usuarios con perfil técnico a practicar con diagramas de casos de uso, entender sus relaciones y completar sus especificaciones textuales de forma estructurada.

Aunque podría ampliarse para un uso más profesional, el alcance actual está centrado en proporcionar un entorno sencillo y guiado para trabajar con casos de uso dentro de Eclipse.

## Autor

**Sergio Azores Corral**

Trabajo de Fin de Grado
Escuela Politécnica Superior
Universidad Autónoma de Madrid

## Tutor

**Juan de Lara Jaramillo**

```
```
