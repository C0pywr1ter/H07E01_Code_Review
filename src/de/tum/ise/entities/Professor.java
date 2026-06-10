package de.tum.ise.entities;

public class Professor extends Person{





        private String personalNumberr;
              // TODO 1.1 : Bob is not good at Object Orientated Programming - fix it
        // TODO 1.1 : Instead of implementing void setSemester(int i), implement void increaseSemester()

        // TODO 1.2 : Refactoring - Apply the template method design pattern on Student and Professor to prevent duplicated code

        public Professor(String name, int age, String email, String personalNumberr) {
            super(name, age, email);
            this.personalNumberr = personalNumberr;

        }

        public String getPersNr() {
            return personalNumberr;
        }

        public void setPersNr(String persNr) {
            this.personalNumberr = persNr;
        }



        @Override
        public String toString() {
            return "Student{" +
                    "matrNr='" + personalNumberr + '\'' +
                    ", name='" + name + '\'' +
                    ", age=" + age +

                    ", email='" + email + '\'' +
                    '}';
        }
    }

