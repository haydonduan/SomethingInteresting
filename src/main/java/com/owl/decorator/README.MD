### 装饰器模式
    装饰器模式其实就是用继承或者实现相同的父类或者是相同的接口来达到一个class可以被多个具有别的功能的相同父类或者接口的类进行处理的一种方式
    
    其中，需要几个东西：
    1. Component（抽象构件） ----> 就是相同的父类或者接口, (Shape)
    2. ConcreteComponent（具体构件） ---> 具体实现父类或者接口的具体实实在在的对象 (Circle)
    3. Decorator（抽象装饰类）  ---> 需要继承或者实现1中的抽象构件的抽象装饰器，主要用来引用具体构件的引用 (ShapeDecorator)
    4. ConcreteDecorator（具体装饰类）---> 具体实现装饰器的类 (RedShapeDecorator)
    
### 实际例子
    ```
                DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("file")));
    ```
    DataInputStream和FileInputStream其实是InputStream的子类或者孙子类， 这么一层包装下去其实都是用的同一个父类，那么就可以不受类型约束的情况下进行各种包装新的方法
    每包装一层就会有新的处理方式
    
    对于前端而言，类似redux-thunk的原理，一层套一层,最后实现要处理的逻辑
    
    
    