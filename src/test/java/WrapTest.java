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

  @Test
  public void given_a_single_word_greather_than_line_should_return_two_lines() {
    String input = "expected";
    int max_line_length = 5;
    String expected_output = "expec\nted";

    String output = Wrapper.execute(input, max_line_length);

    assertThat(output).isEqualTo(expected_output);
  }

  @Test
  public void given_a_single_word_equals_than_line_should_return_one_line() {
    String input = "word";
    int max_line_length = 4;
    String expected_output= "word";

    String output = Wrapper.execute(input, max_line_length);

    assertThat(output).isEqualTo(expected_output);
  }

  @Test
  public void given_three_words_with_same_length_than_line_should_return_three_lines() {
    String input = "word1 word2 word3";
    int max_line_length = 5;
    String expected_output = "word1\nword2\nword3";

    String output = Wrapper.execute(input, max_line_length);

    assertThat(output).isEqualTo(expected_output);
  }

  @Test
  public void should_wrap_text() {
    String input = "this is my last test about word wrap kata";
    int max_line_length = 5;
    String expected_output = "this\nis my\nlast\ntest\nabout\nword\nwrap\nkata";

    String output = Wrapper.execute(input, max_line_length);

    assertThat(output).isEqualTo(expected_output);
  }

}
