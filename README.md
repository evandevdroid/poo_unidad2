# 🎬 Sistema de Contenido Audiovisual - POO Unidad 2

Proyecto Java desarrollado para la materia **Programación Orientada a Objetos** de la Universidad Politécnica Salesiana. Implementa herencia, asociación, agregación y composición entre clases.

---

## 📌 Propósito

Modelar un sistema de contenido audiovisual aplicando los principios de la POO:
- **Herencia** entre clases de contenido
- **Agregación** entre Película y Actor
- **Composición** entre SerieDeTV y Temporada
- **Asociación** entre Documental e Investigador

---

## 🏗️ Clases del Proyecto

| Clase | Tipo | Relación |
|-------|------|----------|
| `ContenidoAudiovisual` | Abstracta base | — |
| `Pelicula` | Subclase | Agregación con `Actor` |
| `SerieDeTV` | Subclase | Composición con `Temporada` |
| `Documental` | Subclase | Asociación con `Investigador` |
| `Actor` | Clase auxiliar | Relacionada con `Pelicula` |
| `Temporada` | Clase auxiliar | Relacionada con `SerieDeTV` |
| `Investigador` | Clase auxiliar | Relacionada con `Documental` |
| `VideoYouTube` | Subclase nueva | Hereda de `ContenidoAudiovisual` |
| `Cortometraje` | Subclase nueva | Hereda de `ContenidoAudiovisual` |

---

## 📁 Estructura de Carpetas

```
poo_unidad2/
├── src/
│   └── main/
│       └── java/
│           └── contenido/
│               ├── ContenidoAudiovisual.java
│               ├── Pelicula.java
│               ├── SerieDeTV.java
│               ├── Documental.java
│               ├── Actor.java
│               ├── Temporada.java
│               ├── Investigador.java
│               ├── VideoYouTube.java
│               ├── Cortometraje.java
│               └── Main.java
├── bin/
└── README.md
```

---

## ⚙️ Cómo ejecutar el proyecto

### Requisitos
- Java JDK 11 o superior
- Eclipse IDE (recomendado) o cualquier IDE Java

### Pasos

**Opción 1 - Eclipse:**
1. `File` → `Import` → `Existing Projects into Workspace`
2. Selecciona la carpeta del proyecto
3. Ejecuta `Main.java`

**Opción 2 - Línea de comandos:**
```bash
git clone https://github.com/TU_USUARIO/poo_unidad2.git
cd poo_unidad2
mkdir bin
javac -d bin src/main/java/contenido/*.java
java -cp bin contenido.Main
```

---

## ✨ Mejoras implementadas

- Métodos getter/setter en todas las clases
- Método `obtenerUrlSimulada()` en `VideoYouTube`
- Método `participarEnFestival()` en `Cortometraje`
- Uso de `List<>` y `ArrayList<>` para gestionar colecciones de objetos relacionados
- Código limpio con comentarios sobre el tipo de relación en cada clase

