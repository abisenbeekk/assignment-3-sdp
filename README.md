# Bridge Pattern — Shape × Renderer

**Course:** ShP-2216 — Software Design Patterns  
**Institution:** Astana IT University  
**Assignment:** #3 — Bridge Pattern  
**Author:** abisenbeekk

---

## 1. Topic

**Shape (Abstraction) × Renderer (Implementor)**

Two independently varying dimensions:
- **What** is drawn (Circle, Square, ...)
- **How** it is drawn (Vector, Raster, ...)

---

## 2. Why Bridge?

The Bridge pattern fits this problem because:

- `Shape` and `Renderer` evolve **independently** of each other.
- Adding a new shape (e.g., `Triangle`) does **not** require changes to any renderer.
- Adding a new renderer (e.g., `SvgRenderer`) does **not** require changes to any shape.
- **Composition** is used instead of inheritance — this is the core idea of the Bridge pattern.
- Without Bridge, we would need `2 × N × M` classes (Cartesian product explosion).

---

## 3. Project Structure
src/

├── abstraction/

│ ├── Shape.java (Abstraction — holds a reference to Renderer)

│ ├── Circle.java (Refined Abstraction)

│ └── Square.java (Refined Abstraction)

├── implementor/

│ ├── Renderer.java (Implementor — interface)

│ ├── VectorRenderer.java (Concrete Implementor #1)

│ └── RasterRenderer.java (Concrete Implementor #2)

└── Main.java (Client)


---

## 4. UML Class Diagram

Shape (Abstraction) Renderer (Implementor)
┌──────────────────┐ ┌─────────────────────┐
│ - renderer: ─────┼─── bridge ────▶│ + renderCircle() │
│ + draw() │ composition │ + renderSquare() │
│ + setRenderer() │ └─────────────────────┘
└──────────────────┘ △
△ │
┌──────┴──────┐ ┌──────────┴──────────┐
│ │ │ │
┌───────┐ ┌────────┐ ┌──────────────┐ ┌──────────────┐
│Circle │ │ Square │ │VectorRenderer│ │RasterRenderer│
└───────┘ └────────┘ └──────────────┘ └──────────────┘


---

## 5. How to Run

From IntelliJ IDEA:
1. Open the project.
2. Run `Main.java`.

From the command line:
```bash
javac -d out src/Main.java src/abstraction/*.java src/implementor/*.java
java -cp out Main

=== Bridge Pattern Demo ===

Drawing a VECTOR circle with radius 5.00
Drawing a RASTER circle with radius 5.00 (pixels)
Drawing a VECTOR square with side 3.00
Drawing a RASTER square with side 3.00 (pixels)

=== Runtime Switching Demo ===

First, vector: Drawing a VECTOR circle with radius 7.00
Then, raster:  Drawing a RASTER circle with radius 7.00 (pixels)git add README.md
