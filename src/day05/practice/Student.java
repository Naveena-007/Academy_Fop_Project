package day05.practice;

public class Student {

	public String name;
    public int age;
    public String address;
    public String email;

    public Student(String name, int age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address + ", Email: " + email;
    }

    public static void main(String[] args) {
        Student student = new Student("John Doe", 20, "123 Main St", "johndoe@example.com");
        System.out.println(student.toString());
    }
}
