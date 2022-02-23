public class Updatingvariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono de 200 pesos
        salary = salary + 200;
        System.out.println(salary);

        salary = salary - 50;
        System.out.println(salary);

        salary = salary + (30 * 2) - 45;
        System.out.println(salary);
        // actualizando cadenas de texto
        String empleado ="Fabian";
        empleado = empleado + " Emanuel";
        empleado = empleado + " Gonzalez";
        empleado = "SR " + empleado; //agregamos sufijo antes de la cadena
        System.out.println(empleado);
    }
}
