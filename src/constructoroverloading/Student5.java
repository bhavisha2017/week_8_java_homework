package constructoroverloading;

public class Student5 {
    int id;
    String name;
    int age;

    public Student5(int i, String n){
        this.id = i;
        this.name = n;
    }
    public Student5(int i,String n, int a){
        this.id = i;
        this.name = n;
        this.age = a;

    }
    public void display(){
        System.out.println(id + " " +name+ " " +age);

    }

    public static void main(String[] args) {
        Student5 s1 = new Student5(111, "Karan");
        Student5 s2 = new Student5(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}
