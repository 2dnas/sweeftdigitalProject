
public class MyDataStructure<T> {
    public Element<T> head;
    public Element<T> tail;


    public void addElement(T data) {
        Element<T> newElement = new Element<>(data);

        //თუ head არის null ეს ნიშნავს რომ list ცარიელია აქდან გამომდინარე პირველი ელემენტი
        //გამოდის როგორც პირველი ასევე უკანასკნელი ელემენტი ამიტომ ახალი ელემენტი ხდება head იც და tail იც
        if(head == null) {
            head = newElement;
            tail = newElement;
        } else {
            tail.next = newElement;
            tail = newElement;
        }
    }


    public void removeFirst(){

        //თუ head ცარიელია ესეიგი list იც ცარიელია
        if(head == null){
            System.out.println("List is empty");
        }
        //head ობიექტმა იცის ვინ დგას მის მარჯვნივ ამიტომ წაშლის ოპერაცია მოხდება O(1) დროში
        if(head.next != null){
            head = head.next;
        }

    }

    //გვიჩვენებს list ში ყველა ელემენტს
    public void display() {
        Element<T> current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

}

//ელემენტი არის generic კლასი
//სტრუქტურა იყენებს Element კლასს რომელსაც გააჩნია ორი ატრიბუტი value ანუ თავისი მნიშვნელობა და next ანუ მეზობელი
//ანუ Element ობიექტმა იცის თუ ვინ არის თვითონ და ვინ დგას მის მარჯვნივ
class Element<T> {
    T value;
    Element<T> next;

    public Element(T value) {
        this.value = value;
        next = null;
    }
}