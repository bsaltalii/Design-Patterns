# 🎯 Java Design Patterns Collection

*Java Design Patterns Collection* is a comprehensive and evolving set of design pattern implementations in Java. It’s structured to reflect real-world usage and is organized by package to improve readability and modular understanding.

---

## 📚 Purpose

This repository was created as a learning and reference tool.  
It showcases implementations of the most essential software design patterns across **creational**, **structural**, and **behavioral** categories — based on the Gang of Four (GoF) design principles.

---

## 🧩 Pattern Categories

All patterns are organized by category and package:

| 📦 Package             | 📌 Patterns Included |
|------------------------|----------------------|
| `creational.*`         | Singleton, Factory, Abstract Factory, Builder, Prototype |
| `structural.*`         | Adapter, Decorator, Proxy, Bridge, Composite, Flyweight |
| `behavioral.*`         | Strategy, Observer, Command, State, Memento, Mediator, Iterator, Template Method, Visitor, Chain of Responsibility |

> ✅ Patterns are added and refined continuously as the project evolves.

---

## 🗂️ Project Structure

```
design-patterns/
├── behavioral/
│   ├── strategy/
│   ├── observer/
│   └── ...
├── creational/
│   ├── singleton/
│   ├── factory/
│   └── ...
├── structural/
│   ├── adapter/
│   ├── decorator/
│   └── ...
└── Main.java (optional demo runner)
```

Each pattern package typically includes:
- Interfaces and concrete implementations
- Usage examples or test classes
- Commented code to explain the mechanics of the pattern

---

## 🚀 How to Run

### Requirements
•⁠  ⁠Java JDK 8 or later  
•⁠  ⁠Any Java IDE (e.g., IntelliJ IDEA, Eclipse) or terminal  

### Steps

```bash
# Compile all patterns
javac -d out $(find . -name "*.java")

# Run a specific demo
java -cp out behavioral.strategy.StrategyDemo
```

> Alternatively, open the project in an IDE and run any demo class.

---

## 🎓 Ideal For

- 🧑‍🎓 CS students studying object-oriented design
- 💼 Developers revisiting software architecture principles
- 🧪 Experimentation and code reuse in professional projects

---

## 👤 Developer

<table>
  <tbody>
    <tr>
      <td align="center">
        <a href="https://github.com/bsaltalii">
          <img src="https://avatars.githubusercontent.com/u/96692734?v=4" width="100px;" alt="Burak Saltalı Avatar"/>
          <br /><sub><b>Burak Saltalı</b></sub>
        </a>
      </td>
    </tr>
  </tbody>
</table>

---

## 📝 License

This project is licensed under the *MIT License*.  
See the [LICENSE](LICENSE) file for more information.
