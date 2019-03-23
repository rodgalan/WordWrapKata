import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WrapTest {

  @Test
  public void given_a_single_word_smaller_than_line_should_return_one_line() {
    shouldReturnExpectedWrappedText(
        "word",
        "word",
        10);
  }

  @Test
  public void given_a_single_word_greather_than_line_should_return_two_lines() {
    shouldReturnExpectedWrappedText(
        "expected",
        "expec\nted",
        5);
  }

  @Test
  public void given_a_single_word_equals_than_line_should_return_one_line() {
    shouldReturnExpectedWrappedText(
        "word",
        "word",
        4);
  }

  @Test
  public void given_three_words_with_same_length_than_line_should_return_three_lines() {
    shouldReturnExpectedWrappedText(
        "word1 word2 word3",
        "word1\nword2\nword3",
        5);
  }

  @Test
  public void should_wrap_text() {
    shouldReturnExpectedWrappedText(
        "this is my last test about word wrap kata",
        "this\nis my\nlast\ntest\nabout\nword\nwrap\nkata",
        5);
  }

  private void shouldReturnExpectedWrappedText(String input, String expected_output, int max_line_length) {
    String output = Wrapper.execute(input, max_line_length);
    assertThat(output).isEqualTo(expected_output);
  }

}
