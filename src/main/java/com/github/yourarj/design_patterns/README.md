# 23 Design Patterns Complete Reference

## Creational Patterns (5) `PRO Builder is Single AF`

### 1. Singleton
**Description**:
- Ensures only one instance of a class exists
- Provides global access point to that instance
- Thread-safe implementation is crucial
- Example: Database connection manager

**When to Use**:  
✔ When exactly one instance must coordinate actions across a system  
✔ For shared resource access (config managers, logging)  
✔ When controlled access is better than global variables

**Real-World Example**:  
🌐 **Application Configuration Manager**
- Loads settings from file once during startup
- All components access the same config instance
- Changes propagate across entire application

**Java Code Example**:
```java
public class DatabaseConnection {
    private static DatabaseConnection instance;
    
    private DatabaseConnection() {}
    
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    public void connect() { /* ... */ }
}
```

### 2. Factory Method
**Description**:
- Defines interface for creating objects
- Lets subclasses decide which class to instantiate
- Promotes loose coupling
- Example: Logistics management system

**When to Use**:  
✔ When class can't anticipate object types it must create  
✔ When you want to localize creation knowledge  
✔ For framework that delegates instantiation

**Real-World Example**:  
🚢 **Shipping Service**
- `ShipTransport` and `TruckTransport` implement `Transport` interface
- Client calls `createTransport()` without knowing concrete class
- New transport types can be added without client changes

**Java Code Example**:
```java
public abstract class Logistics {
public abstract Transport createTransport();

    public void planDelivery() {
        Transport t = createTransport();
        t.deliver();
    }
}

public class RoadLogistics extends Logistics {
public Transport createTransport() {
return new Truck();
}
}
```

### 3. Abstract Factory
**Description**:
- Creates families of related objects
- Ensures compatibility between products
- Higher level than Factory Method
- Example: UI theming system

**When to Use**:  
✔ When system must be independent of product creation  
✔ To enforce product family consistency  
✔ When dealing with multiple product families

**Real-World Example**:  
🎨 **Cross-Platform UI Kit**
- `MacOSFactory` creates native Mac buttons/windows
- `WindowsFactory` creates Windows-style components
- App switches factories based on OS detection

**Java Code Example**:
```java
public interface GUIFactory {
Button createButton();
Checkbox createCheckbox();
}

public class WinFactory implements GUIFactory {
public Button createButton() { return new WinButton(); }
public Checkbox createCheckbox() { return new WinCheckbox(); }
}
```

### 4. Builder
**Description**:
- Constructs complex objects step-by-step
- Same construction process can create different representations
- Isolates construction code
- Example: Meal combos at restaurant

**When to Use**:  
✔ When object has many optional components  
✔ To create different representations with same process  
✔ When construction process should be isolated

**Real-World Example**:  
🏗️ **SQL Query Builder**
- Builds query incrementally: `SELECT`, `FROM`, `WHERE`
- Can construct simple or complex queries
- Hides SQL syntax details from client

**Java Code Example**:
```java
public class Pizza {
    private String dough, sauce, topping;
    
    public static class Builder {
        private String dough, sauce, topping;
        
        public Builder dough(String dough) { this.dough = dough; return this; }
        public Builder sauce(String sauce) { this.sauce = sauce; return this; }
        public Builder topping(String topping) { this.topping = topping; return this; }
        
        public Pizza build() {
            return new Pizza(this);
        }
    }
    
    private Pizza(Builder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }
}
```
### 5. Prototype
**Description**:
- Creates new objects by copying prototypes
- Avoids expensive initialization
- Shallow vs deep copy considerations
- Example: Graphic editor clones

**When to Use**:  
✔ When object creation is more expensive than copying  
✔ To avoid hierarchy of factory classes  
✔ When objects have few differences

**Real-World Example**:  
🎮 **Game Enemy Spawning**
- Clone pre-configured "Goblin" prototype 1000x
- Each clone shares basic attributes but has unique position
- Faster than instantiating new enemies each time

**Java Code Example**:
```java
public abstract class Enemy implements Cloneable {
    protected String type;
    
    public abstract void attack();
    
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

public class Goblin extends Enemy {
    public Goblin() {
        type = "Goblin";
    }
    
    public void attack() { /* ... */ }
}
```

## Structural Patterns (7) `Decorated Proxy Bridge Fly over Composite Adapter`

### 6. Adapter
**Description**:
- Bridges incompatible interfaces
- Wraps adaptee to match target interface
- Two-way adapters possible
- Example: Media format converters

**When to Use**:  
✔ To integrate legacy code with new system  
✔ When third-party components need wrapping  
✔ To provide unified interface

**Real-World Example**:  
🔌 **Payment Gateway Adapter**
- `PayPalAdapter` makes PayPal API match your payment interface
- Lets you switch processors without changing business logic
- New adapters can be added for other providers

**Java Code Example**:
```java
public interface MediaPlayer {
    void play(String audioType, String fileName);
}

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;
    
    public MediaAdapter(String audioType) {
        if(audioType.equals("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        }
    }
    
    public void play(String audioType, String fileName) {
        if(audioType.equals("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        }
    }
}
```

### 7. Bridge
**Description**:
- Separates abstraction from implementation
- Both can vary independently
- Composition over inheritance
- Example: Device drivers

**When to Use**:  
✔ To avoid permanent binding between abstraction/implementation  
✔ When both need to be extensible  
✔ For sharing implementations

**Real-World Example**:  
📱 **Drawing App**
- `Shape` abstraction (Circle, Square)
- `Renderer` implementation (Vector, Raster)
- Can add new shapes without affecting renderers

**Java Code Example**:
```java
public interface Device {
    void turnOn();
    void turnOff();
    void setChannel(int channel);
}

public class TV implements Device {
    // Implement device methods
}

public abstract class Remote {
    protected Device device;
    
    public Remote(Device device) {
        this.device = device;
    }
    
    abstract void power();
}
```

### 8. Composite
**Description**:
- Treats individual and group objects uniformly
- Recursive tree structure
- Component interface for leaves/composites
- Example: File system

**When to Use**:  
✔ To represent part-whole hierarchies  
✔ When clients should ignore composition differences  
✔ For recursive structures

**Real-World Example**:  
🗂️ **Organization Hierarchy**
- `Employee` and `Department` implement same interface
- Department can contain Employees or sub-Departments
- `calculateCost()` works uniformly across structure

**Java Code Example**:
```java
public interface Employee {
    void showDetails();
}

public class Developer implements Employee {
    public void showDetails() { /* ... */ }
}

public class Manager implements Employee {
    private List<Employee> employees = new ArrayList<>();
    
    public void showDetails() {
        for(Employee emp : employees) {
            emp.showDetails();
        }
    }
}
```

### 9. Decorator
**Description**:
- Adds responsibilities dynamically
- Alternative to subclassing
- Wraps original object
- Example: Stream enhancements

**When to Use**:  
✔ To add responsibilities to objects at runtime  
✔ When subclassing is impractical  
✔ For flexible feature combination

**Real-World Example**:  
☕ **Coffee Ordering System**
- Basic coffee object
- Decorators add milk, sugar, whipped cream
- Cost calculated recursively through all decorators

**Java Code Example**:
```java
public interface Pizza {
    String getDescription();
    double getCost();
}

public class BasicPizza implements Pizza {
    public String getDescription() { return "Basic pizza"; }
    public double getCost() { return 5.0; }
}

public abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;
    
    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
```

### 10. Facade
**Description**:
- Simplified interface to complex subsystem
- Reduces subsystem dependencies
- Often wraps many classes
- Example: Home theater system

**When to Use**:  
✔ To provide simple interface to complex subsystem  
✔ To decouple clients from subsystem  
✔ For layered architectures

**Real-World Example**:  
🏦 **Bank Account Opening**
- Single `openAccount()` method
- Handles KYC, verification, document processing internally
- Client doesn't need to know subsystem details

**Java Code Example**:
```java
public class OrderFacade {
    private InventorySystem inventory;
    private PaymentSystem payment;
    private ShippingSystem shipping;
    
    public void placeOrder(Order order) {
        if(inventory.checkStock(order)) {
            payment.processPayment(order);
            shipping.scheduleDelivery(order);
        }
    }
}
```

### 11. Flyweight
**Description**:
- Shares objects to save memory
- Intrinsic vs extrinsic state
- Factory manages flyweights
- Example: Text formatting

**When to Use**:  
✔ When application uses many similar objects  
✔ When storage costs are high  
✔ When most state can be extrinsic

**Real-World Example**:  
🔤 **Word Processor**
- Shared `Character` objects for each letter
- Only store position/font separately
- Saves memory when rendering large documents

**Java Code Example**:
```java
public class Character {
    private char c;
    private CharacterProperties properties;
    
    public Character(char c, CharacterProperties properties) {
        this.c = c;
        this.properties = properties;
    }
}

public class CharacterProperties {
    private String font;
    private int size;
    private String color;
}
```
### 12. Proxy
**Description**:
- Controls access to another object
- Can add functionality
- Various types (virtual, protection, remote)
- Example: Smart references

**When to Use**:  
✔ For lazy initialization  
✔ To control access to sensitive object  
✔ For remote object communication

**Real-World Example**:  
🏧 **Bank Account Proxy**
- Checks permissions before accessing real account
- Can log all transactions
- Caches frequently accessed balances

**Java Code Example**:
```java
public interface BankAccount {
    void withdraw(double amount);
}

public class RealAccount implements BankAccount {
    public void withdraw(double amount) { /* ... */ }
}

public class ATMProxy implements BankAccount {
    private RealAccount account;
    
    public void withdraw(double amount) {
        if(amount > 1000) verifyIdentity();
        account.withdraw(amount);
    }
}
```

## Behavioral Patterns (11) `Comander Chain, Mediator In It,  Observes State Strategy TV Meme`

### 13. Chain of Responsibility
**Description**:
- Passes request along handler chain
- Each handler decides to process or forward
- Decouples sender/receiver
- Example: Exception handling

**When to Use**:  
✔ When multiple objects may handle request  
✔ To decouple sender and receiver  
✔ When handler sequence matters

**Real-World Example**:  
🛡️ **Authentication Middleware**
- Chain: Rate Limiter → IP Filter → Auth Check
- Each handler processes or forwards request
- Easy to add/remove handlers

**Java Code Example**:
```java
public abstract class SupportHandler {
    protected SupportHandler next;
    
    public void setNext(SupportHandler next) {
        this.next = next;
    }
    
    public abstract void handleRequest(SupportRequest request);
}

public class Level1Support extends SupportHandler {
    public void handleRequest(SupportRequest request) {
        if(request.getLevel() <= 1) {
            // Handle request
        } else if(next != null) {
            next.handleRequest(request);
        }
    }
}
```

### 14. Command
**Description**:
- Encapsulates request as object
- Supports undo/redo
- Decouples invoker from receiver
- Example: Transaction systems

**When to Use**:  
✔ For parameterizing objects with operations  
✔ To implement undo/redo  
✔ For request queuing

**Real-World Example**:  
📺 **Remote Control**
- Each button press creates command object
- Commands can be stored for undo
- Same remote works with different devices

**Java Code Example**:
```java
public interface Command {
    void execute();
}

public class OrderCommand implements Command {
    private Chef chef;
    private String order;
    
    public OrderCommand(Chef chef, String order) {
        this.chef = chef;
        this.order = order;
    }
    
    public void execute() {
        chef.prepareOrder(order);
    }
}

public class Waiter {
    private List<Command> orders = new ArrayList<>();
    
    public void takeOrder(Command command) {
        orders.add(command);
    }
}
```

### 15. Interpreter
**Description**:
- Implements language grammar
- Represents rules as classes
- Often uses composite pattern
- Example: Regular expressions

**When to Use**:  
✔ To interpret domain-specific languages  
✔ When grammar is relatively simple  
✔ For syntax tree processing

**Real-World Example**:  
🔣 **SQL WHERE Clause Parser**
- Interprets expressions like "price > 100 AND stock < 5"
- Creates object tree representing the condition
- Evaluates against database records

**Java Code Example**:
```java
public interface Expression {
    boolean interpret(String context);
}

public class TerminalExpression implements Expression {
    private String data;
    
    public TerminalExpression(String data) {
        this.data = data;
    }
    
    public boolean interpret(String context) {
        return context.contains(data);
    }
}

public class OrExpression implements Expression {
    private Expression expr1;
    private Expression expr2;
    
    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
    
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
```

### 16. Iterator
**Description**:
- Accesses elements sequentially
- Hides underlying collection
- Multiple simultaneous traversals
- Example: Collection frameworks

**When to Use**:  
✔ To access collection without exposing structure  
✔ For multiple traversal algorithms  
✔ For uniform interface across collections

**Real-World Example**:  
📚 **Library Catalog**
- `BookIterator` traverses collection
- Can implement different orderings (by title, by author)
- Client code works same way for all collections

**Java Code Example**:
```java
public interface Iterator<T> {
    boolean hasNext();
    T next();
}

public class ChannelIterator implements Iterator<String> {
    private String[] channels;
    private int position;
    
    public ChannelIterator(String[] channels) {
        this.channels = channels;
    }
    
    public boolean hasNext() {
        return position < channels.length;
    }
    
    public String next() {
        return channels[position++];
    }
}
```

### 17. Mediator
**Description**:
- Centralizes complex communications
- Objects interact through mediator
- Reduces direct connections
- Example: Chat rooms

**When to Use**:  
✔ When object communication is complex  
✔ To reduce chaotic dependencies  
✔ For centralized control logic

**Real-World Example**:  
✈️ **Air Traffic Control**
- Planes don't communicate directly
- All messages go through ATC
- ATC coordinates landings/takeoffs

**Java Code Example**:
```java
public interface AirTrafficControl {
    void registerFlight(Flight flight);
    void sendMessage(String message, Flight sender);
}

public class Flight {
    private AirTrafficControl atc;
    private String name;
    
    public Flight(AirTrafficControl atc, String name) {
        this.atc = atc;
        this.name = name;
    }
    
    public void send(String message) {
        atc.sendMessage(message, this);
    }
}
```

### 18. Memento
**Description**:
- Captures/restores object state
- Maintains encapsulation
- Originator/caretaker roles
- Example: Undo mechanisms

**When to Use**:  
✔ For snapshot-based undo  
✔ When direct state access breaks encapsulation  
✔ For transaction rollback

**Real-World Example**:  
🎮 **Game Save System**
- `GameState` memento saves character position/inventory
- Caretaker manages save slots
- Player can restore any saved state

**Java Code Example**:
```java
public class GameState {
    private final String level;
    private final int score;
    
    public GameState(String level, int score) {
        this.level = level;
        this.score = score;
    }
    
    public String getLevel() { return level; }
    public int getScore() { return score; }
}

public class Game {
    private String level;
    private int score;
    
    public GameState save() {
        return new GameState(level, score);
    }
    
    public void restore(GameState state) {
        this.level = state.getLevel();
        this.score = state.getScore();
    }
}
```

### 19. Observer
**Description**:
- Publisher-subscriber model
- Subjects notify observers of changes
- Loose coupling between objects
- Example: Event systems

**When to Use**:  
✔ When change to one object requires changing others  
✔ For event-handling systems  
✔ When abstraction coupling is needed

**Real-World Example**:  
📰 **Newsletter System**
- Subscribers register with publisher
- New article triggers notifications
- Multiple notification channels (email, SMS)

**Java Code Example**:
```java
public interface Observer {
    void update(String news);
}

public class NewsAgency {
    private List<Observer> observers = new ArrayList<>();
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void notifyObservers(String news) {
        for(Observer observer : observers) {
            observer.update(news);
        }
    }
}
```

### 20. State
**Description**:
- Object behavior changes with state
- State transitions are explicit
- Eliminates conditional logic
- Example: Vending machines

**When to Use**:  
✔ When object has many conditional behaviors  
✔ To represent state transitions clearly  
✔ For state-specific behavior

**Real-World Example**:  
🚦 **Traffic Light System**
- States: Red → Green → Yellow → Red
- Each state determines light color and duration
- Transition rules are encapsulated

**Java Code Example**:
```java
public interface TrafficLightState {
    void change(TrafficLight light);
    void display();
}

public class RedState implements TrafficLightState {
    public void change(TrafficLight light) {
        light.setState(new GreenState());
    }
    
    public void display() {
        System.out.println("Red Light - STOP");
    }
}
```

### 21. Strategy
**Description**:
- Encapsulates interchangeable algorithms
- Context delegates to strategy
- Easy to add new strategies
- Example: Sorting algorithms

**When to Use**:  
✔ When multiple algorithm variants exist  
✔ To isolate algorithm details  
✔ For runtime algorithm selection

**Real-World Example**:  
🧮 **Shipping Calculator**
- Strategies: Standard, Express, Overnight
- Context computes cost using selected strategy
- New carriers can be added without changes

**Java Code Example**:
```java
public interface PaymentStrategy {
    void pay(double amount);
}

public class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) { /* ... */ }
}

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }
    
    public void checkout(double amount) {
        paymentStrategy.pay(amount);
    }
}
```
### 22. Template Method
**Description**:
- Defines algorithm skeleton
- Subclasses implement steps
- Controls algorithm structure
- Example: Framework hooks

**When to Use**:  
✔ To enforce algorithm structure  
✔ For code reuse among similar algorithms  
✔ When subclassing is preferred

**Real-World Example**:  
🏗️ **Construction Process**
- Template: Pour Foundation → Build Walls → Add Roof
- Subclasses customize materials (wood vs steel)
- Overall sequence remains consistent

**Java Code Example**:
```java
public abstract class HouseTemplate {
    public final void buildHouse() {
        buildFoundation();
        buildWalls();
        addWindows();
    }
    
    abstract void buildWalls();
    abstract void addWindows();
    
    private void buildFoundation() {
        System.out.println("Building standard foundation");
    }
}

public class WoodenHouse extends HouseTemplate {
    void buildWalls() { /* ... */ }
    void addWindows() { /* ... */ }
}
```
### 23. Visitor
**Description**:
- Adds operations without changing classes
- Double dispatch technique
- Separates algorithms from objects
- Example: Compiler operations

**When to Use**:  
✔ To add operations to stable object structures  
✔ When many unrelated operations exist  
✔ For performing operations across classes

**Real-World Example**:  
🛒 **Shopping Cart**
- Visitors: TaxCalculator, DiscountApplier
- Elements: Book, Electronics, Grocery
- New operations can be added without changing item classes

**Java Code Example**:
```java
public interface Vehicle {
    void accept(Visitor visitor);
}

public class Car implements Vehicle {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

public interface Visitor {
    void visit(Car car);
    void visit(Truck truck);
}

public class InsuranceVisitor implements Visitor {
    public void visit(Car car) { /* Calculate car insurance */ }
    public void visit(Truck truck) { /* Calculate truck insurance */ }
}
```

## Summary Cheat Sheet
| Category       | Key Patterns                  | When You Need It                  |
|----------------|------------------------------|-----------------------------------|
| **Creational** | Singleton, Factory, Builder   | Flexible object creation          |
| **Structural** | Adapter, Proxy, Composite    | Integrating/structuring components|
| **Behavioral** | Observer, Strategy, Command  | Managing algorithms/communication |
