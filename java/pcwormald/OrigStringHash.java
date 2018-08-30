package pcwormald;

// modified from https://www.infoq.com/articles/Graal-Java-JIT-Compiler

public final class OrigStringHash {

    public static void main(String[] args) {
        OrigStringHash sh = new OrigStringHash();
        sh.run();
    }

    void run() {
        for (int i=1; i<2_000; i++) {
            timeHashing(i, 'x');
        }
    }

    void timeHashing(int length, char c) {
        final StringBuilder sb = new StringBuilder();
        for (int j = 0; j < length  * 1_000_000; j++) {
            sb.append(c);
        }
        final String s = sb.toString();
        final long now = System.nanoTime();
        final int hash = s.hashCode();
        final long duration = System.nanoTime() - now;
        System.out.println("Length: "+ length +" took: "+ duration +" ns");
    }
}
