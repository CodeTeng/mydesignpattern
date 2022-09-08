# 设计模式
**用Java代码进行模拟23种设计模式，用通俗语言与图片详细讲述设计模式**
****
## 1. 概述

设计模式的重要理解

- 比如在回答“什么是`Abstract Factory`模式”时，阅读具体的示例代码有助于我们理解答案，但是并非只有这段特定的代码才是

    `Abstract Factory`模式。**重要的是在这段代码中有哪些类和接口，它们之间是什么样的关系**。

- 设计模式并非类库，但是Java标准类库中使用了许多设计模式。掌握了设计模式可以帮助我们理解这些类库所扮演的角色。

![image-20220901112303513](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011123709.png)

- 设计模式的目标之一**就是提高程序的可复用性**；也就是说，设计模式考虑的是怎样才能将程序作为“组件”重复使用。因此，不应当将

    示例程序看作是成品，而应当将其作为扩展和变更的基础。

    - **有哪些功能可以被扩展**
    - **扩展功能时必须修改哪些地方**
    - **有哪些类不需要修改**

- 在学习设计模式时，我们需要了解设计模式中出现的**角色**。请大家在阅读示例代码时，不要只盯着代码本身，而要将关注点转移到角

    色身上来，在阅读代码的时候，**要思考各个类和接口到底在模式中扮演着什么角色**。

- 设计模式大致分类

![image-20220831220732791](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202208312207841.png)

## 2. OOP七大原则

![image-20220831220845163](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202208312208219.png)

上述是OOP中的要遵循的原则，其中最为重要的为**开闭原则**。

## 3. 适应设计模式

### 3.1 Iterator模式---一个一个遍历

**迭代器模式**

略...

### 3.2 Adapter模式---加个“适配器”以便于复用

**适配器模式**

略...

## 4. 交给子类

### 4.1 Template Method模式---将具体处理交给子类

**模板方法模式。**

![image-20220901124148260](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011241491.png)

![image-20220901130131338](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011301476.png)

![image-20220901130144327](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011301366.png)

![image-20220901130219134](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011302232.png)

**优点：**

- 在父类的模板方法中编写了算法，无需在每个子类中再次编写算法。
- 当我们在模板方法中遇到BUG时，只需要修改模板方法即可，无需再修改每个子类中的方法。

### 4.2 Factory Method模式---将实例的生成交给子类

**工厂模式**

![image-20220831233605987](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202208312336711.png)



![image-20220831233621590](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202208312336686.png)

#### 4.2.1 简单工厂

![image-20220831235535389](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202208312355449.png)

#### 4.2.2 工厂方法

![image-20220831235622112](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202208312356217.png)

![image-20220831235847711](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202208312358794.png)

## 5. 生成实例

### 5.1 Singleton模式---只有一个实例

**单例模式**

![image-20220901132054684](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011320764.png)

#### 5.1.1 饿汉式

```java
public class Hungry {

    /**
     * 饿汉式是一上来就加载全部的资源，会造成资源浪费，占用内存空间
     */
    private byte[] byte1 = new byte[1024 * 1024];
    private byte[] byte2 = new byte[1024 * 1024];
    private byte[] byte3 = new byte[1024 * 1024];
    private byte[] byte4 = new byte[1024 * 1024];
    private static final Hungry HUNGRY = new Hungry();

    private Hungry() {
    }

    public static Hungry getInstance() {
        return HUNGRY;
    }

}
```

#### 5.1.2 懒汉式

##### 5.1.2.1 双重检测锁

不过使用反射可以破坏

```java
public class LazyMan {

    private volatile static LazyMan LAZY_MAN;

    private static boolean flag = false;

    private LazyMan() {
        System.out.println(Thread.currentThread().getName());
        synchronized (LazyMan.class) {
            if (flag == false) {
                flag = true;
            } else {
                throw new RuntimeException("不要试图使用反射破坏异常");
            }
        }
    }

    /**
     * 单线程下是没问题的
     */
    public static LazyMan getInstance1() {
        if (LAZY_MAN == null) {
            LAZY_MAN = new LazyMan();
        }
        return LAZY_MAN;
    }

    /**
     * 双重检测锁模式 懒汉式单例 DCL
     */
    public static LazyMan getInstance2() {
        if (LAZY_MAN == null) {
            synchronized (LazyMan.class) {
                if (LAZY_MAN == null) {
                    // 不是一个原子性操作 可能会有指令重排 需要加上volatile
                    /**
                     * new 操作的步骤
                     * 1. 分配内存空间
                     * 2. 执行构造方法，初始化对象
                     * 3. 把这个对象指向这个空间
                     */
                    LAZY_MAN = new LazyMan();
                }
            }
        }
        return LAZY_MAN;
    }

    /**
     * 模拟多线程并发
     */
    public static void main(String[] args) throws Exception {
//        for (int i = 0; i < 10; i++) {
//            new Thread(LazyMan::getInstance2).start();
//        }

        // 利用反射破坏
        LazyMan instance = LazyMan.getInstance2();

        Field field = LazyMan.class.getDeclaredField("flag");
        field.setAccessible(true);
        Constructor<LazyMan> constructor = LazyMan.class.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        LazyMan instance1 = constructor.newInstance();
        field.set(instance1, false);
        LazyMan instance2 = constructor.newInstance();
//        System.out.println(instance);
//        System.out.println(instance1);

        // 再次用反射
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
```

##### 5.1.2.2 静态内部类

```java
public class Holder {

    private Holder() {
    }

    public static Holder getInstance() {
        return InnerClass.HOLDER;
    }

    public static class InnerClass {
        private static final Holder HOLDER = new Holder();
    }
}
```

##### 5.1.2.3 枚举实现单例

用枚举实现的单例不会被反射破坏

```java
public enum EnumSingle {

    /**
     * 单例
     */
    INSTANCE;

    public EnumSingle getInstance() {
        return INSTANCE;
    }
}

class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        EnumSingle instance1 = EnumSingle.INSTANCE;
        Constructor<?>[] declaredConstructors = EnumSingle.class.getDeclaredConstructors();
        // 私有构造 两个参数
        System.out.println(Arrays.toString(declaredConstructors));
        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        EnumSingle instance2 = declaredConstructor.newInstance();
        // throw new IllegalArgumentException("Cannot reflectively create enum objects");
        // 说明枚举不会破坏单例
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
```

### 5.2 Prototype模式---通过复制生成实例

**原型模式**

![image-20220901140029862](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011400934.png)

![image-20220901140152040](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011401226.png)

![image-20220901140216838](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011402010.png)

![image-20220901140233089](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011402139.png)

### 5.3 Builder模式---组装复杂的实例

**建造者模式**

![image-20220901142300462](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011423576.png)

![image-20220901142945534](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011429800.png)

### 5.4 Abstract Factory模式---将关联零件组装成产品

**抽象工厂模式**

![image-20220901000339308](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209010003466.png)

![image-20220901000506484](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209010005668.png)

![image-20220901001135988](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209010011057.png)

![image-20220901001850287](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209010018522.png)

![image-20220901000040404](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209010000483.png)

## 6. 分开考虑

### 6.1 Bridge模式---将类的功能层级结构与实现层级结构分离

**桥接模式**

![image-20220901162111126](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011621199.png)

**类的层次结构的两个作用**

- **希望增加功能时**

![image-20220901162435169](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011624261.png)

![image-20220901162444986](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011624098.png)

- **希望增加新的实现时**

![image-20220901162742243](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011627352.png)

![image-20220901162751544](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011627653.png)

![image-20220901163229305](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011632409.png)

![image-20220901163351472](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011633568.png)

![image-20220901164905420](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011649512.png)

### 6.2 Strategy模式---整体地替换算法

**策略模式**

![image-20220901165847082](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011658155.png)

![image-20220901171549776](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011715981.png)

![image-20220901171623742](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209011716838.png)

## 7. 一致性

### 7.1 Composite模式---容器与内容的一致性

**组合模式**

![image-20220904001102394](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209040011686.png)

![image-20220904001554762](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209040015978.png)

![image-20220904001614526](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209040016646.png)

![image-20220904003049339](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209040030396.png)

![image-20220904003123743](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209040031874.png)

### 7.2 Decorator模式---装饰边框与被装饰物的一致性

**装饰模式**

![image-20220904003312622](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209040033762.png)

![image-20220904005059732](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209040050850.png)

![image-20220904005210948](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209040052013.png)

![image-20220904005412334](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209040054430.png)

![image-20220904005630130](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209040056235.png)

## 8. 访问数据结构

### 8.1 Visitor模式---访问数据结构并处理数据

**访问者模式**

![image-20220904102626949](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041026050.png)

![image-20220904104906854](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041049978.png)

![image-20220904105107086](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041051178.png)

### 8.2 Chain of.Responsibility模式---推卸责任

**责任链模式**

![image-20220904123247936](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041232122.png)

![image-20220904124906419](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041249501.png)

![image-20220904124920331](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041249437.png)

## 9. 简单化

### 9.1 Facade模式---简单窗口

**外观模式**

![image-20220904125913106](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041259276.png)

![image-20220904130219487](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041302548.png)

![image-20220904130230593](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041302650.png)

老样子，先看 外观模式（Facade Pattern）定义：提供一个统一的接口，用来访问子系统中的一群接口，外观定义了一个高层的接口，让子系统更容易使用。其实就是为了方便客户的使用，把一群操作，封装成一个方法。

举个例子：我比较喜欢看电影，于是买了投影仪、电脑、音响、设计了房间的灯光、买了爆米花机，然后我想看电影的时候，我需要：

1、打开爆米花机

2、制作爆米花

3、将灯光调暗

4、打开投影仪

5、放下投影仪投影区

6、打开电脑

7、打开播放器

8、将播放器音调设为环绕立体声

...

尼玛，花了一笔钱，看电影还要这么多的步骤，太累了，而且看完还要一个一个关掉。

所有，我们使用外观模式解决这些复杂的步骤，轻松享受电影：

### 9.2 Mediator模式---只有一个仲裁者

**中介者模式**

![image-20220904134955902](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041349999.png)

我们通过聊天室实例来演示中介者模式。实例中，多个用户可以向聊天室发送消息，聊天室向所有的用户显示消息。我们将创建两个类 

*ChatRoom* 和 *User*。*User* 对象使用 *ChatRoom* 方法来分享他们的消息。

*MediatorPatternDemo*，我们的演示类使用 *User* 对象来显示他们之间的通信。

![image-20220904135058815](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041350872.png)

![image-20220904135453609](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041354765.png)

![image-20220904135532320](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041355395.png)

## 10. 管理状态

### 10.1 Observer模式---发送状态变化通知

**观察者模式**

![image-20220904135813033](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041358074.png)

![image-20220904142716953](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041427048.png)

![image-20220904142756128](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041427175.png)

![image-20220904142942245](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041429288.png)

![image-20220904143054399](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041430488.png)

### 10.2 Memento模式---保存对象状态

**备忘录模式**

![image-20220904163910072](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041639180.png)

![image-20220904165425025](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041654133.png)

![image-20220904165436092](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041654172.png)

![image-20220904165444161](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209041654216.png)



### 10.3 State模式---用类表示状态

**状态模式**

![image-20220908161033090](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209081610217.png)

![image-20220908162904656](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209081629731.png)

![image-20220908162915900](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209081629961.png)

## 11. 避免浪费

### 11.1 Flyweight模式---共享对象，避免浪费

**享元模式**

![image-20220908163143973](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209081631151.png)

![image-20220908164526010](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209081645087.png)

### 11.2 Proxy模式---只在必要时生成实例

**代理模式**

![image-20220908164612718](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209081646777.png)

![image-20220908165636783](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209081656896.png)

![image-20220908165652238](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209081656284.png)

![image-20220908165908678](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209081659799.png)

## 12. 用类来表示

### 12.1 Command模式---命令也是类

**命令模式**

![image-20220908170143242](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209081701391.png)

![image-20220908171016815](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209081710932.png)

![image-20220908171027141](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209081710193.png)

### 12.2 Interpreter模式---语法规则也是类

**解释器模式**

![image-20220908171407825](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209081714017.png)

![image-20220908171457566](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209081714666.png)

![image-20220908171504165](https://teng-1310538376.cos.ap-chongqing.myqcloud.com/3718/202209081715225.png)
