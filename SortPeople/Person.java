public class Person implements Comparable<Person> {

       public String firstName;

       public String lastName;

       public String address;

       public int age;

 

       public int getAge() {

             return age;

       }

      

       public String getAddress() {

             return address;

       }

      

       public String getFirstName() {

             return firstName;

       }

      

       public String getLastName() {

             return lastName;

       }

 

       public Person(String firstName, String lastName, String address, int age) {

             this.firstName = firstName;

             this.lastName = lastName;

             this.address = address;

             this.age = age;

       }

 

       @Override

       public String toString() {

             String result = "firstName: " + firstName + "\nlastName: " + lastName + "\naddress: " + address + "\nage: "

                           + age;

             return result;

 

       }

 

       @Override

       public boolean equals(Object object1) {

             if (this == object1)

                    return true;

             if (object1 == null)

                    return false;

             if (this.getClass() != object1.getClass())

                    return false;

 

             Person that = (Person) object1;

             if (this.age != that.age)

                    return false;

             if (!this.firstName.equals(that.firstName))

                    return false;

             if (!this.lastName.equals(that.lastName))

                    return false;

             return true;

       }

public int compareTo(Person other) {

            

             if (getAge() > other.getAge()) {

                    return 1;

             }

 

             else if (getAge() < other.getAge()) {

                    return -1;

             }

 

             else

                    return 0;

       }
       
            public static void main(String str[]) {

             Person p1 = new Person("Ana", "Ivanova", "Ulitsa1", 27);

             Person p2 = new Person("Ana", "Ivanova", "Ulitsa2", 29);

             System.out.println(p1.equals(p2));

             System.out.println(p1.compareTo(p2));

       }

 

}
