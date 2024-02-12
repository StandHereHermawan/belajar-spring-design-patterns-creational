package ariefbelajarteknologi.spring.creational.singleton;

public class Counter {

    private Long value = 0L;

    public Long getValue() {
        return value;
    }
    /**
     Function below can cause Race Condition
     Because it wasn't synchronized

     public void increment(){
     value++;
     }

     Function Below wouldn't Race condition
     Because it was synchronized */
    public synchronized void increment(){
        value++;
    }
}
