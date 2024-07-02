package dev.cb;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

public class TownSearchTest {

    private TownSearch classUnderTest;
    private String criteria;

    @Test
    public void should_Throw_Not_Found_Exception_When_Criteria_Size_Is_2() {
        // given
        classUnderTest = new TownSearch();
        criteria = "a";

        // when
        Throwable throwable = catchThrowable(() -> classUnderTest.search(criteria));

        // then
        assertThat(throwable).isInstanceOf(NotFoundException.class);
    }
}
