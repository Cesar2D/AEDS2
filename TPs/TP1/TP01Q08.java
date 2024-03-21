import java.io.RandomAccessFile;

public class TP01Q08 {

    static void escreveArquivo(int n, String nomeArquivo) throws Exception {
        RandomAccessFile arq = new RandomAccessFile("saida.txt", "rw");
        for (int i = 0; i < n; i++) {
            arq.writeDouble(MyIO.readDouble());
        }
        arq.close();

    }

    static void leArquivo(int n, String nomeArquivo) throws Exception {
        RandomAccessFile arq = new RandomAccessFile("saida.txt", "r");
        double value;
        for (int i = 8 * (n - 1); i >= 0; i -= 8) {
            arq.seek(i);
            value = arq.readDouble();
            if (value == (int) value) {
                MyIO.println((int) value);
            } else {
                MyIO.println(value);
            }
        }
        arq.close();
    }

    public static void main(String[] args) {
        String out = "saida.txt";
        int num = MyIO.readInt();
        try {
            escreveArquivo(num, out);
            leArquivo(num, out);
        } catch (Exception e) {
            MyIO.println(e.toString());
        }

    }
}