package de.tum.ise.entities;

public class Professor {





        private String matrNr;
        private String name;
        private int age;
        private String email;

        // TODO 1.1 : Bob is not good at Object Orientated Programming - fix it
        // TODO 1.1 : Instead of implementing void setSemester(int i), implement void increaseSemester()

        // TODO 1.2 : Refactoring - Apply the template method design pattern on Student and Professor to prevent duplicated code

        public Professor(String name, int age, String email, String matrNr) {
            this.matrNr = matrNr;
            this.name = name;
            this.age = age;

            this.email = email;
        }

        public String getMatrNr() {
            return matrNr;
        }

        public void setMatrNr(String matrNr) {
            this.matrNr = matrNr;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }



        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "matrNr='" + matrNr + '\'' +
                    ", name='" + name + '\'' +
                    ", age=" + age +

                    ", email='" + email + '\'' +
                    '}';
        }
    }

}
