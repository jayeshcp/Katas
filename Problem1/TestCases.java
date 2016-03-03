import org.junit.Test;
import static org.junit.Assert.*;

public class TestCases {
  @Test
  public void test1() {
    assertTrue( MatchingBrackets.isBalanced("{([])}") );
  }
  
  @Test
  public void test2() {
    assertTrue( MatchingBrackets.isBalanced("{}()[]") );
  }
  
  @Test
  public void test3() {
    assertFalse( MatchingBrackets.isBalanced("{([})}") );
  }
  
  @Test
  public void test4() {
    assertFalse( MatchingBrackets.isBalanced("(") );
  }
  
  @Test
  public void test5() {
    assertFalse( MatchingBrackets.isBalanced("{") );
  }
  
  @Test
  public void test6() {
    assertFalse( MatchingBrackets.isBalanced("[") );
  }
  
  @Test
  public void test7() {
    assertFalse( MatchingBrackets.isBalanced(")") );
  }
  
  @Test
  public void test8() {
    assertFalse( MatchingBrackets.isBalanced("}") );
  }
  
  @Test
  public void test9() {
    assertFalse( MatchingBrackets.isBalanced("]") );
  }
  
  @Test
  public void test10() {
    assertTrue( MatchingBrackets.isBalanced("{([{{([{}()[]])}}({([{{([{{([{{([{}()[]])}}({([{{([{}()[]])}}()[]])})[{([{{([{}()[]])}}({([{{([{}()[]])}}()[]])})[]])}]])}}()[]])}}()[]])})[{([{{([{}()[]])}}({([{{([{}()[]])}}()[]])})[{([{{([{}()[]])}}({([{{([{}()[]])}}()[]])})[{([{{([{}()[]])}}({([{{([{}()[]])}}()[]])})[]])}]])}]])}]])}") );
  }
  
  @Test
  public void test11() {
    assertTrue( MatchingBrackets.isBalanced("") );
  }
}
