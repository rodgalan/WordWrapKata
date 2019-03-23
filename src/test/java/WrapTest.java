import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WrapTest {

  @Test
  public void given_a_single_word_smaller_than_line_should_return_one_line() {
    String input = "word";
    int max_line_length = 10;
    String expected_output= "word";

    String output = Wrapper.execute(input, max_line_length);

    assertThat(output).isEqualTo(expected_output);
  }
}
