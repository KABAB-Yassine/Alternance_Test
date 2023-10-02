package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * alse return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n) {
    if (i == 0 && n < 0 || i<0) {
      return Option.none();
    }
    // Test sur la valeur de n
    int k = (n >= 0) ? n : -n;
    // Initialisation pour la variable de résultat
    int result = 1;

    for (int j = 0; j < k; j++) {
      result *= i;
    }
    //Test le cas ou l'entier est élevé
    if (result > Integer.MAX_VALUE) return Option.none();

    return n >= 0 ? Option.of(result) : Option.of(1 / (int) result);
  }
}
