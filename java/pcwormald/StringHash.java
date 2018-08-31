package pcwormald;

//modified from source https://www.infoq.com/articles/Graal-Java-JIT-Compiler

public final class StringHash {

  public static void main(String[] args) {

    long now;
    char[] chars;
    String str;

    for (int i=1; i<200_000_000; i+=10_000_000) {
      chars = new char[i];
      java.util.Arrays.fill(chars,'x');
      str = new String(chars);
      now = System.nanoTime();
      str.hashCode();
      System.out.println("Length: "+ i +" took: "+ (System.nanoTime() - now) +" ns");
    }
  }
}



