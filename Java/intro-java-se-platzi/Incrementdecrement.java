public class Incrementdecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4

        lives--;
        System.out.println(lives); //3

        lives++;
        System.out.println(lives); //4

        //Postfijo
        //Gana un regalo por ganar una vida
        int gift = 100 + lives++; //con postfijo se agrega luego de acceder a la variable
        System.out.println(gift);
        System.out.println(lives);


        //Prefijo
        //Gana un regalo por ganar una vida
        int gift2 = 100 + ++lives; //con prefijo se agrega el numero ANTES de acceder a la variable
        System.out.println(gift2);
        System.out.println(lives);
    }
}
