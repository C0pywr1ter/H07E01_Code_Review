package de.tum.ise.entities;

public class Professor extends Person{





        private String persNr;
              // TODO 1.1 : Bob is not good at Object Orientated Programming - fix it
        // TODO 1.1 : Instead of implementing void setSemester(int i), implement void increaseSemester()

        // TODO 1.2 : Refactoring - Apply the template method design pattern on Student and Professor to prevent duplicated code

        public Professor(String name, int age, String email, String persNr) {
            super(name, age, email);
            this.persNr = persNr;

        }

        public String getPersNr() {
            return persNr;
        }

        public void setPersNr(String persNr) {
            this.persNr = persNr;
        }



        @Override
        public String toString() {
            return "Student{" +
                    "matrNr='" + persNr + '\'' +
                    ", name='" + name + '\'' +
                    ", age=" + age +

                    ", email='" + email + '\'' +
                    '}';
        }
    }

