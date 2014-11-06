public class Boletin64 {

    public static void main(String[] args) {

        Ejercicio obj1 = new Ejercicio(7);
        Ejercicio obj2 = new Ejercicio(9);
        obj2 = obj1;
        System.out.print(obj1.valorprop() + " ");
        System.out.print(obj2.valorprop() + " ");
    }//fin main 
}

