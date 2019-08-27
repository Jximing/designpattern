# 面向对象设计的六大设计原则
## 开闭原则（Open Close Principle）
### 定义
>Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.
### 解读

- 用抽象构建框架，用实现扩展细节。
- 不以改动原有类的方式来实现新需求，而是应该以实现事先抽象出来的接口（或具体类继承抽象类）的方式来实现。

## 单一职责原则（Single Responsibility Principle）
>A class should have a single responsibility, where a responsibility is nothing but a reason to change.
### 解读

- 类职责的变化往往就是导致类变化的原因：也就是说如果一个类具有多种职责，就会有多种导致这个类变化的原因，从而导致这个类的维护变得困难。

- 往往在软件开发中随着需求的不断增加，可能会给原来的类添加一些本来不属于它的一些职责，从而违反了单一职责原则。如果我们发现当前类的职责不仅仅有一个，就应该将本来不属于该类真正的职责分离出去。

- 不仅仅是类，函数（方法）也要遵循单一职责原则，即：一个函数（方法）只做一件事情。如果发现一个函数（方法）里面有不同的任务，则需要将不同的任务以另一个函数（方法）的形式分离出去。

## 依赖倒置原则（Dependency Inversion Principle）
### 定义
>Depend upon Abstractions. Do not depend upon concretions.
Abstractions should not depend upon details. Details should depend upon abstractions
High-level modules should not depend on low-level modules. Both should depend on abstractions.
### 解读

- 针对接口编程，而不是针对实现编程。
- 尽量不要从具体的类派生，而是以继承抽象类或实现接口来实现。
- 关于高层模块与低层模块的划分可以按照决策能力的高低进行划分。业务层自然就处于上层模块，逻辑层和数据层自然就归类为底层。

## 接口分离原则（Interface Segregation Principle）
### 定义
>Many client specific interfaces are better than one general purpose interface.
### 解读

- 客户端不应该依赖它不需要实现的接口。
- 不建立庞大臃肿的接口，应尽量细化接口，接口中的方法应该尽量少。
## 迪米特法则（Law of Demeter）
### 定义
>You only ask for objects which you directly need.
### 解读
- 迪米特法则也叫做最少知道原则（Least Know Principle）， 一个类应该只和它的成员变量，方法的输入，返回参数中的类作交流，而不应该引入其他的类（间接交流）。

## 里氏替换原则（Liskov Substitution Principle）
### 定义
>In a computer program, if S is a subtype of T, then objects of type T may be replaced with objects of type S (i.e. an object of type T may be substituted with any object of a subtype S) without altering any of the desirable properties of the program (correctness, task performed, etc.)
### 解读

- 在继承体系中，子类中可以增加自己特有的方法，也可以实现父类的抽象方法，但是不能重写父类的非抽象方法，否则该继承关系就不是一个正确的继承关系。