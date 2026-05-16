# Actividad 1: Patrones de Diseño

Este directorio contiene las soluciones para tres escenarios prácticos aplicando patrones de diseño, implementados íntegramente en **TypeScript**.

## 📋 Índice General

1. **[Escenario 1 - Patrón Builder](./escenario1/):** Sistema de configuración de un automóvil con múltiples características opcionales.
2. **[Escenario 2 - Patrón Bridge](./escenario2/):** Sistema de notificaciones multi-plataforma estructurado para evitar la explosión combinatoria de clases.
3. **[Escenario 3 - Patrón Mediator](./escenario3/):** Aplicación de chat grupal para centralizar la comunicación entre múltiples usuarios.

**En cada una de las carpetas encontrarás la siguiente estructura de archivos:**
*   `Escenario.md`: El planteamiento original del problema y cómo el código resuelve cada uno de los beneficios esperados.
*   `README.md`: La justificación teórica detallada sobre **por qué** se escogió ese patrón en particular, descartando otras alternativas.
*   `DiagramaClases.md`: Un diagrama visual UML generado con sintaxis *Mermaid* que muestra las relaciones de clases.

---

## ⚙️ Requisitos Previos

Para poder ejecutar el código fuente de los ejercicios en tu máquina local, requieres el JDK (Java Development Kit), configurar las variables de entorno (JAVA_HOME) y usar un IDE o editor de texto preferido (p.e. IntelliJ IDEA).

---

## 🚀 Cómo Ejecutar los Escenarios

Abre tu terminal (IDE), asegúrate de estar posicionado en la raíz de esta carpeta (`escenario1`), y ejecuta la clase **CustomCarClient**.

### 🚗 Escenario 1: Builder (Configuración de Automóviles)
Observa en consola cómo se construye un auto complejo paso a paso, asegurando la inmutabilidad de sus atributos opcionales.


### 📱 Escenario 2: Bridge (Sistema de Notificaciones)
Observa en consola cómo se pueden combinar libremente y en tiempo de ejecución distintos *Tipos* de notificaciones (Mensajes, Alertas) con distintas *Plataformas* (Web, Móvil, Desktop).



### 💬 Escenario 3: Mediator (Chat Grupal)
Observa en consola cómo múltiples usuarios envían mensajes que son distribuidos correctamente, comprobando que ningún usuario interactúa directamente con otro, sino a través de la sala central.

