package pcwormald;

//modified from source https://www.infoq.com/articles/Graal-Java-JIT-Compiler

public final class StringHash {

  public static void main(String[] args) {

    for (int i=1; i<2_000_000_000; i+=1_000_000) {
      final long now = System.nanoTime();
      char[] chars = new char[i];
      java.util.Arrays.fill(chars,'x');
      new String(chars).hashCode();
      System.out.println("Length: "+ i +" took: "+ (System.nanoTime() - now) +" ns");
    }


  }
}



