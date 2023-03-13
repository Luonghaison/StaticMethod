public class Main {
    public static void main(String[] args) {
// write your code here
        Students.change(); //calling change method

        //creating objects
        Students s1 = new Students(111, "son");
        Students s2 = new Students(222, "ngan");
        Students s3 = new Students(333, "phat");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}