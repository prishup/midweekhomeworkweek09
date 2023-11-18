package encapsulation26;

public class TestEncapsualtion {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setName("Bhavesh");
        obj.setAge(19);
        obj.setRollNo(51);

        System.out.println("Codebuster name : "+obj.getName());
        System.out.println("CodeBuster age: " +obj.getAge());
        System.out.println("CodeBuster rollNo: " +obj.getRollNo());

        // Direct access of rollNo is not possible due to encapsulation
        // System.out.println("CodeBuster rollNo :" +obj.geekName);
    }
    }

