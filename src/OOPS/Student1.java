package OOPS;
class Student1 {
    private int age;
    private String name;

    // private constructor (only builder can call it)
    private Student1(Student1 builder) {
        this.age = builder.age;
        this.name = builder.name;
    }

    // Builder Class
    public static class Builder {
        private int age;
        private String name;

        public Builder setAge(int age) {
            this.age = age;
            return this; // chainable
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Student1 build() {
            return new Student1(this.build());
        }
    }

    public static void main(String[] args) {
        Builder obj = new Builder()
        .setAge(10)
        .setName("Noorain");
    }
}
