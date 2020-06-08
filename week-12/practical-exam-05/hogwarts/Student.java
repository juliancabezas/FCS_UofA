/*==================================
Foundations of Computer Science
Student: Julian Cabezas Pena
id: a1785086
Semester: 1
Year: 2020
Practical Exam Number: 5
===================================*/

class Student {

    // Attributes of the student
    private String name;
    private int age;
    private int period;

    // Basic constructors, sets name to unknown and age and period as zero
    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.period = 0;
    }

    // Parametrized constructor, allows the user to input specific name, age and period
    public Student(String tmpName, int tmpAge, int tmpPeriod) {
        this.name = tmpName;
        this.age = tmpAge;
        this.period = tmpPeriod;
    }

    // Mutators and Accessors
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPeriod() {
        return this.period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }


}