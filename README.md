:

# Design Patterns — Repo Overview & TODO Checklist

A concise checklist and learning README for the DesignPattern repository. Use this to track which patterns are already implemented and which should be added as exercises.

## Quick status — Implemented (confirmed)
- [x] Creational
  - [x] Abstract Factory (src/Creational_Pattern/abstract_Design_Pattern)
  - [x] Factory (src/Creational_Pattern/Factory)
  - [x] Builder (src/Creational_Pattern/BuilderDesign_Pattern)
  - [x] Prototype (src/Creational_Pattern/Prototype_Design_Pattern)
  - [x] Singleton (src/Creational_Pattern/Singleton)
- [x] Behavioral
  - [x] Iterator (src/Behaviroal_Pattern/Iterator)
  - [x] Observer (src/Behaviroal_Pattern/Observer)
- [x] Structural
  - [x] Adapter (src/Structural_Pattern/Adaptor)
  - [x] Bridge (src/Structural_Pattern/Bridge)
  - [x] Proxy (src/Structural_Pattern/Proxy)

Note: The above are based on the current repository structure. If any files are missing, run a quick search (see commands below).

## TODO — Design patterns to implement / exercises
These are common patterns not present in the repo (or not clearly present). Use the checklist to pick an implementation, add example code, and unit tests.

- Creational
  - [ ] Factory Method
  - [ ] Object Pool
  - [ ] Dependency Injection / Service Locator (simple example)
  - [ ] Lazy Initialization (in-depth examples beyond Singleton)

- Structural
  - [ ] Decorator
  - [ ] Facade
  - [ ] Composite
  - [ ] Flyweight
  - [ ] Interpreter (simple expression example)

- Behavioral
  - [ ] Strategy
  - [ ] Command
  - [ ] State
  - [ ] Template Method
  - [ ] Visitor
  - [ ] Chain of Responsibility
  - [ ] Memento
  - [ ] Mediator

- Concurrency / Architectural patterns (optional)
  - [ ] Producer-Consumer
  - [ ] Read-Write Lock example
  - [ ] Actor model / basic message queue example

## Repo documentation & housekeeping TODOs
- [ ] Add a short Project title and one-line description at top of README
- [ ] Provide build instructions (Maven / Gradle) and example commands
- [ ] Add example runs and expected console output for each pattern's Client/Main
- [ ] Add package or directory structure summary with links to main classes
- [ ] Add unit tests for each pattern (JUnit) and document how to run them
- [ ] Add contribution guide / code style and Java version used
- [ ] Add license file (e.g., MIT) and author/maintainer info
- [ ] Add CI configuration (GitHub Actions) to run build and tests
- [ ] Add TODO labels in code for incomplete implementations

## Suggested implementation order (small incremental exercises)
1. Factory Method (small, demonstrates inheritance/creational intent)
2. Strategy (behavioral, easy to test)
3. Decorator (structural, small example like text filters)
4. Command (behavioral, good for undo examples)
5. Composite (structural, tree structures)

## Quick local commands
- List java files: find src -name "*.java"
- Search for pattern classes: rg "class .*Factory|interface .*Factory|class .*Pattern|interface .*Pattern" src || true
- Compile the project (if using javac directly): javac -d out $(find src -name "*.java")
- Run a main class: java -cp out Creational_Pattern.abstract_Design_Pattern.Client

## How to mark items done
- Update this README.md and check the boxes for implemented items.
- Add a short example and tests for each added pattern.

---

Keep this file short and update it as you implement new patterns. Happy learning.
