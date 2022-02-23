public class Condicionalif {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true; // también podría ser false
        int filesSended = 3;

        if (isBluetoothEnabled) {
            filesSended++;
            System.out.println("Archivo enviado");
            System.out.println(filesSended);
        }
    }
}
