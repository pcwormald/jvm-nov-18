package pcwormald;

//modified from source https://www.infoq.com/articles/Graal-Java-JIT-Compiler

public final class StringHash {

  public static void main(String[] args) {

    long now;
    char[] chars;

    for (int i=1; i<200_000_000; i+=10_000_000) {
      chars = new char[i];
      java.util.Arrays.fill(chars,'x');
      now = System.nanoTime();
      chars.hashCode();
      System.out.println("Length: "+ i +" took: "+ (System.nanoTime() - now) +" ns");
    }
  }
}



