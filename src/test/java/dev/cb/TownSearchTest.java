package dev.cb;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.*;

public class TownSearchTest {

    private TownSearch classUnderTest;
    private String criteria;

    @BeforeEach
    public void setUp() {
        classUnderTest = new TownSearch();
    }

    @Test
    public void should_Throw_Not_Found_Exception_When_Criteria_Size_Is_2() {
        // given
        criteria = "a";

        // when
        Throwable throwable = catchThrowable(() -> classUnderTest.search(criteria));

        // then
        assertThat(throwable).isInstanceOf(NotFoundException.class);
    }

    @Test
    public void towns_Should_Contain_Valence_And_Vancouver_When_Criteria_Is_Va() {
        // given
        criteria = "Va";
        List<String> expected = Arrays.asList("Valence", "Vancouver");

        // when
        List<String> result = classUnderTest.search(criteria);

        // then
        assertThat(result.contains(expected)).isTrue();
    }
}
