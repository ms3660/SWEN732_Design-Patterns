public class visitorpattern {
    // Visitable interface
    interface Campus {
        void accept(Visitor visitor);
    }

    // Concrete visitable classes
    static class ChinaCampus implements Campus {
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    static class CroatiaCampus implements Campus {
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    static class DubaiCampus implements Campus {
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    // Visitor interface
    interface Visitor {
        void visit(ChinaCampus chinaCampus);
        void visit(CroatiaCampus croatiaCampus);
        void visit(DubaiCampus dubaiCampus);
    }

    // Concrete visitor classes
    static class Student implements Visitor {
        public void visit(ChinaCampus chinaCampus) {
            System.out.println("Student is visiting the China Campus.");
        }

        public void visit(CroatiaCampus croatiaCampus) {
            System.out.println("Student is visiting the Croatia Campus.");
        }

        public void visit(DubaiCampus dubaiCampus) {
            System.out.println("Student is visiting the Dubai Campus.");
        }
    }

    static class Faculty implements Visitor {
        public void visit(ChinaCampus chinaCampus) {
            System.out.println("Faculty is visiting the China Campus.");
        }

        public void visit(CroatiaCampus croatiaCampus) {
            System.out.println("Faculty is visiting the Croatia Campus.");
        }

        public void visit(DubaiCampus dubaiCampus) {
            System.out.println("Faculty is visiting the Dubai Campus.");
        }
    }

    static class CampusVisitor implements Visitor {
        public void visit(ChinaCampus chinaCampus) {
            System.out.println("Campus visitor is visiting the China Campus.");
        }

        public void visit(CroatiaCampus croatiaCampus) {
            System.out.println("Campus visitor is visiting the Croatia Campus.");
        }

        public void visit(DubaiCampus dubaiCampus) {
            System.out.println("Campus visitor is visiting the Dubai Campus.");
        }
    }

    // Driver class
    public static void main(String[] args) {
        // Create campuses
        Campus chinaCampus = new ChinaCampus();
        Campus croatiaCampus = new CroatiaCampus();
        Campus dubaiCampus = new DubaiCampus();

        // Create visitors
        Visitor student = new Student();
        Visitor faculty = new Faculty();
        Visitor campusVisitor = new CampusVisitor();

        // Student visits campuses
        chinaCampus.accept(student);
        croatiaCampus.accept(student);
        dubaiCampus.accept(student);

        // Faculty visits campuses
        chinaCampus.accept(faculty);
        croatiaCampus.accept(faculty);
        dubaiCampus.accept(faculty);

        // Campus visitor visits campuses
        chinaCampus.accept(campusVisitor);
        croatiaCampus.accept(campusVisitor);
        dubaiCampus.accept(campusVisitor);
    }
}


