package queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

class Person{
    private String id;
    private String name;

    public Person(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Person(String name){
        this(UUID.randomUUID().toString(), name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

class Queue<T>{
    private final List<T> values;

    public Queue(){
        this.values = new ArrayList<>();
    }

    public void enqueue(T data){
        values.add(data);
    }

    public T dequeue(){
        if (values.size() == 0)
            return null;

        return values.remove(0);
    }
}

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(10);
        queue.enqueue(20);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());


        Queue<Person> persons = new Queue<>();

        persons.enqueue(new Person("Shekhar"));
        persons.enqueue(new Person("Amol"));

        System.out.println(persons.dequeue());
        System.out.println(persons.dequeue());
    }
}
