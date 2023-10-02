package collection;

import io.vavr.control.Option;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static basic.BasicTest.power;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Option<Double>> compute1(List<Integer> input) {
    return input.stream()
            .map(x ->power((x * 2) + 3, 5).map(inp -> Double.valueOf(inp)))
            .collect(Collectors.toList());
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    return input.stream().map(str ->{ str=str.substring(0, 1).toUpperCase() + str.substring(1);
    return str+=str;}).collect(Collectors.toList());  }

  public static void main(String[] args) {
    System.out.println(CollectionTest.compute2(Arrays.asList("sldkfj sdflkjs sdf")));
  }



}
