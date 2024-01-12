public class Calculate {
    public static void main(String[] args) {
        int x = Integer.valueOf(args[1]);
        int y = Integer.parseInt(args[2]);

        if (args.length != 3) {
            System.out.println("Digite exatamente 3 parametros, Opção(somar, subtrair, multriplicar, dividir), mais os numeros");
        }
        if (args[0].equals("somar")) {
            sum(x, y);
        } else if (args[0].equals("subtrair")) {
            subtract(x,y);
        } else if (args[0].equals("multiplicar")) {
            multiply(x, y);

        } else if (args[0].equals("dividir")) {
            divide(x, y);
        }

    }
    static void sum(int x, int y){
        System.out.println(x + y);
    }
    static void subtract(int x, int y){
        System.out.println(x - y);
    }
    static void multiply(int x, int y){
        System.out.println(x * y);
    }
    static void divide(int x, int y){
        System.out.println(x / y);
    }
}
