package Week_5.question_1;


public class test {
    public static void main(String[] args)
    {
        fruit cam = new orange(23.99,"Việt Nam", "23/10/2018","112233As");
        System.out.println(cam.toString());
        fruit camCP = new orangeCaoPhong(2100.99,"Việt Nam", "23/3/2018","48347834");
        System.out.println(camCP.toString());
    }
}
