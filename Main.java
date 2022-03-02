import java.util.LinkedList;

public class Main{

    public static void main(String[] args){
        LinkedList<String> saya = new LinkedList<String>();
        saya.add("F");
        saya.add("I");
        saya.add("K");
        saya.add("R");
        saya.add("A");
        saya.add("N");
        saya.add(" ");

        saya.add("S");
        saya.add("H");
        saya.add("A");
        saya.add("D");
        saya.add("I");
        saya.add("Q");
        saya.add(" ");

        saya.add("E");
        saya.add("L");
        saya.add("Y");
        saya.add("A");
        saya.add("F");
        saya.add("I");
        saya.add("T");
        
        saya.addFirst("A");
        saya.addLast("B");
        // saya.add(1,"tes");
        // System.out.println(saya);

        // SOAL 2 ~ sisipkan ~
        saya.set(1,"B");
        saya.set(2,"R");
        saya.set(3,"A");
        saya.set(4,"H");
        
        System.out.println("Isi yang diUpdate ~SET~ : "+saya);

        // SOAL 3 ~ Remove ~
        // saya.remove();
        // saya.remove(2);
        // saya.remove("E");
        // saya.remove("L");
        saya.removeFirst();
        saya.removeLast();

        System.out.println("Isi yang diUpdate ~REMOVE~"+saya);

        // SOAL 4 ~ POP AND PUSH ~
        saya.pop();
        // saya.push("A");
        System.out.println("Isi yang diUpdate ~POP~"+saya);

        
    }
}